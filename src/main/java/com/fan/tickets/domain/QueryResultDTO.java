package com.fan.tickets.domain;

/**
 * @author TZX
 * @Date 2017/9/17 17:45
 **/
public class QueryResultDTO{
     private String validateMessagesShowId;
     /**查询状态**/
     private boolean status;
     /**http状态**/
     private int httpstatus;
     private QuerySubResultDTO data;
     private String[] messages;
     private Object validateMessages;


    public String getValidateMessagesShowId() {
        return validateMessagesShowId;
    }

    public void setValidateMessagesShowId(String validateMessagesShowId) {
        this.validateMessagesShowId = validateMessagesShowId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getHttpstatus() {
        return httpstatus;
    }

    public void setHttpstatus(int httpstatus) {
        this.httpstatus = httpstatus;
    }

    public QuerySubResultDTO getData() {
        return data;
    }

    public void setData(QuerySubResultDTO data) {
        this.data = data;
    }

    public String[] getMessages() {
        return messages;
    }

    public void setMessages(String[] messages) {
        this.messages = messages;
    }

    public Object getValidateMessages() {
        return validateMessages;
    }

    public void setValidateMessages(Object validateMessages) {
        this.validateMessages = validateMessages;
    }
}
