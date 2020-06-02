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

    @RequestMapping("login")
    @ResponseBody
    public String GetToken(String code, String rawData) throws JsonProcessingException {
        String urlPath = "https://api.weixin.qq.com/sns/jscode2session" +   // code2session接口
                String.format("?appid=%s", "wxd14ea32dcae0ae59") +  // appId
                String.format("&secret=%s", "6e91d62b34a6309dfbd4def1556f2399") +   //appSecret
                String.format("&js_code=%s", code) +    // code
                String.format("&grant_type=%s", "authorization_code");// 固定值
        String data = HttpRequestUtils.sendPost(urlPath);
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(data); // 读取Json
        String openid = rootNode.path("openid").asText();   // openid作为用户唯一标识
        UserDO user = userService.findOneById((openid));
        if(user==null)
        {//  存用户
            String token = UUID.randomUUID().toString();    // 生成token
            userService.saveRawDataAndOpenId(rawData, openid, token);
            return token;
        }else{
            // 用户存在
            System.out.println(user.getToken());
            return user.getToken();     //返回token
        }
    }
}

