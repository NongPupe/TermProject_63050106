
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _Findbyyear_QNAME = new QName("http://service/", "findbyyear");
    private final static QName _Coviddata_QNAME = new QName("http://service/", "coviddata");
    private final static QName _FindbyyearResponse_QNAME = new QName("http://service/", "findbyyearResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Coviddata }
     * 
     */
    public Coviddata createCoviddata() {
        return new Coviddata();
    }

    /**
     * Create an instance of {@link FindbyyearResponse }
     * 
     */
    public FindbyyearResponse createFindbyyearResponse() {
        return new FindbyyearResponse();
    }

    /**
     * Create an instance of {@link Findbyyear }
     * 
     */
    public Findbyyear createFindbyyear() {
        return new Findbyyear();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Findbyyear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findbyyear")
    public JAXBElement<Findbyyear> createFindbyyear(Findbyyear value) {
        return new JAXBElement<Findbyyear>(_Findbyyear_QNAME, Findbyyear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coviddata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "coviddata")
    public JAXBElement<Coviddata> createCoviddata(Coviddata value) {
        return new JAXBElement<Coviddata>(_Coviddata_QNAME, Coviddata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindbyyearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findbyyearResponse")
    public JAXBElement<FindbyyearResponse> createFindbyyearResponse(FindbyyearResponse value) {
        return new JAXBElement<FindbyyearResponse>(_FindbyyearResponse_QNAME, FindbyyearResponse.class, null, value);
    }

}
