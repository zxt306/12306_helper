package com.fan.tickets.util;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.ssl.SSLContextBuilder;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * //TODO
 *
 * @author TZX
 * @Date 2017/9/17 16:21
 **/
public class TrustCertUtils {


    public static SSLConnectionSocketFactory createSSLConnection(){

        File file = new File("F:\\srca12306\\12306.jks");
        try {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            FileInputStream inputStream = new FileInputStream(file);
            keyStore.load(inputStream, "123456".toCharArray());
            SSLContext sslContext = SSLContextBuilder.create().loadTrustMaterial(keyStore,new TrustSelfSignedStrategy()).build();
            SSLConnectionSocketFactory socketFactory =  new SSLConnectionSocketFactory(sslContext, new X509HostnameVerifier() {
                @Override
                public void verify(String host, SSLSocket ssl) throws IOException {

                }

                @Override
                public void verify(String host, X509Certificate cert) throws SSLException {

                }

                @Override
                public void verify(String host, String[] cns, String[] subjectAlts) throws SSLException {

                }

                @Override
                public boolean verify(String s, SSLSession sslSession) {
                    System.out.println(s);
                    return true;
                }
            });
            return socketFactory;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (CertificateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
        return null;
    }
}
