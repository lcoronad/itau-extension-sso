package co.com.itau.services.security.validatepassword.v1.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.itau.redhat.sso.commoncannonical.schemas.HeaderResponseType;

@XmlAccessorType(XmlAccessType.FIELD)
public class GetCustomerLoginRs {

	@XmlElement(name = "HeaderResponse", required = true, namespace = "http://itau.com.co/services/security/customerlogin/v1/schemas")
	protected HeaderResponseType headerResponse;
	
	@XmlElement(name = "custLoginId", required = true, namespace = "http://itau.com.co/services/security/customerlogin/v1/schemas")
	private String custLoginId;

	@XmlElement(name = "custPermId", required = true, namespace = "http://itau.com.co/services/security/customerlogin/v1/schemas")
	private String custPermId;

	@XmlElement(name = "custType", required = true, namespace = "http://itau.com.co/services/security/customerlogin/v1/schemas")
	private String custType;

	/**
	 * Obtiene el valor de la propiedad headerResponse.
	 * 
	 * @return possible object is {@link HeaderResponseType }
	 * 
	 */
	public HeaderResponseType getHeaderResponse() {
		return headerResponse;
	}

	/**
	 * Define el valor de la propiedad headerResponse.
	 * 
	 * @param value allowed object is {@link HeaderResponseType }
	 * 
	 */
	public void setHeaderResponse(HeaderResponseType value) {
		this.headerResponse = value;
	}

	public String getCustLoginId() {
		return custLoginId;
	}

	public void setCustLoginId(String custLoginId) {
		this.custLoginId = custLoginId;
	}

	public String getCustPermId() {
		return custPermId;
	}

	public void setCustPermId(String custPermId) {
		this.custPermId = custPermId;
	}

	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}
	
	

}
