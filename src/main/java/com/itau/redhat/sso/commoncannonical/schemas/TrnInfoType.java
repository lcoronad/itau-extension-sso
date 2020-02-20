
package com.itau.redhat.sso.commoncannonical.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TrnInfo_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TrnInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trnCode" type="{http://itau.com.co/commoncannonical/v2/schemas}TrnCode_Type" minOccurs="0"/>
 *         &lt;element name="trnSrc" type="{http://itau.com.co/commoncannonical/v2/schemas}TrnSrc_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrnInfo_Type", propOrder = {
    "trnCode",
    "trnSrc"
})
public class TrnInfoType {

    protected String trnCode;
    protected String trnSrc;

    /**
     * Obtiene el valor de la propiedad trnCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnCode() {
        return trnCode;
    }

    /**
     * Define el valor de la propiedad trnCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnCode(String value) {
        this.trnCode = value;
    }

    /**
     * Obtiene el valor de la propiedad trnSrc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnSrc() {
        return trnSrc;
    }

    /**
     * Define el valor de la propiedad trnSrc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnSrc(String value) {
        this.trnSrc = value;
    }

}
