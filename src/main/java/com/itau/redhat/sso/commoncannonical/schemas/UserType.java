
package com.itau.redhat.sso.commoncannonical.schemas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para User_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="User_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userName" type="{http://itau.com.co/commoncannonical/v2/schemas}C" minOccurs="0"/>
 *         &lt;element name="userToken" type="{http://itau.com.co/commoncannonical/v2/schemas}C" minOccurs="0"/>
 *         &lt;element name="employeeIdentlNum" type="{http://itau.com.co/commoncannonical/v2/schemas}EmployeeIdentlNum_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User_Type", propOrder = {
    "userName",
    "userToken",
    "employeeIdentlNum"
})
public class UserType {

    protected String userName;
    protected String userToken;
    @XmlElementRef(name = "employeeIdentlNum", namespace = "http://itau.com.co/commoncannonical/v2/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeeIdentlNum;

    /**
     * Obtiene el valor de la propiedad userName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Define el valor de la propiedad userName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Obtiene el valor de la propiedad userToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserToken() {
        return userToken;
    }

    /**
     * Define el valor de la propiedad userToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserToken(String value) {
        this.userToken = value;
    }

    /**
     * Obtiene el valor de la propiedad employeeIdentlNum.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeeIdentlNum() {
        return employeeIdentlNum;
    }

    /**
     * Define el valor de la propiedad employeeIdentlNum.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeeIdentlNum(JAXBElement<String> value) {
        this.employeeIdentlNum = value;
    }

}
