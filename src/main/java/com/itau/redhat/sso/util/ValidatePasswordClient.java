package com.itau.redhat.sso.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;

import com.itau.redhat.sso.commoncannonical.schemas.CustIdType;
import com.itau.redhat.sso.commoncannonical.schemas.HeaderRequestType;
import com.itau.redhat.sso.commoncannonical.schemas.MessageHeaderType;
import com.itau.redhat.sso.commoncannonical.schemas.MessageInfoType;
import com.itau.redhat.sso.commoncannonical.schemas.MessageKeyType;
import com.itau.redhat.sso.commoncannonical.schemas.UserType;

import co.com.itau.services.security.validatepassword.v1.schemas.Body;
import co.com.itau.services.security.validatepassword.v1.schemas.BodyCL;
import co.com.itau.services.security.validatepassword.v1.schemas.DoValidatePasswordRqType;
import co.com.itau.services.security.validatepassword.v1.schemas.DoValidatePasswordRsType;
import co.com.itau.services.security.validatepassword.v1.schemas.Envelope;
import co.com.itau.services.security.validatepassword.v1.schemas.EnvelopeCL;
import co.com.itau.services.security.validatepassword.v1.schemas.EnvelopeRCL;
import co.com.itau.services.security.validatepassword.v1.schemas.EnvelopeRS;
import co.com.itau.services.security.validatepassword.v1.schemas.GetCustomerLoginRq;
import co.com.itau.services.security.validatepassword.v1.schemas.GetCustomerLoginRs;

public class ValidatePasswordClient {

	private static DoValidatePasswordRqType request = new DoValidatePasswordRqType();
	private static HeaderRequestType headerRequest = new HeaderRequestType();
	private static MessageHeaderType messageHeader = new MessageHeaderType();
	private static MessageKeyType messageKey = new MessageKeyType();
	private static MessageInfoType messageInfo = new MessageInfoType();
	private static CustIdType custId = new CustIdType();
	private static String urlDoValidatePassword = System.getenv("SSO_URL_VALIDATE_PASSWORD");
	private static String urlCustomerLogin = System.getenv("SSO_URL_CUSTOMER_LOGIN");
	private static String originatorName = System.getenv("SSO_ORIGINATOR_NAME");
	private static String originatorType = System.getenv("SSO_ORIGINATOR_TYPE");

	private static Logger logger = Logger.getLogger(ValidatePasswordClient.class);
	
	private ValidatePasswordClient() {
		
	}

	public static DoValidatePasswordRsType consumeWSValidatePassword(String usuario, String password) {
		logger.info("Preparando para consumo de WS. ValidatePasswordClient.consumeWSValidatePassword");
		DoValidatePasswordRsType response = new DoValidatePasswordRsType();

		messageKey.setRequestUUID(Util.getUUID());

		messageInfo.setDateTime(Util.getDateTime());
		messageInfo.setSystemId("");
		messageInfo.setOriginatorName(originatorName);
		messageInfo.setOriginatorType(Long.valueOf(originatorType));
		messageInfo.setTerminalId(Util.getIpAdrress());
		messageInfo.setSystemId("");
		messageHeader.setMessageKey(messageKey);
		messageHeader.setMessageInfo(messageInfo);

		headerRequest.setMessageHeader(messageHeader);

		custId.setCustLoginId(usuario);

		request.setHeaderRequest(headerRequest);
		request.setCustId(custId);
		request.setPswd(password);

		try {
			logger.info("Consumiendo WS OSB ValidatePassword Version de prueba 1.0, request: "
					+ Util.convertDtoToXmlString(request));

			Envelope env = new Envelope();
			env.setHeaders("");
			Body body = new Body();
			body.setDoValidatePasswordRqType(request);
			env.setBody(body);
			String xmlT = ClientHTTP.consumeService(Util.convertDtoToXmlString(env),urlDoValidatePassword);
			logger.info("Response XML Data: " + xmlT);
			EnvelopeRS envRs = JAXB.unmarshal(new ByteArrayInputStream(xmlT.getBytes(StandardCharsets.UTF_8)),
					EnvelopeRS.class);
			response = envRs.getBody().getDoValidatePasswordRsType();
		} catch (Exception e) {
			logger.error("Error consumiendo Web Service ValidatePassword 1.0: ", e);
		}
		return response;
	}

	public static GetCustomerLoginRs consumeWScustomerLogin(String usuario) throws IOException, JAXBException {
		HeaderRequestType headerRequest = new HeaderRequestType();
		MessageHeaderType messageHeader = new MessageHeaderType();
		MessageKeyType messageKey = new MessageKeyType();
		MessageInfoType messageInfo = new MessageInfoType();
		UserType userType = new UserType();
		GetCustomerLoginRq request = new GetCustomerLoginRq();
		EnvelopeCL env = new EnvelopeCL();
		BodyCL body = new BodyCL();
		messageKey.setRequestUUID(Util.getUUID());
		messageInfo.setDateTime(Util.getDateTime());
		messageInfo.setSystemId("");
		messageInfo.setOriginatorName(originatorName);
		messageInfo.setOriginatorType(Long.valueOf(originatorType));
		messageInfo.setTerminalId(Util.getIpAdrress());
		messageHeader.setMessageKey(messageKey);
		messageHeader.setMessageInfo(messageInfo);
		headerRequest.setMessageHeader(messageHeader);
		userType.setUserName(usuario);
		headerRequest.setUser(userType);
		request.setHeaderRequest(headerRequest);
		body.setGetCustomerLoginRq(request);
		env.setBody(body);
		env.setHeaders("");
		logger.info("URL: "+ urlCustomerLogin);
		String xml = ClientHTTP.consumeService(Util.convertDtoToXmlString(env),urlCustomerLogin);
		JAXBContext context = JAXBContext.newInstance(EnvelopeRCL.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		unmarshaller.setEventHandler(new javax.xml.bind.helpers.DefaultValidationEventHandler());

		EnvelopeRCL envRes =(EnvelopeRCL) unmarshaller.unmarshal(new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8)));
		logger.info("Termino de consumir el servicio");
		return envRes.getBody().getGetCustomerLoginRs();
	}

}
