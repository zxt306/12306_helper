package com.fan.tickets.condition;

/**
 * 登录条件
 * @author TZX
 * @Date 2017/9/17 21:18
 **/
public class LoginCondition {

    private String appid = "otn";
    private String password;
    private String username;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
