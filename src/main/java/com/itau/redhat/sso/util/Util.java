package com.itau.redhat.sso.util;

import java.io.StringWriter;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.GregorianCalendar;
import java.util.UUID;

import javax.xml.bind.JAXB;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;
import org.bouncycastle.util.encoders.Hex;

public class Util {

	private static Logger LOG = Logger.getLogger(Util.class);

	public static XMLGregorianCalendar getDateTime() {
		try {
			GregorianCalendar gcal = new GregorianCalendar();
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
		} catch (Exception e) {
			LOG.error("Error obteniendo fecha: " + e.toString());
			return null;
		}

	}

	public static String getIpAdrress() {
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			return inetAddress.getHostAddress();
		} catch (Exception e) {
			LOG.error("Error obteniendo ip adress: " + e.toString());
			return "";
		}

	}

	public static String getUUID() {
		return UUID.randomUUID().toString();
	}

	public static String convertDtoToXmlString(Object o) {
		try {
			StringWriter sw = new StringWriter();
			JAXB.marshal(o, sw);
			return sw.toString();
		} catch (Exception e) {
			return "";
		}

	}
	
	public static String getHashMD5(String val) throws NoSuchAlgorithmException {
		MessageDigest messageDigest = MessageDigest.getInstance("MD5");
		byte[] array = messageDigest.digest(val.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < array.length; ++i) {
          sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
       }
        return sb.toString();
		
	}

}
