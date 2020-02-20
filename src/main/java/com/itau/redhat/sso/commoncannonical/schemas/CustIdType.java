
package com.itau.redhat.sso.commoncannonical.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CustId_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CustId_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SPName" type="{http://itau.com.co/commoncannonical/v2/schemas}SPName" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;element name="custPermId" type="{http://itau.com.co/commoncannonical/v2/schemas}CustPermId_Type" minOccurs="0"/>
 *           &lt;element name="custLoginId" type="{http://itau.com.co/commoncannonical/v2/schemas}CustLoginId_Type" minOccurs="0"/>
 *           &lt;element name="custType" type="{http://itau.com.co/commoncannonical/v2/schemas}CustType_Type" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustId_Type", propOrder = {
    "spName",
    "custPermId",
    "custLoginId",
    "custType"
})
public class CustIdType {

    @XmlElement(name = "SPName")
    protected String spName;
    protected String custPermId;
    protected String custLoginId;
    protected String custType;

    /**
     * Obtiene el valor de la propiedad spName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPName() {
        return spName;
    }

    /**
     * Define el valor de la propiedad spName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPName(String value) {
        this.spName = value;
    }

    /**
     * Obtiene el valor de la propiedad custPermId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustPermId() {
        return custPermId;
    }

    /**
     * Define el valor de la propiedad custPermId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustPermId(String value) {
        this.custPermId = value;
    }

    /**
     * Obtiene el valor de la propiedad custLoginId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustLoginId() {
        return custLoginId;
    }

    /**
     * Define el valor de la propiedad custLoginId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustLoginId(String value) {
        this.custLoginId = value;
    }

    /**
     * Obtiene el valor de la propiedad custType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustType() {
        return custType;
    }

    /**
     * Define el valor de la propiedad custType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustType(String value) {
        this.custType = value;
    }

}
