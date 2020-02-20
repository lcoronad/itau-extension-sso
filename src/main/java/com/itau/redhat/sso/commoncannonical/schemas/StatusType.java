
package com.itau.redhat.sso.commoncannonical.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Status_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Status_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusCode" type="{http://itau.com.co/commoncannonical/v2/schemas}StatusCode_Type"/>
 *         &lt;element name="serverStatusCode" type="{http://itau.com.co/commoncannonical/v2/schemas}ServerStatusCode_Type" minOccurs="0"/>
 *         &lt;element name="severity" type="{http://itau.com.co/commoncannonical/v2/schemas}Severity_Type"/>
 *         &lt;element name="statusDesc" type="{http://itau.com.co/commoncannonical/v2/schemas}StatusDesc_Type" minOccurs="0"/>
 *         &lt;element name="AdditionalStatus" type="{http://itau.com.co/commoncannonical/v2/schemas}AdditionalStatus_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status_Type", propOrder = {
    "statusCode",
    "serverStatusCode",
    "severity",
    "statusDesc",
    "additionalStatus"
})
public class StatusType {

    protected String statusCode;
    protected String serverStatusCode;
    @XmlElement(required = true)
    protected String severity;
    protected String statusDesc;
    @XmlElement(name = "AdditionalStatus")
    protected List<AdditionalStatusType> additionalStatus;

    /**
     * Obtiene el valor de la propiedad statusCode.
     * 
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Define el valor de la propiedad statusCode.
     * 
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad serverStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerStatusCode() {
        return serverStatusCode;
    }

    /**
     * Define el valor de la propiedad serverStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerStatusCode(String value) {
        this.serverStatusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad severity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Define el valor de la propiedad severity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Obtiene el valor de la propiedad statusDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Define el valor de la propiedad statusDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
    }

    /**
     * Gets the value of the additionalStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalStatusType }
     * 
     * 
     */
    public List<AdditionalStatusType> getAdditionalStatus() {
        if (additionalStatus == null) {
            additionalStatus = new ArrayList<AdditionalStatusType>();
        }
        return this.additionalStatus;
    }

}
