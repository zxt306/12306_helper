package com.tzx.test;

import junit.framework.TestCase;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.KeyStore;

public class HttpTest extends TestCase {

	public void testHttp(){
//		HttpClient ttp = HttpClients.createDefault();
		String myStore = "E:/02软件/jdk1.6.0_10/jre/lib/security/cacerts";
		HttpClient ttp = new DefaultHttpClient();
		//获得密匙库
		KeyStore trustStore;
		try {
			trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
			FileInputStream instream = new FileInputStream(new File(myStore));
			//密匙库的密码
			trustStore.load(instream, "changeit".toCharArray());
			//注册密匙库
			SSLSocketFactory socketFactory = new SSLSocketFactory(trustStore);
			//不校验域名
			socketFactory.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
			Scheme sch = new Scheme("https", 443, socketFactory);
			ttp.getConnectionManager().getSchemeRegistry().register(sch);
			HttpGet httpGet = new HttpGet("https://kyfw.12306.cn/otn/passcodeNew/getPassCodeNew?module=login&rand=sjrand&11");
			CloseableHttpResponse rep =   (CloseableHttpResponse) ttp.execute(httpGet);
			HttpEntity ttpEntity =rep.getEntity();
			InputStream ins = ttpEntity.getContent();
			byte[] img = IOUtils.toByteArray(ins);
			FileOutputStream ous = new FileOutputStream(new File("c:/dd.jpeg"));
			ous.write(img);
			ous.close();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}


}
