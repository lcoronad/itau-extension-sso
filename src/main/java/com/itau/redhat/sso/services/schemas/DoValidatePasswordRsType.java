
package com.itau.redhat.sso.services.schemas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import com.itau.redhat.sso.commoncannonical.schemas.HeaderResponseType;
import com.itau.redhat.sso.commoncannonical.schemas.SignOnCustomerInfoType;


/**
 * <p>Clase Java para doValidatePasswordRs_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="doValidatePasswordRs_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HeaderResponse" type="{http://itau.com.co/commoncannonical/v2/schemas}HeaderResponse_Type"/>
 *         &lt;element name="SignOnCustomerInfo" type="{http://itau.com.co/commoncannonical/v2/schemas}SignOnCustomerInfo_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doValidatePasswordRs_Type", propOrder = {
    "headerResponse",
    "signOnCustomerInfo"
})
public class DoValidatePasswordRsType {

    @XmlElement(name = "HeaderResponse", required = true)
    protected HeaderResponseType headerResponse;
    @XmlElementRef(name = "SignOnCustomerInfo", namespace = "http://itau.com.co/services/security/validatepassword/v1/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<SignOnCustomerInfoType> signOnCustomerInfo;

    /**
     * Obtiene el valor de la propiedad headerResponse.
     * 
     * @return
     *     possible object is
     *     {@link HeaderResponseType }
     *     
     */
    public HeaderResponseType getHeaderResponse() {
        return headerResponse;
    }

    /**
     * Define el valor de la propiedad headerResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderResponseType }
     *     
     */
    public void setHeaderResponse(HeaderResponseType value) {
        this.headerResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad signOnCustomerInfo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SignOnCustomerInfoType }{@code >}
     *     
     */
    public JAXBElement<SignOnCustomerInfoType> getSignOnCustomerInfo() {
        return signOnCustomerInfo;
    }

    /**
     * Define el valor de la propiedad signOnCustomerInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SignOnCustomerInfoType }{@code >}
     *     
     */
    public void setSignOnCustomerInfo(JAXBElement<SignOnCustomerInfoType> value) {
        this.signOnCustomerInfo = value;
    }

}
