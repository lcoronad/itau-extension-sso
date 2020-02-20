
package com.itau.redhat.sso.commoncannonical.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MessageKey_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MessageKey_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="integrationId" type="{http://itau.com.co/commoncannonical/v2/schemas}C" minOccurs="0"/>
 *         &lt;element name="requestVersion" type="{http://itau.com.co/commoncannonical/v2/schemas}Version_Type" minOccurs="0"/>
 *         &lt;element name="requestUUID" type="{http://itau.com.co/commoncannonical/v2/schemas}UUID_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageKey_Type", propOrder = {
    "integrationId",
    "requestVersion",
    "requestUUID"
})
public class MessageKeyType {

    protected String integrationId;
    protected String requestVersion;
    @XmlElement(required = true)
    protected String requestUUID;

    /**
     * Obtiene el valor de la propiedad integrationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationId() {
        return integrationId;
    }

    /**
     * Define el valor de la propiedad integrationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationId(String value) {
        this.integrationId = value;
    }

    /**
     * Obtiene el valor de la propiedad requestVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestVersion() {
        return requestVersion;
    }

    /**
     * Define el valor de la propiedad requestVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestVersion(String value) {
        this.requestVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad requestUUID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestUUID() {
        return requestUUID;
    }

    /**
     * Define el valor de la propiedad requestUUID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestUUID(String value) {
        this.requestUUID = value;
    }

}
