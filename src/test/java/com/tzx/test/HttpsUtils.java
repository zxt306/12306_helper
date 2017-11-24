package com.tzx.test;

import com.alibaba.fastjson.JSONObject;
import com.fan.tickets.domain.QueryResultDTO;
import com.fan.tickets.util.TrustCertUtils;
import junit.framework.TestCase;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.SSLContext;
import java.net.URLDecoder;
import java.security.NoSuchAlgorithmException;

/**
 * //TODO
 *
 * @author TZX
 * @Date 2017/9/17 16:01
 **/
public class HttpsUtils extends TestCase{

    public void testHttps(){
        String httpsUrl = "https://kyfw.12306.cn/otn/leftTicket/queryX?leftTicketDTO.train_date=2017-09-19&leftTicketDTO.from_station=WHN&leftTicketDTO.to_station=GNN&purpose_codes=ADULT";

        HttpClient httpClient = HttpClientBuilder.create().setSSLSocketFactory(TrustCertUtils.createSSLConnection()).build();
        HttpGet get = new HttpGet(httpsUrl);
        try {
            HttpResponse httpResponse =  httpClient.execute(get);
            if(httpResponse.getStatusLine().getStatusCode()==200){
              String json =   EntityUtils.toString(httpResponse.getEntity());
                System.out.println(json);
                QueryResultDTO queryResult = JSONObject.parseObject(json, QueryResultDTO.class);
                System.out.println(queryResult.getData().getResult().size());

            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
