package com.lehteypzzz.wxapp.Entity.DO;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "USER")
public class UserDO {
    @Id
    @Column(name="OPEN_ID")
    private String openID;

    @Column(name = "NICK_NAME")
    private String nickName;

    @Column(name = "GENDER")
    private Integer gender;

    @Column(name = "LANGUAGE")
    private String language;

    @Column(name = "CITY")
    private String city;

    @Column(name = "PROVINCE")
    private String province;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "AVATAR_URL")
    private String avatarUrl;

    @Column(name = "TOKEN")
    private String token;
}
