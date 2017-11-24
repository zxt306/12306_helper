package com.fan.tickets.condition;

/**
 * 验证码校验
 * @author TZX
 * @Date 2017/9/17 21:17
 **/
public class CaptchaCheckCondition {

    private String answer;
    private String login_site;
    private String rand;


    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getLogin_site() {
        return login_site;
    }

    public void setLogin_site(String login_site) {
        this.login_site = login_site;
    }

    public String getRand() {
        return rand;
    }

    public void setRand(String rand) {
        this.rand = rand;
    }
}
