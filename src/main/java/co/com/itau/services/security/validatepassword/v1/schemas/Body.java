package co.com.itau.services.security.validatepassword.v1.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Body {
	
	@XmlElement(name = "doValidatePasswordRq")
	private DoValidatePasswordRqType doValidatePasswordRqType;
	
	
	public DoValidatePasswordRqType getDoValidatePasswordRqType() {
		return doValidatePasswordRqType;
	}

	public void setDoValidatePasswordRqType(DoValidatePasswordRqType doValidatePasswordRqType) {
		this.doValidatePasswordRqType = doValidatePasswordRqType;
	}
	
	

}
