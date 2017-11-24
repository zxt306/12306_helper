package com.tzx.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

import javax.net.ssl.SSLContext;

import junit.framework.TestCase;

import org.apache.http.client.HttpClient;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;



public class URLConnection extends TestCase{


	public void testUrlConnection(){
		HttpClient ttp =null;
		try {
			KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
			FileInputStream inputStream = new FileInputStream(new File("F:\\srca12306\\22222.cer"));
			keyStore.load(inputStream, "123".toCharArray());
//			SSLContext sslContext =org.apache.http.conn.ssl.SSLContexts.custom().loadTrustMaterial(keyStore).build();
			SSLContext sslContext  = SSLContexts.custom().loadTrustMaterial(keyStore,  new TrustSelfSignedStrategy()).build();
			// 只允许使用TLSv1协议
			SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext, new String[] {SSLConnectionSocketFactory.TLS }, null,
					SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
			ttp = HttpClients.custom().setSSLSocketFactory(sslsf).build();

		} catch (KeyStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CertificateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (KeyManagementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
