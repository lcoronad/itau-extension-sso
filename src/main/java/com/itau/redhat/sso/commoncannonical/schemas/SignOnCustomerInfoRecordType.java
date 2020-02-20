
package com.itau.redhat.sso.commoncannonical.schemas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SignOnCustomerInfoRecord_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SignOnCustomerInfoRecord_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignOnCustomerInfoRecord" type="{http://itau.com.co/commoncannonical/v2/schemas}SignOnCustomerInfoRecord_Type"/>
 *         &lt;element name="GetSummaryFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChangePwdFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SessionId" type="{http://itau.com.co/commoncannonical/v2/schemas}SessionId_Type" minOccurs="0"/>
 *         &lt;element name="UserType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankIdType" type="{http://itau.com.co/commoncannonical/v2/schemas}BankIdType_Type" minOccurs="0"/>
 *         &lt;element name="UserIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserPermId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyAdminRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://itau.com.co/commoncannonical/v2/schemas}Language_Type" minOccurs="0"/>
 *         &lt;element name="CustIdType" type="{http://itau.com.co/commoncannonical/v2/schemas}CustIdType_Type" minOccurs="0"/>
 *         &lt;element name="CustPermId" type="{http://itau.com.co/commoncannonical/v2/schemas}CustPermId_Type" minOccurs="0"/>
 *         &lt;element name="TrxPswFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastLogonDt" type="{http://itau.com.co/commoncannonical/v2/schemas}LastLogonDt_Type" minOccurs="0"/>
 *         &lt;element name="CustName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractSignFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignOnCustCostCenterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DaysToPwdChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DaysToPwdTxChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailAddr" type="{http://itau.com.co/commoncannonical/v2/schemas}EmailAddr_Type" minOccurs="0"/>
 *         &lt;element name="SignOnMasivePwdChangeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://itau.com.co/commoncannonical/v2/schemas}Phone_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignOnCustomerInfoRecord_Type", propOrder = {
    "signOnCustomerInfoRecord",
    "getSummaryFlag",
    "changePwdFlag",
    "sessionId",
    "userType",
    "bankIdType",
    "userIdType",
    "userPermId",
    "userName",
    "companyAdminRole",
    "language",
    "custIdType",
    "custPermId",
    "trxPswFlag",
    "lastLogonDt",
    "custName",
    "contractSignFlag",
    "signOnCustCostCenterId",
    "daysToPwdChange",
    "daysToPwdTxChange",
    "emailAddr",
    "signOnMasivePwdChangeFlag",
    "phone"
})
public class SignOnCustomerInfoRecordType {

    @XmlElement(name = "SignOnCustomerInfoRecord", required = true)
    protected SignOnCustomerInfoRecordType signOnCustomerInfoRecord;
    @XmlElementRef(name = "GetSummaryFlag", namespace = "http://itau.com.co/commoncannonical/v2/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> getSummaryFlag;
    @XmlElementRef(name = "ChangePwdFlag", namespace = "http://itau.com.co/commoncannonical/v2/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> changePwdFlag;
    @XmlElementRef(name = "SessionId", namespace = "http://itau.com.co/commoncannonical/v2/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sessionId;
    @XmlElementRef(name = "UserType", namespace = "http://itau.com.co/commoncannonical/v2/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userType;
    @XmlElementRef(name = "BankIdType", namespace = "http://itau.com.co/commoncannonical/v2/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankIdType;
    @XmlElementRef(name = "UserIdType", namespace = "http://itau.com.co/commoncannonical/v2/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userIdType;
    @XmlElementRef(name = "UserPermId", namespace = "http://itau.com.co/commoncannonical/v2/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userPermId;
    @XmlElementRef(name = "UserName", namespace = "http://itau.com.co/commoncannonical/v2/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userName;
    @XmlElementRef(name = "CompanyAdminRole", namespace = "http://itau.com.co/commoncannonical/v2/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyAdminRole;
    @XmlElementRef(name = "Language", namespace = "http://itau.com.co/commoncannonical/v2/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> language;
    @XmlElementRef(name = "CustIdType", namespace = "http://itau.com.co/commoncannonical/v2/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custIdType;
    @XmlElementRef(name = "CustPermId", namespace = "http://itau.com.co/commoncannonical/v2/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custPermId;
    @XmlElementRef(name = "TrxPswFlag", namespace = "http://itau.com.co/commoncannonical/v2/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trxPswFlag;
    @XmlElementRef(name = "LastLogonDt", namespace = "http://itau.com.co/commoncannonical/v2/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastLogonDt;
    @XmlElementRef(name = "CustName", namespace = "http://itau.com.co/commoncannonical/v2/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custName;
    @XmlElementRef(name = "ContractSignFlag", namespace = "http://itau.com.co/commoncannonical/v2/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractSignFlag;
    @XmlElementRef(name = "SignOnCustCostCenterId", namespace = "http://itau.com.co/commoncannonical/v2/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> signOnCustCostCenterId;
    @XmlElementRef(name = "DaysToPwdChange", namespace = "http://itau.com.co/commoncannonical/v2/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> daysToPwdChange;
    @XmlElementRef(name = "DaysToPwdTxChange", namespace = "http://itau.com.co/commoncannonical/v2/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> daysToPwdTxChange;
    @XmlElementRef(name = "EmailAddr", namespace = "http://itau.com.co/commoncannonical/v2/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailAddr;
    @XmlElementRef(name = "SignOnMasivePwdChangeFlag", namespace = "http://itau.com.co/commoncannonical/v2/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> signOnMasivePwdChangeFlag;
    @XmlElementRef(name = "Phone", namespace = "http://itau.com.co/commoncannonical/v2/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phone;

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

    /**
     * Obtiene el valor de la propiedad getSummaryFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGetSummaryFlag() {
        return getSummaryFlag;
    }

    /**
     * Define el valor de la propiedad getSummaryFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGetSummaryFlag(JAXBElement<String> value) {
        this.getSummaryFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad changePwdFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChangePwdFlag() {
        return changePwdFlag;
    }

    /**
     * Define el valor de la propiedad changePwdFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChangePwdFlag(JAXBElement<String> value) {
        this.changePwdFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad sessionId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSessionId() {
        return sessionId;
    }

    /**
     * Define el valor de la propiedad sessionId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSessionId(JAXBElement<String> value) {
        this.sessionId = value;
    }

    /**
     * Obtiene el valor de la propiedad userType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserType() {
        return userType;
    }

    /**
     * Define el valor de la propiedad userType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserType(JAXBElement<String> value) {
        this.userType = value;
    }

    /**
     * Obtiene el valor de la propiedad bankIdType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankIdType() {
        return bankIdType;
    }

    /**
     * Define el valor de la propiedad bankIdType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankIdType(JAXBElement<String> value) {
        this.bankIdType = value;
    }

    /**
     * Obtiene el valor de la propiedad userIdType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserIdType() {
        return userIdType;
    }

    /**
     * Define el valor de la propiedad userIdType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserIdType(JAXBElement<String> value) {
        this.userIdType = value;
    }

    /**
     * Obtiene el valor de la propiedad userPermId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserPermId() {
        return userPermId;
    }

    /**
     * Define el valor de la propiedad userPermId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserPermId(JAXBElement<String> value) {
        this.userPermId = value;
    }

    /**
     * Obtiene el valor de la propiedad userName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserName() {
        return userName;
    }

    /**
     * Define el valor de la propiedad userName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserName(JAXBElement<String> value) {
        this.userName = value;
    }

    /**
     * Obtiene el valor de la propiedad companyAdminRole.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyAdminRole() {
        return companyAdminRole;
    }

    /**
     * Define el valor de la propiedad companyAdminRole.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyAdminRole(JAXBElement<String> value) {
        this.companyAdminRole = value;
    }

    /**
     * Obtiene el valor de la propiedad language.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLanguage() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLanguage(JAXBElement<String> value) {
        this.language = value;
    }

    /**
     * Obtiene el valor de la propiedad custIdType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustIdType() {
        return custIdType;
    }

    /**
     * Define el valor de la propiedad custIdType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustIdType(JAXBElement<String> value) {
        this.custIdType = value;
    }

    /**
     * Obtiene el valor de la propiedad custPermId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustPermId() {
        return custPermId;
    }

    /**
     * Define el valor de la propiedad custPermId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustPermId(JAXBElement<String> value) {
        this.custPermId = value;
    }

    /**
     * Obtiene el valor de la propiedad trxPswFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrxPswFlag() {
        return trxPswFlag;
    }

    /**
     * Define el valor de la propiedad trxPswFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrxPswFlag(JAXBElement<String> value) {
        this.trxPswFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad lastLogonDt.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastLogonDt() {
        return lastLogonDt;
    }

    /**
     * Define el valor de la propiedad lastLogonDt.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastLogonDt(JAXBElement<String> value) {
        this.lastLogonDt = value;
    }

    /**
     * Obtiene el valor de la propiedad custName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustName() {
        return custName;
    }

    /**
     * Define el valor de la propiedad custName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustName(JAXBElement<String> value) {
        this.custName = value;
    }

    /**
     * Obtiene el valor de la propiedad contractSignFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractSignFlag() {
        return contractSignFlag;
    }

    /**
     * Define el valor de la propiedad contractSignFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractSignFlag(JAXBElement<String> value) {
        this.contractSignFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad signOnCustCostCenterId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSignOnCustCostCenterId() {
        return signOnCustCostCenterId;
    }

    /**
     * Define el valor de la propiedad signOnCustCostCenterId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSignOnCustCostCenterId(JAXBElement<String> value) {
        this.signOnCustCostCenterId = value;
    }

    /**
     * Obtiene el valor de la propiedad daysToPwdChange.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDaysToPwdChange() {
        return daysToPwdChange;
    }

    /**
     * Define el valor de la propiedad daysToPwdChange.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDaysToPwdChange(JAXBElement<String> value) {
        this.daysToPwdChange = value;
    }

    /**
     * Obtiene el valor de la propiedad daysToPwdTxChange.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDaysToPwdTxChange() {
        return daysToPwdTxChange;
    }

    /**
     * Define el valor de la propiedad daysToPwdTxChange.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDaysToPwdTxChange(JAXBElement<String> value) {
        this.daysToPwdTxChange = value;
    }

    /**
     * Obtiene el valor de la propiedad emailAddr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailAddr() {
        return emailAddr;
    }

    /**
     * Define el valor de la propiedad emailAddr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailAddr(JAXBElement<String> value) {
        this.emailAddr = value;
    }

    /**
     * Obtiene el valor de la propiedad signOnMasivePwdChangeFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSignOnMasivePwdChangeFlag() {
        return signOnMasivePwdChangeFlag;
    }

    /**
     * Define el valor de la propiedad signOnMasivePwdChangeFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSignOnMasivePwdChangeFlag(JAXBElement<String> value) {
        this.signOnMasivePwdChangeFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad phone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhone() {
        return phone;
    }

    /**
     * Define el valor de la propiedad phone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhone(JAXBElement<String> value) {
        this.phone = value;
    }

	@Override
	public String toString() {
		return "SignOnCustomerInfoRecordType [signOnCustomerInfoRecord=" + signOnCustomerInfoRecord
				+ ", getSummaryFlag=" + getSummaryFlag + ", changePwdFlag=" + changePwdFlag + ", sessionId=" + sessionId
				+ ", userType=" + userType + ", bankIdType=" + bankIdType + ", userIdType=" + userIdType
				+ ", userPermId=" + userPermId + ", userName=" + userName + ", companyAdminRole=" + companyAdminRole
				+ ", language=" + language + ", custIdType=" + custIdType + ", custPermId=" + custPermId
				+ ", trxPswFlag=" + trxPswFlag + ", lastLogonDt=" + lastLogonDt + ", custName=" + custName
				+ ", contractSignFlag=" + contractSignFlag + ", signOnCustCostCenterId=" + signOnCustCostCenterId
				+ ", daysToPwdChange=" + daysToPwdChange + ", daysToPwdTxChange=" + daysToPwdTxChange + ", emailAddr="
				+ emailAddr + ", signOnMasivePwdChangeFlag=" + signOnMasivePwdChangeFlag + ", phone=" + phone + "]";
	}
    
    
    
    

}
