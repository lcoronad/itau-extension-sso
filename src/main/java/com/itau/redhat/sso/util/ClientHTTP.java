package com.itau.redhat.sso.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class ClientHTTP {
	
	private ClientHTTP() {
		
	}

	public static String consumeService(String xml,String urlInput) throws IOException {
		StringBuilder sbBuilder = new StringBuilder();
		try {
			System.out.println(xml);
			URL url = new URL(urlInput);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Accept", "application/xml");
			conn.setRequestProperty("Content-Type", "application/xml");
			conn.setDoOutput(true);
			OutputStream ou = conn.getOutputStream();
			ou.write(xml.getBytes(StandardCharsets.UTF_8));
			
			InputStreamReader in = new InputStreamReader(conn.getInputStream());
			BufferedReader br = new BufferedReader(in);
			String output;
			
			while ((output = br.readLine()) != null) {
				sbBuilder.append(output.trim());
			}
			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return sbBuilder.toString();
	}

}
