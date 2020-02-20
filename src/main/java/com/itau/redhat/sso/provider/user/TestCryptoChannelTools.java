package com.itau.redhat.sso.provider.user;

import java.io.StringWriter;
import java.net.UnknownHostException;
import java.util.UUID;

import javax.xml.bind.JAXB;
import javax.xml.datatype.DatatypeConfigurationException;

import com.itau.redhat.sso.commoncannonical.schemas.CustIdType;
import com.itau.redhat.sso.commoncannonical.schemas.HeaderRequestType;
import com.itau.redhat.sso.commoncannonical.schemas.MessageHeaderType;
import com.itau.redhat.sso.commoncannonical.schemas.MessageInfoType;
import com.itau.redhat.sso.commoncannonical.schemas.MessageKeyType;
import com.itau.redhat.sso.services.definitions.ValidatePasswordBindingQSService;
import com.itau.redhat.sso.services.schemas.DoValidatePasswordRqType;
import com.itau.redhat.sso.services.schemas.DoValidatePasswordRsType;
import com.itau.redhat.sso.util.Util;

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
			messageInfo.setOriginatorName("Portal");
			messageInfo.setOriginatorType(41);
			messageInfo.setTerminalId(Util.getIpAdrress());
			messageHeader.setMessageInfo(messageInfo);
			headerRequest.setMessageHeader(messageHeader);

			request.setHeaderRequest(headerRequest);
			
			CustIdType custIdType = new CustIdType();
			custIdType.setCustLoginId("1");
			custIdType.setCustPermId("123");
			custIdType.setCustType("1");
			custIdType.setSPName("jkhcsd");
			request.setCustId(custIdType);
			request.setPswd("Uds");
			StringWriter sw = new StringWriter();
			JAXB.marshal(request, sw);
			String xml = sw.toString();
			System.out.println(xml);
			DoValidatePasswordRsType response = service.getValidatePasswordBindingQSPort().doValidatePassword(request);			
			System.out.println("Status CODE: " + response.getHeaderResponse().getStatus().getStatusCode());
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

	private void consultarDatosUsuarioItau() {
		System.out.println("TestCryptoChannelTools.main Inicio a consultar datos");

		System.out.println("TestCryptoChannelTools.main Fin a consultar datos");
	}
}
