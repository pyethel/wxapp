package com.lehteypzzz.wxapp.DAO;

import com.lehteypzzz.wxapp.Entity.DO.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<UserDO, String> {
    UserDO findUserDOByOpenID(String id);
    UserDO findUserDOByToken(String token);
}
