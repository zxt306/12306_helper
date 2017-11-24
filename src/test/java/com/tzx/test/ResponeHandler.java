package com.tzx.test;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.entity.StringEntity;

import java.io.IOException;

/**
 * //TODO
 *
 * @author TZX
 * @Date 2017/9/17 14:53
 **/
public class ResponeHandler implements ResponseHandler{
    @Override
    public Object handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
        HttpEntity httpEntity = response.getEntity();
        if(httpEntity instanceof StringEntity){
        }
        System.out.println(response.getEntity());
        return null;
    }
}
