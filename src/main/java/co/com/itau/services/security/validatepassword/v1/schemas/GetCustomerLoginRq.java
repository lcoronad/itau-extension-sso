package co.com.itau.services.security.validatepassword.v1.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.itau.redhat.sso.commoncannonical.schemas.HeaderRequestType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerLoginRq", propOrder = { "headerRequest"},namespace = "http://itau.com.co/services/common/auditory/v2/schemas")
public class GetCustomerLoginRq {

	@XmlElement(name = "ns4:HeaderRequest", required = true,namespace = "")
	protected HeaderRequestType headerRequest;
	
	

	public HeaderRequestType getHeaderRequest() {
		return headerRequest;
	}

	public void setHeaderRequest(HeaderRequestType headerRequest) {
		this.headerRequest = headerRequest;
	}

	
	
	
}
