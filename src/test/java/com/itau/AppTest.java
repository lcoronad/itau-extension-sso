package com.itau;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Logger;

import javax.xml.bind.JAXBException;

import org.junit.Test;

import com.itau.redhat.sso.util.Util;
import com.itau.redhat.sso.util.ValidatePasswordClient;

import co.com.itau.services.security.validatepassword.v1.schemas.GetCustomerLoginRs;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	private Logger log = Logger.getLogger("Test");
	/**
	 * Rigorous Test :-)
	 * @throws IOException 
	 * @throws NoSuchAlgorithmException 
	 * @throws JAXBException 
	 */
	@Test
	public void buildXML() throws Exception {
		String username = "123456";
		GetCustomerLoginRs getCustomerLoginRs = ValidatePasswordClient.consumeWScustomerLogin(Util.getHashMD5(username));
		log.info("Respuesta: " + getCustomerLoginRs);
		assertNotNull(getCustomerLoginRs);
	}
	
	@Test
	public void testMD5() throws NoSuchAlgorithmException {
		String hash = Util.getHashMD5("p413512".toUpperCase());
		log.info("Resultado: "+ hash);
		assertEquals("71c2feb4f9410c40bcb4fee9414c597f", hash);
		
	}
}
