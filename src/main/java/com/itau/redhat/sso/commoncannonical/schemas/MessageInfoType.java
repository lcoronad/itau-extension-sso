
package com.itau.redhat.sso.commoncannonical.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para MessageInfo_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MessageInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateTime" type="{http://itau.com.co/commoncannonical/v2/schemas}DateTime_Type"/>
 *         &lt;element name="systemId" type="{http://itau.com.co/commoncannonical/v2/schemas}C"/>
 *         &lt;element name="originatorName" type="{http://itau.com.co/commoncannonical/v2/schemas}OriginatorName_Type" minOccurs="0"/>
 *         &lt;element name="originatorType" type="{http://itau.com.co/commoncannonical/v2/schemas}OriginatorType_Type"/>
 *         &lt;element name="terminalId" type="{http://itau.com.co/commoncannonical/v2/schemas}TerminalId_Type"/>
 *         &lt;element name="terminalType" type="{http://itau.com.co/commoncannonical/v2/schemas}TerminalType_Type" minOccurs="0"/>
 *         &lt;element name="bankIdType" type="{http://itau.com.co/commoncannonical/v2/schemas}BankId_Type" minOccurs="0"/>
 *         &lt;element name="bankId" type="{http://itau.com.co/commoncannonical/v2/schemas}BankId_Type" minOccurs="0"/>
 *         &lt;element name="trnType" type="{http://itau.com.co/commoncannonical/v2/schemas}TrnType_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageInfo_Type", propOrder = {
    "dateTime",
    "systemId",
    "originatorName",
    "originatorType",
    "terminalId",
    "terminalType",
    "bankIdType",
    "bankId",
    "trnType"
})
public class MessageInfoType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(required = true)
    protected String systemId;
    protected String originatorName;
    protected long originatorType;
    @XmlElement(required = true)
    protected String terminalId;
    protected String terminalType;
    protected String bankIdType;
    protected String bankId;
    protected String trnType;

    /**
     * Obtiene el valor de la propiedad dateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Define el valor de la propiedad dateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad systemId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemId() {
        return systemId;
    }

    /**
     * Define el valor de la propiedad systemId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemId(String value) {
        this.systemId = value;
    }

    /**
     * Obtiene el valor de la propiedad originatorName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatorName() {
        return originatorName;
    }

    /**
     * Define el valor de la propiedad originatorName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatorName(String value) {
        this.originatorName = value;
    }

    /**
     * Obtiene el valor de la propiedad originatorType.
     * 
     */
    public long getOriginatorType() {
        return originatorType;
    }

    /**
     * Define el valor de la propiedad originatorType.
     * 
     */
    public void setOriginatorType(long value) {
        this.originatorType = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * Define el valor de la propiedad terminalId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalId(String value) {
        this.terminalId = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalType() {
        return terminalType;
    }

    /**
     * Define el valor de la propiedad terminalType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalType(String value) {
        this.terminalType = value;
    }

    /**
     * Obtiene el valor de la propiedad bankIdType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankIdType() {
        return bankIdType;
    }

    /**
     * Define el valor de la propiedad bankIdType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankIdType(String value) {
        this.bankIdType = value;
    }

    /**
     * Obtiene el valor de la propiedad bankId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * Define el valor de la propiedad bankId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankId(String value) {
        this.bankId = value;
    }

    /**
     * Obtiene el valor de la propiedad trnType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnType() {
        return trnType;
    }

    /**
     * Define el valor de la propiedad trnType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnType(String value) {
        this.trnType = value;
    }

}
