package com.itau.redhat.sso.util;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.JAXB;

import org.apache.log4j.Logger;

import com.itau.redhat.sso.commoncannonical.schemas.CustIdType;
import com.itau.redhat.sso.commoncannonical.schemas.HeaderRequestType;
import com.itau.redhat.sso.commoncannonical.schemas.MessageHeaderType;
import com.itau.redhat.sso.commoncannonical.schemas.MessageInfoType;
import com.itau.redhat.sso.commoncannonical.schemas.MessageKeyType;


import co.com.itau.services.security.validatepassword.v1.schemas.Body;
import co.com.itau.services.security.validatepassword.v1.schemas.DoValidatePasswordRqType;
import co.com.itau.services.security.validatepassword.v1.schemas.DoValidatePasswordRsType;
import co.com.itau.services.security.validatepassword.v1.schemas.Envelope;
import co.com.itau.services.security.validatepassword.v1.schemas.EnvelopeRS;


public class ValidatePasswordClient {


	private static DoValidatePasswordRqType request = new DoValidatePasswordRqType();
	private static HeaderRequestType headerRequest = new HeaderRequestType();
	private static MessageHeaderType messageHeader = new MessageHeaderType();
	private static MessageKeyType messageKey = new MessageKeyType();
	private static MessageInfoType messageInfo = new MessageInfoType();
	private static CustIdType custId = new CustIdType();

	private static Logger LOG = Logger.getLogger(ValidatePasswordClient.class);

	public static DoValidatePasswordRsType consumeWSValidatePassword(String usuario, String password) {
		LOG.info("Preparando para consumo de WS. ValidatePasswordClient.consumeWSValidatePassword");
		DoValidatePasswordRsType response = new DoValidatePasswordRsType();

		messageKey.setRequestUUID(Util.getUUID());

		messageInfo.setDateTime(Util.getDateTime());
		messageInfo.setSystemId("");
		messageInfo.setOriginatorName(Constant.ORIGINATOR_NAME);
		messageInfo.setOriginatorType(Constant.ORIGINATOR_TYPE);
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
			LOG.info("Consumiendo WS OSB ValidatePassword, request: " + Util.convertDtoToXmlString(request));
			
			Envelope env = new Envelope();
			env.setHeaders("");
			Body body = new Body();
			body.setDoValidatePasswordRqType(request);
			env.setBody(body);
			String xmlT = ClientHTTP.consumeService(Util.convertDtoToXmlString(env));
			LOG.info("Response XML Data: " + xmlT);
			EnvelopeRS envRs = JAXB.unmarshal(new ByteArrayInputStream(xmlT.getBytes(StandardCharsets.UTF_8)), EnvelopeRS.class);
			response = envRs.getBody().getDoValidatePasswordRsType();
		} catch (Exception e) {
			LOG.error("Error consumiendo Web Service ValidatePassword: " , e);
		}
		return response;
	}

}
