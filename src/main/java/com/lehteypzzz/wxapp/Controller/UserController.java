package com.lehteypzzz.wxapp.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lehteypzzz.wxapp.Entity.DO.UserDO;
import com.lehteypzzz.wxapp.Service.UserService;
import com.lehteypzzz.wxapp.Utils.HttpRequestUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("user")
public class UserController {
    final
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     *
     * @param code 临时登录凭证
     * @param rawData 用户信息
     * @return token
     */
    @RequestMapping("login")
    @ResponseBody
    public String GetToken(String code, String rawData) throws JsonProcessingException {
        String urlPath = "https://api.weixin.qq.com/sns/jscode2session" +   // code2session接口
                // appId
                String.format("?appid=%s", "wxd14ea32dcae0ae59") +
                //appSecret
                String.format("&secret=%s", "6e91d62b34a6309dfbd4def1556f2399") +
                // code
                String.format("&js_code=%s", code) +
                // 固定值
                String.format("&grant_type=%s", "authorization_code");
        String data = HttpRequestUtils.sendPost(urlPath);   // 返回openid session_key
        System.out.println(data);
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(data);          // 读取Json
        String openid = rootNode.path("openid").asText();
        // openid作为用户唯一标识
        UserDO user = userService.findOneById((openid));
        if(user==null)
        {//  存用户
            // 生成token UUID
            String token = UUID.randomUUID().toString();
            userService.saveRawDataAndOpenId(rawData, openid, token);
            return token;
        }else{
            // 用户存在
            return user.getToken();     //返回token
        }
    }
}

