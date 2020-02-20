package com.itau.redhat.sso.util;

import java.io.StringWriter;

import javax.xml.bind.JAXB;

import org.apache.log4j.Logger;

import com.itau.redhat.sso.commoncannonical.schemas.CustIdType;
import com.itau.redhat.sso.commoncannonical.schemas.HeaderRequestType;
import com.itau.redhat.sso.commoncannonical.schemas.MessageHeaderType;
import com.itau.redhat.sso.commoncannonical.schemas.MessageInfoType;
import com.itau.redhat.sso.commoncannonical.schemas.MessageKeyType;
import com.itau.redhat.sso.services.definitions.ValidatePasswordBindingQSService;
import com.itau.redhat.sso.services.schemas.DoValidatePasswordRqType;
import com.itau.redhat.sso.services.schemas.DoValidatePasswordRsType;

public class ValidatePasswordClient {

	private static ValidatePasswordBindingQSService service = new ValidatePasswordBindingQSService();
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
		messageInfo.setOriginatorName(Constant.ORIGINATOR_NAME);
		messageInfo.setOriginatorType(Constant.ORIGINATOR_TYPE);
		messageInfo.setTerminalId(Util.getIpAdrress());

		messageHeader.setMessageKey(messageKey);
		messageHeader.setMessageInfo(messageInfo);

		headerRequest.setMessageHeader(messageHeader);

		custId.setCustLoginId(usuario);

		request.setHeaderRequest(headerRequest);
		request.setCustId(custId);
		request.setPswd(password);

		try {			
			LOG.info("Consumiendo WS OSB ValidatePassword, request: " + Util.convertDtoToXmlString(request));
			response = service.getValidatePasswordBindingQSPort().doValidatePassword(request);
			LOG.info("Web Service consumido exitosamente, response: "+ Util.convertDtoToXmlString(response));
		} catch (Exception e) {
			LOG.error("Error consumiendo Web Service ValidatePassword: " + e.toString());
		}
		return response;
	}

}
