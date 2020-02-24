package co.com.itau.services.security.validatepassword.v1.schemas;

import javax.xml.bind.annotation.XmlElement;

public class BodyCL {
	
	private GetCustomerLoginRq getCustomerLoginRq;

	@XmlElement(name = "getCustomerLoginRq" , namespace = "http://itau.com.co/services/security/customerlogin/v1/schemas")
	public GetCustomerLoginRq getGetCustomerLoginRq() {
		return getCustomerLoginRq;
	}

	public void setGetCustomerLoginRq(GetCustomerLoginRq getCustomerLoginRq) {
		this.getCustomerLoginRq = getCustomerLoginRq;
	}
	
	
}
