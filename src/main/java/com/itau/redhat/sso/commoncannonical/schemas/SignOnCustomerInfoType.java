
package com.itau.redhat.sso.commoncannonical.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SignOnCustomerInfo_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SignOnCustomerInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignOnCustomerInfoRecord" type="{http://itau.com.co/commoncannonical/v2/schemas}SignOnCustomerInfoRecord_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignOnCustomerInfo_Type", propOrder = {
    "signOnCustomerInfoRecord"
})
public class SignOnCustomerInfoType {

    @XmlElement(name = "SignOnCustomerInfoRecord")
    protected SignOnCustomerInfoRecordType signOnCustomerInfoRecord;

    /**
     * Obtiene el valor de la propiedad signOnCustomerInfoRecord.
     * 
     * @return
     *     possible object is
     *     {@link SignOnCustomerInfoRecordType }
     *     
     */
    public SignOnCustomerInfoRecordType getSignOnCustomerInfoRecord() {
        return signOnCustomerInfoRecord;
    }

    /**
     * Define el valor de la propiedad signOnCustomerInfoRecord.
     * 
     * @param value
     *     allowed object is
     *     {@link SignOnCustomerInfoRecordType }
     *     
     */
    public void setSignOnCustomerInfoRecord(SignOnCustomerInfoRecordType value) {
        this.signOnCustomerInfoRecord = value;
    }

	@Override
	public String toString() {
		return "SignOnCustomerInfoType [signOnCustomerInfoRecord=" + signOnCustomerInfoRecord + "]";
	}
    
    

}
