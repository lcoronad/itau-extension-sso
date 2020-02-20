
package co.com.itau.services.security.validatepassword.v1.schemas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.itau.redhat.sso.commoncannonical.schemas.SignOnCustomerInfoType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.itau.services.security.validatepassword.v1.schemas package. 
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

    private final static QName _DoValidatePasswordRq_QNAME = new QName("http://itau.com.co/services/security/validatepassword/v1/schemas", "doValidatePasswordRq");
    private final static QName _DoValidatePasswordRs_QNAME = new QName("http://itau.com.co/services/security/validatepassword/v1/schemas", "doValidatePasswordRs");
    private final static QName _DoValidatePasswordRsTypeSignOnCustomerInfo_QNAME = new QName("http://itau.com.co/services/security/validatepassword/v1/schemas", "SignOnCustomerInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.itau.services.security.validatepassword.v1.schemas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoValidatePasswordRqType }
     * 
     */
    public DoValidatePasswordRqType createDoValidatePasswordRqType() {
        return new DoValidatePasswordRqType();
    }

    /**
     * Create an instance of {@link DoValidatePasswordRsType }
     * 
     */
    public DoValidatePasswordRsType createDoValidatePasswordRsType() {
        return new DoValidatePasswordRsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoValidatePasswordRqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/services/security/validatepassword/v1/schemas", name = "doValidatePasswordRq")
    public JAXBElement<DoValidatePasswordRqType> createDoValidatePasswordRq(DoValidatePasswordRqType value) {
        return new JAXBElement<DoValidatePasswordRqType>(_DoValidatePasswordRq_QNAME, DoValidatePasswordRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoValidatePasswordRsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/services/security/validatepassword/v1/schemas", name = "doValidatePasswordRs")
    public JAXBElement<DoValidatePasswordRsType> createDoValidatePasswordRs(DoValidatePasswordRsType value) {
        return new JAXBElement<DoValidatePasswordRsType>(_DoValidatePasswordRs_QNAME, DoValidatePasswordRsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignOnCustomerInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itau.com.co/services/security/validatepassword/v1/schemas", name = "SignOnCustomerInfo", scope = DoValidatePasswordRsType.class)
    public JAXBElement<SignOnCustomerInfoType> createDoValidatePasswordRsTypeSignOnCustomerInfo(SignOnCustomerInfoType value) {
        return new JAXBElement<SignOnCustomerInfoType>(_DoValidatePasswordRsTypeSignOnCustomerInfo_QNAME, SignOnCustomerInfoType.class, DoValidatePasswordRsType.class, value);
    }

}
