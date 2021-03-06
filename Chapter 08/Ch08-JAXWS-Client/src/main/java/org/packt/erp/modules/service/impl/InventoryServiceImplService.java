
package org.packt.erp.modules.service.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "InventoryServiceImplService", targetNamespace = "http://impl.service.modules.erp.packt.org/", wsdlLocation = "http://localhost:8080/ch08/inventory-dao?wsdl")
public class InventoryServiceImplService
    extends Service
{

    private final static URL INVENTORYSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException INVENTORYSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName INVENTORYSERVICEIMPLSERVICE_QNAME = new QName("http://impl.service.modules.erp.packt.org/", "InventoryServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ch08/inventory-dao?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INVENTORYSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        INVENTORYSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public InventoryServiceImplService() {
        super(__getWsdlLocation(), INVENTORYSERVICEIMPLSERVICE_QNAME);
    }

    public InventoryServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), INVENTORYSERVICEIMPLSERVICE_QNAME, features);
    }

    public InventoryServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, INVENTORYSERVICEIMPLSERVICE_QNAME);
    }

    public InventoryServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INVENTORYSERVICEIMPLSERVICE_QNAME, features);
    }

    public InventoryServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InventoryServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns InventoryServiceImpl
     */
    @WebEndpoint(name = "InventoryServiceImplPort")
    public InventoryServiceImpl getInventoryServiceImplPort() {
        return super.getPort(new QName("http://impl.service.modules.erp.packt.org/", "InventoryServiceImplPort"), InventoryServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InventoryServiceImpl
     */
    @WebEndpoint(name = "InventoryServiceImplPort")
    public InventoryServiceImpl getInventoryServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.service.modules.erp.packt.org/", "InventoryServiceImplPort"), InventoryServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INVENTORYSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw INVENTORYSERVICEIMPLSERVICE_EXCEPTION;
        }
        return INVENTORYSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
