
package com.itau.redhat.sso.commoncannonical.schemas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.itau.commoncannonical.v2.schemas package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Language_QNAME = new QName("http://itau.com.co/commoncannonical/v2/schemas", "Language");
    private final static QName _SignOnCustomerInfo_QNAME = new QName("http://itau.com.co/commoncannonical/v2/schemas", "SignOnCustomerInfo");
    private final static QName _EmailAddr_QNAME = new QName("http://itau.com.co/commoncannonical/v2/schemas", "EmailAddr");
    private final static QName _UserTypeEmployeeIdentlNum_QNAME = new QName("http://itau.com.co/commoncannonical/v2/schemas", "employeeIdentlNum");
    private final static QName _SignOnCustomerInfoRecordTypeChangePwdFlag_QNAME = new QName("http://itau.com.co/commoncannonical/v2/schemas", "ChangePwdFlag");
    private final static QName _SignOnCustomerInfoRecordTypeBankIdType_QNAME = new QName("http://itau.com.co/commoncannonical/v2/schemas", "BankIdType");
    private final static QName _SignOnCustomerInfoRecordTypeGetSummaryFlag_QNAME = new QName("http://itau.com.co/commoncannonical/v2/schemas", "GetSummaryFlag");
    private final static QName _SignOnCustomerInfoRecordTypeUserName_QNAME = new QName("http://itau.com.co/commoncannonical/v2/schemas", "UserName");
    private final static QName _SignOnCustomerInfoRecordTypeCustIdType_QNAME = new QName("http://itau.com.co/commoncannonical/v2/schemas", "CustIdType");
    private final static QName _SignOnCustomerInfoRecordTypeSessionId_QNAME = new QName("http://itau.com.co/commoncannonical/v2/schemas", "SessionId");
    private final static QName _SignOnCustomerInfoRecordTypeUserType_QNAME = new QName("http://itau.com.co/commoncannonical/v2/schemas", "UserType");
    private final static QName _SignOnCustomerInfoRecordTypeCustPermId_QNAME = new QName("http://itau.com.co/commoncannonical/v2/schemas", "CustPermId");
    private final static QName _SignOnCustomerInfoRecordTypeLastLogonDt_QNAME = new QName("http://itau.com.co/commoncannonical/v2/schemas", "LastLogonDt");
    private final static QName _SignOnCustomerInfoRecordTypeDaysToPwdTxChange_QNAME = new QName("http://itau.com.co/commoncannonical/v2/schemas", "DaysToPwdTxChange");
    private final static QName _SignOnCustomerInfoRecordTypeUserIdType_QNAME = new QName("http://itau.com.co/commoncannonical/v2/schemas", "UserIdType");
    private final static QName _SignOnCustomerInfoRecordTypeSignOnCustCostCenterId_QNAME = new QName("http://itau.com.co/commoncannonical/v2/schemas", "SignOnCustCostCenterId");
    private final static QName _SignOnCustomerInfoRecordTypeTrxPswFlag_QNAME = new QName("http://itau.com.co/commoncannonical/v2/schemas", "TrxPswFlag");
    private final static QName _SignOnCustomerInfoRecordTypePhone_QNAME = new QName("http://itau.com.co/commoncannonical/v2/schemas", "Phone");
    private final static QName _SignOnCustomerInfoRecordTypeContractSignFlag_QNAME = new QName("http://itau.com.co/commoncannonical/v2/schemas", "ContractSignFlag");
    private final static QName _SignOnCustomerInfoRecordTypeCustName_QNAME = new QName("http://itau.com.co/commoncannonical/v2/schemas", "CustName");
    private final static QName _SignOnCustomerInfoRecordTypeDaysToPwdChange_QNAME = new QName("http://itau.com.co/commoncannonical/v2/schemas", "DaysToPwdChange");
    private final static QName _SignOnCustomerInfoRecordTypeSignOnMasivePwdChangeFlag_QNAME = new QName("http://itau.com.co/commoncannonical/v2/schemas", "SignOnMasivePwdChangeFlag");
    private final static QName _SignOnCustomerInfoRecordTypeUserPermId_QNAME = new QName("http://itau.com.co/commoncannonical/v2/schemas", "UserPermId");
    private final static QName _SignOnCustomerInfoRecordTypeCompanyAdminRole_QNAME = new QName("http://itau.com.co/commoncannonical/v2/schemas", "CompanyAdminRole");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.itau.commoncannonical.v2.schemas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SignOnCustomerInfoType }
     * 
     */
    public SignOnCustomerInfoType createSignOnCustomerInfoType() {
        return new SignOnCustomerInfoType();
    }

    /**
     * Create an instance of {@link AdditionalStatusType }
     * 
     */
    public AdditionalStatusType createAdditionalStatusType() {
        return new AdditionalStatusType();
    }

    /**
     * Create an instance of {@link HeaderResponseType }
     * 
     */
    public HeaderResponseType createHeaderResponseType() {
        return new HeaderResponseType();
    }

    /**
     * Create an instance of {@link MessageKeyType }
     * 
     */
    public MessageKeyType createMessageKeyType() {
        return new MessageKeyType();
    }

    /**
     * Create an instance of {@link SignOnCustomerInfoRecordType }
     * 
     */
    public SignOnCustomerInfoRecordType createSignOnCustomerInfoRecordType() {
        return new SignOnCustomerInfoRecordType();
    }

    /**
     * Create an instance of {@link UserType }
     * 
     */
    public UserType createUserType() {
        return new UserType();
    }

    /**
     * Create an instance of {@link CustIdType }
     * 
     */
    public CustIdType createCustIdType() {
        return new CustIdType();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link HeaderRequestType }
     * 
     */
    public HeaderRequestType createHeaderRequestType() {
        return new HeaderRequestType();
    }

    /**
     * Create an instance of {@link MessageHeaderType }
     * 
     */
    public MessageHeaderType createMessageHeaderType() {
        return new MessageHeaderType();
    }

    /**
     * Create an instance of {@link TrnInfoType }
     * 
     */
    public TrnInfoType createTrnInfoType() {
        return new TrnInfoType();
    }

    /**
     * Create an instance of {@link TrnInfoListType }
     * 
     */
    public TrnInfoListType createTrnInfoListType() {
        return new TrnInfoListType();
    }

    /**
     * Create an instance of {@link MessageInfoType }
     * 
     */
    public MessageInfoType createMessageInfoType() {
        return new MessageInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "Language")
    public JAXBElement<String> createLanguage(String value) {
        return new JAXBElement<String>(_Language_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignOnCustomerInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "SignOnCustomerInfo")
    public JAXBElement<SignOnCustomerInfoType> createSignOnCustomerInfo(SignOnCustomerInfoType value) {
        return new JAXBElement<SignOnCustomerInfoType>(_SignOnCustomerInfo_QNAME, SignOnCustomerInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "EmailAddr")
    public JAXBElement<String> createEmailAddr(String value) {
        return new JAXBElement<String>(_EmailAddr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "employeeIdentlNum", scope = UserType.class)
    public JAXBElement<String> createUserTypeEmployeeIdentlNum(String value) {
        return new JAXBElement<String>(_UserTypeEmployeeIdentlNum_QNAME, String.class, UserType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "ChangePwdFlag", scope = SignOnCustomerInfoRecordType.class)
    public JAXBElement<String> createSignOnCustomerInfoRecordTypeChangePwdFlag(String value) {
        return new JAXBElement<String>(_SignOnCustomerInfoRecordTypeChangePwdFlag_QNAME, String.class, SignOnCustomerInfoRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "BankIdType", scope = SignOnCustomerInfoRecordType.class)
    public JAXBElement<String> createSignOnCustomerInfoRecordTypeBankIdType(String value) {
        return new JAXBElement<String>(_SignOnCustomerInfoRecordTypeBankIdType_QNAME, String.class, SignOnCustomerInfoRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "GetSummaryFlag", scope = SignOnCustomerInfoRecordType.class)
    public JAXBElement<String> createSignOnCustomerInfoRecordTypeGetSummaryFlag(String value) {
        return new JAXBElement<String>(_SignOnCustomerInfoRecordTypeGetSummaryFlag_QNAME, String.class, SignOnCustomerInfoRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "EmailAddr", scope = SignOnCustomerInfoRecordType.class)
    public JAXBElement<String> createSignOnCustomerInfoRecordTypeEmailAddr(String value) {
        return new JAXBElement<String>(_EmailAddr_QNAME, String.class, SignOnCustomerInfoRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "UserName", scope = SignOnCustomerInfoRecordType.class)
    public JAXBElement<String> createSignOnCustomerInfoRecordTypeUserName(String value) {
        return new JAXBElement<String>(_SignOnCustomerInfoRecordTypeUserName_QNAME, String.class, SignOnCustomerInfoRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "CustIdType", scope = SignOnCustomerInfoRecordType.class)
    public JAXBElement<String> createSignOnCustomerInfoRecordTypeCustIdType(String value) {
        return new JAXBElement<String>(_SignOnCustomerInfoRecordTypeCustIdType_QNAME, String.class, SignOnCustomerInfoRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "SessionId", scope = SignOnCustomerInfoRecordType.class)
    public JAXBElement<String> createSignOnCustomerInfoRecordTypeSessionId(String value) {
        return new JAXBElement<String>(_SignOnCustomerInfoRecordTypeSessionId_QNAME, String.class, SignOnCustomerInfoRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "UserType", scope = SignOnCustomerInfoRecordType.class)
    public JAXBElement<String> createSignOnCustomerInfoRecordTypeUserType(String value) {
        return new JAXBElement<String>(_SignOnCustomerInfoRecordTypeUserType_QNAME, String.class, SignOnCustomerInfoRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "CustPermId", scope = SignOnCustomerInfoRecordType.class)
    public JAXBElement<String> createSignOnCustomerInfoRecordTypeCustPermId(String value) {
        return new JAXBElement<String>(_SignOnCustomerInfoRecordTypeCustPermId_QNAME, String.class, SignOnCustomerInfoRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "LastLogonDt", scope = SignOnCustomerInfoRecordType.class)
    public JAXBElement<String> createSignOnCustomerInfoRecordTypeLastLogonDt(String value) {
        return new JAXBElement<String>(_SignOnCustomerInfoRecordTypeLastLogonDt_QNAME, String.class, SignOnCustomerInfoRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "DaysToPwdTxChange", scope = SignOnCustomerInfoRecordType.class)
    public JAXBElement<String> createSignOnCustomerInfoRecordTypeDaysToPwdTxChange(String value) {
        return new JAXBElement<String>(_SignOnCustomerInfoRecordTypeDaysToPwdTxChange_QNAME, String.class, SignOnCustomerInfoRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "UserIdType", scope = SignOnCustomerInfoRecordType.class)
    public JAXBElement<String> createSignOnCustomerInfoRecordTypeUserIdType(String value) {
        return new JAXBElement<String>(_SignOnCustomerInfoRecordTypeUserIdType_QNAME, String.class, SignOnCustomerInfoRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "SignOnCustCostCenterId", scope = SignOnCustomerInfoRecordType.class)
    public JAXBElement<String> createSignOnCustomerInfoRecordTypeSignOnCustCostCenterId(String value) {
        return new JAXBElement<String>(_SignOnCustomerInfoRecordTypeSignOnCustCostCenterId_QNAME, String.class, SignOnCustomerInfoRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "TrxPswFlag", scope = SignOnCustomerInfoRecordType.class)
    public JAXBElement<String> createSignOnCustomerInfoRecordTypeTrxPswFlag(String value) {
        return new JAXBElement<String>(_SignOnCustomerInfoRecordTypeTrxPswFlag_QNAME, String.class, SignOnCustomerInfoRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "Language", scope = SignOnCustomerInfoRecordType.class)
    public JAXBElement<String> createSignOnCustomerInfoRecordTypeLanguage(String value) {
        return new JAXBElement<String>(_Language_QNAME, String.class, SignOnCustomerInfoRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "Phone", scope = SignOnCustomerInfoRecordType.class)
    public JAXBElement<String> createSignOnCustomerInfoRecordTypePhone(String value) {
        return new JAXBElement<String>(_SignOnCustomerInfoRecordTypePhone_QNAME, String.class, SignOnCustomerInfoRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "ContractSignFlag", scope = SignOnCustomerInfoRecordType.class)
    public JAXBElement<String> createSignOnCustomerInfoRecordTypeContractSignFlag(String value) {
        return new JAXBElement<String>(_SignOnCustomerInfoRecordTypeContractSignFlag_QNAME, String.class, SignOnCustomerInfoRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "CustName", scope = SignOnCustomerInfoRecordType.class)
    public JAXBElement<String> createSignOnCustomerInfoRecordTypeCustName(String value) {
        return new JAXBElement<String>(_SignOnCustomerInfoRecordTypeCustName_QNAME, String.class, SignOnCustomerInfoRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "DaysToPwdChange", scope = SignOnCustomerInfoRecordType.class)
    public JAXBElement<String> createSignOnCustomerInfoRecordTypeDaysToPwdChange(String value) {
        return new JAXBElement<String>(_SignOnCustomerInfoRecordTypeDaysToPwdChange_QNAME, String.class, SignOnCustomerInfoRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "SignOnMasivePwdChangeFlag", scope = SignOnCustomerInfoRecordType.class)
    public JAXBElement<String> createSignOnCustomerInfoRecordTypeSignOnMasivePwdChangeFlag(String value) {
        return new JAXBElement<String>(_SignOnCustomerInfoRecordTypeSignOnMasivePwdChangeFlag_QNAME, String.class, SignOnCustomerInfoRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "UserPermId", scope = SignOnCustomerInfoRecordType.class)
    public JAXBElement<String> createSignOnCustomerInfoRecordTypeUserPermId(String value) {
        return new JAXBElement<String>(_SignOnCustomerInfoRecordTypeUserPermId_QNAME, String.class, SignOnCustomerInfoRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/commoncannonical/v2/schemas", name = "CompanyAdminRole", scope = SignOnCustomerInfoRecordType.class)
    public JAXBElement<String> createSignOnCustomerInfoRecordTypeCompanyAdminRole(String value) {
        return new JAXBElement<String>(_SignOnCustomerInfoRecordTypeCompanyAdminRole_QNAME, String.class, SignOnCustomerInfoRecordType.class, value);
    }

}
