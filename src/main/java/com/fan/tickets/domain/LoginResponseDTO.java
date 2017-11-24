package com.fan.tickets.domain;

/**
 * //TODO
 *
 * @author TZX
 * @Date 2017/9/17 21:22
 **/
public class LoginResponseDTO {

    private String result_message;

    private String result_code;

    private String uamtk;

    public String getResult_message() {
        return result_message;
    }

    public void setResult_message(String result_message) {
        this.result_message = result_message;
    }

    public String getResult_code() {
        return result_code;
    }

    public void setResult_code(String result_code) {
        this.result_code = result_code;
    }

    public String getUamtk() {
        return uamtk;
    }

    public void setUamtk(String uamtk) {
        this.uamtk = uamtk;
    }
}
