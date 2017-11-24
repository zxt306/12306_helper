package com.fan.tickets.util;

import com.fan.tickets.Cache.SSLCache;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.Args;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Http各类请求方法
 * @author TZX
 * @Date 2017/9/20 13:35
 **/
public class HttpsRequestUtils {

   private final static Logger logger = LoggerFactory.getLogger(HttpsRequestUtils.class);


    public static HttpEntity invokeGet(String url){
        return invoke(url,"GET");
    }

    public static HttpEntity invokePost(String url){
        return invoke(url,"POST");
    }

    /**
     * 请求响应
     * @param url
     * @return
     */
    private static HttpEntity invoke(String url,String method){
        long startTime = System.currentTimeMillis();
        Args.notEmpty(url,"请求URL不能为空");
        HttpUriRequest uriRequest = null ;
        if("POST".equals(method)){
            uriRequest = new HttpPost(url);
        }else{
            uriRequest = new HttpGet(url);
        }
        HttpClient client = HttpClientBuilder.create().setSSLSocketFactory(SSLCache.getSSLCache()).build();
        try {
            HttpResponse httpResponse =  client.execute(uriRequest);
            logger.debug("URL 消息请求耗时："+(System.currentTimeMillis()-startTime));
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if(statusCode== 200){
                return httpResponse.getEntity();
            }else if(statusCode == 500 ||(statusCode>400&&statusCode<500)){
                throw new HttpResponseException(statusCode,"请求响应失败");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
