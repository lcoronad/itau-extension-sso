
package com.itau.redhat.sso.services.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.itau.redhat.sso.commoncannonical.schemas.CustIdType;
import com.itau.redhat.sso.commoncannonical.schemas.HeaderRequestType;


/**
 * <p>Clase Java para doValidatePasswordRq_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="doValidatePasswordRq_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HeaderRequest" type="{http://itau.com.co/commoncannonical/v2/schemas}HeaderRequest_Type"/>
 *         &lt;element name="CustId" type="{http://itau.com.co/commoncannonical/v2/schemas}CustId_Type"/>
 *         &lt;element name="pswd" type="{http://itau.com.co/commoncannonical/v2/schemas}Pswd_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doValidatePasswordRq", propOrder = {
    "headerRequest",
    "custId",
    "pswd"
})
public class DoValidatePasswordRqType {

    @XmlElement(name = "HeaderRequest", required = true)
    protected HeaderRequestType headerRequest;
    @XmlElement(name = "CustId", required = true)
    protected CustIdType custId;
    @XmlElement(required = true)
    protected String pswd;

    /**
     * Obtiene el valor de la propiedad headerRequest.
     * 
     * @return
     *     possible object is
     *     {@link HeaderRequestType }
     *     
     */
    public HeaderRequestType getHeaderRequest() {
        return headerRequest;
    }

    /**
     * Define el valor de la propiedad headerRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderRequestType }
     *     
     */
    public void setHeaderRequest(HeaderRequestType value) {
        this.headerRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad custId.
     * 
     * @return
     *     possible object is
     *     {@link CustIdType }
     *     
     */
    public CustIdType getCustId() {
        return custId;
    }

    /**
     * Define el valor de la propiedad custId.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdType }
     *     
     */
    public void setCustId(CustIdType value) {
        this.custId = value;
    }

    /**
     * Obtiene el valor de la propiedad pswd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPswd() {
        return pswd;
    }

    /**
     * Define el valor de la propiedad pswd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPswd(String value) {
        this.pswd = value;
    }

}
