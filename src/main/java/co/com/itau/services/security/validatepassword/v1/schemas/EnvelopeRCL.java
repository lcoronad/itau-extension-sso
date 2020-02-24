package co.com.itau.services.security.validatepassword.v1.schemas;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Envelope", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
@XmlType(name = "Envelope", propOrder = { "headers", "body" })
public class EnvelopeRCL {
	
	private String headers;
	
	private BodyRCL body;
	
	@XmlElement(name = "Body", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
	public BodyRCL getBody() {
		return body;
	}

	public void setBody(BodyRCL body) {
		this.body = body;
	}

	@XmlElement(name = "Header", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
	public String getHeaders() {
		return headers;
	}

	public void setHeaders(String headers) {
		this.headers = headers;
	}

}
