package com.tzx.test;

import junit.framework.TestCase;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

/**
 * //TODO
 *
 * @author TZX
 * @Date 2017/9/17 20:23
 **/
public class CookieStoreTest extends TestCase{

    public void testCookie(){
        CookieStore cookieStore = new BasicCookieStore();
        HttpClient httpClient = HttpClients.custom().setDefaultCookieStore(cookieStore).build();
        HttpGet httpGet = new HttpGet("http://127.0.0.1:8099/ecas/index/html/index.html?_t=1505888459466");
        try {
            HttpResponse httpResponse = httpClient.execute(httpGet);
            System.out.println(cookieStore.getCookies().size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
