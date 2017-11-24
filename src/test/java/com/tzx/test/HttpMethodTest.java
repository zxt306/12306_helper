package com.tzx.test;

import junit.framework.TestCase;
import org.apache.http.Header;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.AutoRetryHttpClient;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;

/**
 * //TODO
 *
 * @author TZX
 * @Date 2017/9/17 13:03
 **/
public class HttpMethodTest extends TestCase {

    public void testMethod(){
//        HttpClient httpClient = new AutoRetryHttpClient();
        HttpGet method = new HttpGet("http://www.apache.org/");
        CloseableHttpClient httpClient =HttpClientBuilder.create().build();
        ResponeHandler handler = new ResponeHandler();
        Header[] headers = method.getAllHeaders();
        for(Header header:headers){
            System.out.println(header.toString());
        }
        try {
            httpClient.execute(method,handler);
            System.out.println(method.getProtocolVersion());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
