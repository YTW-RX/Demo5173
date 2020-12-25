package com.example.demo.dao;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author 殷涛文
 */
public class User {
    private Integer userId;

    private String userName;

    private String userPwd;

    private String userRealname;

    private String userCard;

    private String userPhone;

    @JsonFormat(pattern = "MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date userCreatetime;

    private String userState;

    public User(Integer userId, String userName, String userPwd, String userRealname, String userCard, String userPhone, Date userCreatetime, String userState) {
        this.userId = userId;
        this.userName = userName;
        this.userPwd = userPwd;
        this.userRealname = userRealname;
        this.userCard = userCard;
        this.userPhone = userPhone;
        this.userCreatetime = userCreatetime;
        this.userState = userState;
    }

    public User() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserRealname() {
        return userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname;
    }

    public String getUserCard() {
        return userCard;
    }

    public void setUserCard(String userCard) {
        this.userCard = userCard;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Date getUserCreatetime() {
        return userCreatetime;
    }

    public void setUserCreatetime(Date userCreatetime) {
        this.userCreatetime = userCreatetime;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }
}