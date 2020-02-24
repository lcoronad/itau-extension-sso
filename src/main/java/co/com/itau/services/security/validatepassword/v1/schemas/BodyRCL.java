package co.com.itau.services.security.validatepassword.v1.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class BodyRCL {
	
	@XmlElement(name = "getCustomerLoginRs",namespace = "http://itau.com.co/services/security/customerlogin/v1/schemas")
	private GetCustomerLoginRs getCustomerLoginRs;

	public GetCustomerLoginRs getGetCustomerLoginRs() {
		return getCustomerLoginRs;
	}

	public void setGetCustomerLoginRs(GetCustomerLoginRs getCustomerLoginRs) {
		this.getCustomerLoginRs = getCustomerLoginRs;
	}
	
	
	
	

}
