
package com.itau.redhat.sso.commoncannonical.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MessageHeader_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MessageHeader_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageKey" type="{http://itau.com.co/commoncannonical/v2/schemas}MessageKey_Type" minOccurs="0"/>
 *         &lt;element name="MessageInfo" type="{http://itau.com.co/commoncannonical/v2/schemas}MessageInfo_Type" minOccurs="0"/>
 *         &lt;element name="TrnInfoList" type="{http://itau.com.co/commoncannonical/v2/schemas}TrnInfoList_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageHeader_Type", propOrder = {
    "messageKey",
    "messageInfo",
    "trnInfoList"
})
public class MessageHeaderType {

    @XmlElement(name = "MessageKey")
    protected MessageKeyType messageKey;
    @XmlElement(name = "MessageInfo")
    protected MessageInfoType messageInfo;
    @XmlElement(name = "TrnInfoList")
    protected TrnInfoListType trnInfoList;

    /**
     * Obtiene el valor de la propiedad messageKey.
     * 
     * @return
     *     possible object is
     *     {@link MessageKeyType }
     *     
     */
    public MessageKeyType getMessageKey() {
        return messageKey;
    }

    /**
     * Define el valor de la propiedad messageKey.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageKeyType }
     *     
     */
    public void setMessageKey(MessageKeyType value) {
        this.messageKey = value;
    }

    /**
     * Obtiene el valor de la propiedad messageInfo.
     * 
     * @return
     *     possible object is
     *     {@link MessageInfoType }
     *     
     */
    public MessageInfoType getMessageInfo() {
        return messageInfo;
    }

    /**
     * Define el valor de la propiedad messageInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageInfoType }
     *     
     */
    public void setMessageInfo(MessageInfoType value) {
        this.messageInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad trnInfoList.
     * 
     * @return
     *     possible object is
     *     {@link TrnInfoListType }
     *     
     */
    public TrnInfoListType getTrnInfoList() {
        return trnInfoList;
    }

    /**
     * Define el valor de la propiedad trnInfoList.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnInfoListType }
     *     
     */
    public void setTrnInfoList(TrnInfoListType value) {
        this.trnInfoList = value;
    }

}
