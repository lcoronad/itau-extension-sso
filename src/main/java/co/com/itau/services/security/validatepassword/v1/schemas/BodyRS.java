package co.com.itau.services.security.validatepassword.v1.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class BodyRS {
	
	@XmlElement(name = "doValidatePasswordRs")
	private DoValidatePasswordRsType doValidatePasswordRsType;
	
	
	public DoValidatePasswordRsType getDoValidatePasswordRsType() {
		return doValidatePasswordRsType;
	}

	public void setDoValidatePasswordRsType(DoValidatePasswordRsType doValidatePasswordRsType) {
		this.doValidatePasswordRsType = doValidatePasswordRsType;
	}
	
	

}
