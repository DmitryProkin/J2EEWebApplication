
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

    private final static QName _GetAllPersons_QNAME = new QName("http://lab1J2ee.dmitry.com/", "getAllPersons");
    private final static QName _GetFind_QNAME = new QName("http://lab1J2ee.dmitry.com/", "getFind");
    private final static QName _GetAllPersonsResponse_QNAME = new QName("http://lab1J2ee.dmitry.com/", "getAllPersonsResponse");
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
     * Create an instance of {@link GetAllPersonsResponse }
     * 
     */
    public GetAllPersonsResponse createGetAllPersonsResponse() {
        return new GetAllPersonsResponse();
    }

    /**
     * Create an instance of {@link GetFindResponse }
     * 
     */
    public GetFindResponse createGetFindResponse() {
        return new GetFindResponse();
    }

    /**
     * Create an instance of {@link GetAllPersons }
     * 
     */
    public GetAllPersons createGetAllPersons() {
        return new GetAllPersons();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPersons }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lab1J2ee.dmitry.com/", name = "getAllPersons")
    public JAXBElement<GetAllPersons> createGetAllPersons(GetAllPersons value) {
        return new JAXBElement<GetAllPersons>(_GetAllPersons_QNAME, GetAllPersons.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPersonsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lab1J2ee.dmitry.com/", name = "getAllPersonsResponse")
    public JAXBElement<GetAllPersonsResponse> createGetAllPersonsResponse(GetAllPersonsResponse value) {
        return new JAXBElement<GetAllPersonsResponse>(_GetAllPersonsResponse_QNAME, GetAllPersonsResponse.class, null, value);
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
