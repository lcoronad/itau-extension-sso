package com.itau.redhat.sso.util;

import java.io.StringWriter;

import javax.xml.bind.JAXB;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import com.itau.redhat.sso.commoncannonical.schemas.CustIdType;
import com.itau.redhat.sso.commoncannonical.schemas.HeaderRequestType;
import com.itau.redhat.sso.commoncannonical.schemas.MessageHeaderType;
import com.itau.redhat.sso.commoncannonical.schemas.MessageInfoType;
import com.itau.redhat.sso.commoncannonical.schemas.MessageKeyType;

import co.com.itau.services.security.validatepassword.v1.definitions.ValidatePasswordBindingQSService;
import co.com.itau.services.security.validatepassword.v1.definitions.ValidatePasswordPortType;
import co.com.itau.services.security.validatepassword.v1.schemas.DoValidatePasswordRqType;
import co.com.itau.services.security.validatepassword.v1.schemas.DoValidatePasswordRsType;


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
			
			ValidatePasswordPortType port = service.getValidatePasswordBindingQSPort();
			
			String endpointURL = "http://10.186.11.91:24200/services/security/ValidatePassword";
			BindingProvider bp = (BindingProvider) port;
			bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointURL);
			
			response = port.doValidatePassword(request);
			
			LOG.info("Web Service consumido exitosamente, response: "+ Util.convertDtoToXmlString(response));
		} catch (Exception e) {
			LOG.error("Error consumiendo Web Service ValidatePassword: " , e);
		}
		return response;
	}

}
