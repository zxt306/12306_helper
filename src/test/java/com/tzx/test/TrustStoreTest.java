package com.tzx.test;

import com.fan.tickets.util.TrustCertUtils;
import junit.framework.TestCase;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;

/**
 * //TODO
 *
 * @author TZX
 * @Date 2017/9/17 16:31
 **/
public class TrustStoreTest extends TestCase {

    public void testTrustStore(){
        SSLConnectionSocketFactory socketFactory =TrustCertUtils.createSSLConnection();
        System.out.println(socketFactory.toString());
    }
}
