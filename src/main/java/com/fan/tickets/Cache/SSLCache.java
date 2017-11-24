package com.fan.tickets.Cache;

import com.fan.tickets.util.TrustCertUtils;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;

/**
 * //TODO
 *
 * @author TZX
 * @Date 2017/9/20 13:44
 **/
public class SSLCache {

    /***
     * 获取证书的SSL
     * @return
     */
    public static SSLConnectionSocketFactory getSSLCache(){
        return TrustCertUtils.createSSLConnection();
    }
}
