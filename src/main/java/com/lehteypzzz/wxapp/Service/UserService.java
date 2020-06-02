package com.lehteypzzz.wxapp.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lehteypzzz.wxapp.DAO.UserDAO;
import com.lehteypzzz.wxapp.Entity.DO.UserDO;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    final
    UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    public UserDO findOneById(String id){
        return userDAO.findUserDOByOpenID(id);
    }
    public void saveRawDataAndOpenId(String rawData, String openid, String token) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(rawData); // 读取Json
        // rootNode.path("xx")返回的还是一个JsonNode对象，调用该JsonNode的相应方法，得到键对应的值
        String nickName = rootNode.path("nickName").asText();
        Integer gender = rootNode.path("gender").asInt();
        String language = rootNode.path("language").asText();
        String city = rootNode.path("city").asText();
        String province = rootNode.path("province").asText();
        String country = rootNode.path("country").asText();
        String avatarUrl = rootNode.path("avatarUrl").asText();
        UserDO user = new UserDO();
        user.setOpenID(openid);
        user.setToken(token);
        user.setGender(gender);
        user.setCountry(country);
        user.setAvatarUrl(avatarUrl);
        user.setCity(city);
        user.setNickName(nickName);
        user.setLanguage(language);
        user.setProvince(province);
        userDAO.save(user);
    }
    public UserDO findOneByToken(String token){
        return userDAO.findUserDOByToken(token);
    }
}
