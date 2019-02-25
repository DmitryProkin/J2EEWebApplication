
package com.dmitry.lab1j2ee;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dmitry.lab1j2ee package. 
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

    private final static QName _GetAllBikes_QNAME = new QName("http://lab1J2ee.dmitry.com/", "getAllBikes");
    private final static QName _GetAllBikesResponse_QNAME = new QName("http://lab1J2ee.dmitry.com/", "getAllBikesResponse");
    private final static QName _GetFind_QNAME = new QName("http://lab1J2ee.dmitry.com/", "getFind");
    private final static QName _GetFindResponse_QNAME = new QName("http://lab1J2ee.dmitry.com/", "getFindResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dmitry.lab1j2ee
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFind }
     * 
     */
    public GetFind createGetFind() {
        return new GetFind();
    }

    /**
     * Create an instance of {@link GetFindResponse }
     * 
     */
    public GetFindResponse createGetFindResponse() {
        return new GetFindResponse();
    }

    /**
     * Create an instance of {@link GetAllBikes }
     * 
     */
    public GetAllBikes createGetAllBikes() {
        return new GetAllBikes();
    }

    /**
     * Create an instance of {@link GetAllBikesResponse }
     * 
     */
    public GetAllBikesResponse createGetAllBikesResponse() {
        return new GetAllBikesResponse();
    }

    /**
     * Create an instance of {@link Motorbike }
     * 
     */
    public Motorbike createMotorbike() {
        return new Motorbike();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBikes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lab1J2ee.dmitry.com/", name = "getAllBikes")
    public JAXBElement<GetAllBikes> createGetAllBikes(GetAllBikes value) {
        return new JAXBElement<GetAllBikes>(_GetAllBikes_QNAME, GetAllBikes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBikesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lab1J2ee.dmitry.com/", name = "getAllBikesResponse")
    public JAXBElement<GetAllBikesResponse> createGetAllBikesResponse(GetAllBikesResponse value) {
        return new JAXBElement<GetAllBikesResponse>(_GetAllBikesResponse_QNAME, GetAllBikesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFind }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lab1J2ee.dmitry.com/", name = "getFind")
    public JAXBElement<GetFind> createGetFind(GetFind value) {
        return new JAXBElement<GetFind>(_GetFind_QNAME, GetFind.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lab1J2ee.dmitry.com/", name = "getFindResponse")
    public JAXBElement<GetFindResponse> createGetFindResponse(GetFindResponse value) {
        return new JAXBElement<GetFindResponse>(_GetFindResponse_QNAME, GetFindResponse.class, null, value);
    }

}
