package com.itau.redhat.sso.util;

import java.io.StringWriter;
import java.net.InetAddress;
import java.util.GregorianCalendar;
import java.util.UUID;

import javax.xml.bind.JAXB;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;

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

}
