/**
 * EjemploWSBeanServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc.com.sintelti;

public class EjemploWSBeanServiceLocator extends org.apache.axis.client.Service implements mc.com.sintelti.EjemploWSBeanService {

    public EjemploWSBeanServiceLocator() {
    }


    public EjemploWSBeanServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EjemploWSBeanServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EjemploWSBean
    private java.lang.String EjemploWSBean_address = "http://localhost:8080/DemoWebService/services/EjemploWSBean";

    public java.lang.String getEjemploWSBeanAddress() {
        return EjemploWSBean_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EjemploWSBeanWSDDServiceName = "EjemploWSBean";

    public java.lang.String getEjemploWSBeanWSDDServiceName() {
        return EjemploWSBeanWSDDServiceName;
    }

    public void setEjemploWSBeanWSDDServiceName(java.lang.String name) {
        EjemploWSBeanWSDDServiceName = name;
    }

    public mc.com.sintelti.EjemploWSBean getEjemploWSBean() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EjemploWSBean_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEjemploWSBean(endpoint);
    }

    public mc.com.sintelti.EjemploWSBean getEjemploWSBean(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mc.com.sintelti.EjemploWSBeanSoapBindingStub _stub = new mc.com.sintelti.EjemploWSBeanSoapBindingStub(portAddress, this);
            _stub.setPortName(getEjemploWSBeanWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEjemploWSBeanEndpointAddress(java.lang.String address) {
        EjemploWSBean_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mc.com.sintelti.EjemploWSBean.class.isAssignableFrom(serviceEndpointInterface)) {
                mc.com.sintelti.EjemploWSBeanSoapBindingStub _stub = new mc.com.sintelti.EjemploWSBeanSoapBindingStub(new java.net.URL(EjemploWSBean_address), this);
                _stub.setPortName(getEjemploWSBeanWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EjemploWSBean".equals(inputPortName)) {
            return getEjemploWSBean();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://sintelti.com.mc", "EjemploWSBeanService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://sintelti.com.mc", "EjemploWSBean"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EjemploWSBean".equals(portName)) {
            setEjemploWSBeanEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
