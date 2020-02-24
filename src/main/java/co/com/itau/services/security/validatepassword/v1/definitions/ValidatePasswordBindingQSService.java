package co.com.itau.services.security.validatepassword.v1.definitions;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * OSB Service
 *
 * This class was generated by Apache CXF 2.6.6-redhat-3
 * 2020-02-20T16:44:56.667-05:00
 * Generated source version: 2.6.6-redhat-3
 * 
 */
@WebServiceClient(name = "validatePasswordBindingQSService", 
                  wsdlLocation = "http://10.186.11.91:24200/services/security/ValidatePassword?wsdl",
                  targetNamespace = "http://itau.com.co/services/security/validatepassword/v1/definitions") 
public class ValidatePasswordBindingQSService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://itau.com.co/services/security/validatepassword/v1/definitions", "validatePasswordBindingQSService");
    public final static QName ValidatePasswordBindingQSPort = new QName("http://itau.com.co/services/security/validatepassword/v1/definitions", "validatePasswordBindingQSPort");
    static {
        URL url = null;
        try {
            url = new URL("http://10.186.11.91:24200/services/security/ValidatePassword?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ValidatePasswordBindingQSService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/git-repo/Itaú/wsdl_firmas/ValidatePassword_soap.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ValidatePasswordBindingQSService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ValidatePasswordBindingQSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ValidatePasswordBindingQSService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ValidatePasswordBindingQSService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ValidatePasswordBindingQSService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ValidatePasswordBindingQSService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ValidatePasswordPortType
     */
    @WebEndpoint(name = "validatePasswordBindingQSPort")
    public ValidatePasswordPortType getValidatePasswordBindingQSPort() {
        return super.getPort(ValidatePasswordBindingQSPort, ValidatePasswordPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ValidatePasswordPortType
     */
    @WebEndpoint(name = "validatePasswordBindingQSPort")
    public ValidatePasswordPortType getValidatePasswordBindingQSPort(WebServiceFeature... features) {
        return super.getPort(ValidatePasswordBindingQSPort, ValidatePasswordPortType.class, features);
    }

}
