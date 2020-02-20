package com.itau.redhat.sso.provider.user;

import java.io.StringWriter;
import java.net.UnknownHostException;
import java.util.UUID;

import javax.xml.bind.JAXB;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.ws.BindingProvider;

import com.itau.redhat.sso.commoncannonical.schemas.CustIdType;
import com.itau.redhat.sso.commoncannonical.schemas.HeaderRequestType;
import com.itau.redhat.sso.commoncannonical.schemas.MessageHeaderType;
import com.itau.redhat.sso.commoncannonical.schemas.MessageInfoType;
import com.itau.redhat.sso.commoncannonical.schemas.MessageKeyType;
import com.itau.redhat.sso.commoncannonical.schemas.SignOnCustomerInfoType;
import com.itau.redhat.sso.util.Util;

import co.com.itau.services.security.validatepassword.v1.definitions.ValidatePasswordBindingQSService;
import co.com.itau.services.security.validatepassword.v1.definitions.ValidatePasswordPortType;
import co.com.itau.services.security.validatepassword.v1.schemas.DoValidatePasswordRqType;
import co.com.itau.services.security.validatepassword.v1.schemas.DoValidatePasswordRsType;

public class TestCryptoChannelTools {

	private static String SECURITY_CHANNELLOGINPN_IPCRYPTO = "boinfspt1";
	private static String SECURITY_CHANNELLOGINPN_PORTCRYPTO = "23456";
	private static String RESPUESTA_OK_CRYPTOUTILS = "S|Login Correct";

	public static void main(String args[]) throws UnknownHostException, DatatypeConfigurationException {
		// String usuario = args[0];
//		String password = args[1];
//		
//		TestCryptoChannelTools testCryptoChannelTools = new TestCryptoChannelTools( );
//		testCryptoChannelTools.validarUsuario( usuario, password );
//		testCryptoChannelTools.consultarDatosUsuarioItau( );
		System.out.println("TestCryptoChannelTools.main Respuesta de CryptoUtils que llego: ");

//    	boolean userValid = respuesta.equals( RESPUESTA_OK_CRYPTOUTILS );
		boolean userValid = true;

		System.out.println("TestCryptoChannelTools.main Usuario valido: " + userValid);
		try {
			ValidatePasswordBindingQSService service = new ValidatePasswordBindingQSService();
			DoValidatePasswordRqType request = new DoValidatePasswordRqType();
			HeaderRequestType headerRequest = new HeaderRequestType();
			MessageHeaderType messageHeader = new MessageHeaderType();
			MessageKeyType messageKey = new MessageKeyType();
			messageKey.setRequestUUID(UUID.randomUUID().toString());
			messageHeader.setMessageKey(messageKey);

			MessageInfoType messageInfo = new MessageInfoType();
			messageInfo.setDateTime(Util.getDateTime());
			messageInfo.setSystemId("");
			messageInfo.setOriginatorName("SSO");
			messageInfo.setOriginatorType(41);
			messageInfo.setTerminalId(Util.getIpAdrress());
			messageHeader.setMessageInfo(messageInfo);
			headerRequest.setMessageHeader(messageHeader);

			request.setHeaderRequest(headerRequest);
			
			CustIdType custIdType = new CustIdType();
			custIdType.setCustLoginId("U66858679_66858679");
						
			request.setCustId(custIdType);
			request.setPswd("Z53116596411533925435017819501166859346835089761847192521436625998716711342758l5499715286320399458504537550587554601402830205729707226869853281556880743267");
			StringWriter sw = new StringWriter();
			JAXB.marshal(request, sw);
			String xml = sw.toString();
			System.out.println(xml);
			ValidatePasswordPortType port = service.getValidatePasswordBindingQSPort();
			
			String endpointURL = "http://10.186.11.91:24200/services/security/ValidatePassword";
			BindingProvider bp = (BindingProvider) port;
			bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointURL);
			
			DoValidatePasswordRsType response = port.doValidatePassword(request);			
			System.out.println("Status CODE: " + response.getHeaderResponse().getStatus().getStatusCode());
			SignOnCustomerInfoType datosResponse = new SignOnCustomerInfoType();
			datosResponse = response.getSignOnCustomerInfo().getValue();
			System.out.println("Datos response: " + response.getHeaderResponse().getStatus().getStatusDesc());
			System.out.println("Datos cliente: " + datosResponse.getSignOnCustomerInfoRecord().getCustName().getValue());
		} catch (Exception e) {
			System.out.println("El error es: " + e.toString());
		}

	}

	private static void validarUsuario(String usuario, String password)
			throws DatatypeConfigurationException, UnknownHostException {
		// String respuesta = CryptChannelTools.validateLogin(
		// SECURITY_CHANNELLOGINPN_IPCRYPTO, SECURITY_CHANNELLOGINPN_PORTCRYPTO,
		// usuario, password );

		System.out.println("TestCryptoChannelTools.main Respuesta de CryptoUtils que llego: ");

//    	boolean userValid = respuesta.equals( RESPUESTA_OK_CRYPTOUTILS );
		boolean userValid = true;

		System.out.println("TestCryptoChannelTools.main Usuario valido: " + userValid);

		ValidatePasswordBindingQSService service = new ValidatePasswordBindingQSService();
		DoValidatePasswordRqType request = new DoValidatePasswordRqType();
		HeaderRequestType headerRequest = new HeaderRequestType();
		MessageHeaderType messageHeader = new MessageHeaderType();
		MessageKeyType messageKey = new MessageKeyType();
		messageKey.setRequestUUID(UUID.randomUUID().toString());
		messageHeader.setMessageKey(messageKey);

		MessageInfoType messageInfo = new MessageInfoType();
		messageInfo.setDateTime(Util.getDateTime());
		messageInfo.setOriginatorName("Portal");
		messageInfo.setOriginatorType(41);
		messageInfo.setTerminalId(Util.getIpAdrress());
		messageHeader.setMessageInfo(messageInfo);
		headerRequest.setMessageHeader(messageHeader);

		request.setHeaderRequest(headerRequest);
		DoValidatePasswordRsType response = service.getValidatePasswordBindingQSPort().doValidatePassword(request);
	
		System.out.println("Status CODE: " + response.getHeaderResponse().getStatus().getStatusCode());

	}


}
