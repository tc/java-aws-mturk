/**
 * AWSMechanicalTurkRequesterLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class AWSMechanicalTurkRequesterLocator extends org.apache.axis.client.Service implements com.amazonaws.mturk.requester.AWSMechanicalTurkRequester {

    public AWSMechanicalTurkRequesterLocator() {
    }


    public AWSMechanicalTurkRequesterLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AWSMechanicalTurkRequesterLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AWSMechanicalTurkRequesterPort
    private java.lang.String AWSMechanicalTurkRequesterPort_address = "http://mechanicalturk.amazonaws.com/?Service=AWSMechanicalTurkRequester";

    public java.lang.String getAWSMechanicalTurkRequesterPortAddress() {
        return AWSMechanicalTurkRequesterPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AWSMechanicalTurkRequesterPortWSDDServiceName = "AWSMechanicalTurkRequesterPort";

    public java.lang.String getAWSMechanicalTurkRequesterPortWSDDServiceName() {
        return AWSMechanicalTurkRequesterPortWSDDServiceName;
    }

    public void setAWSMechanicalTurkRequesterPortWSDDServiceName(java.lang.String name) {
        AWSMechanicalTurkRequesterPortWSDDServiceName = name;
    }

    public com.amazonaws.mturk.requester.AWSMechanicalTurkRequesterPortType getAWSMechanicalTurkRequesterPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AWSMechanicalTurkRequesterPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAWSMechanicalTurkRequesterPort(endpoint);
    }

    public com.amazonaws.mturk.requester.AWSMechanicalTurkRequesterPortType getAWSMechanicalTurkRequesterPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.amazonaws.mturk.requester.AWSMechanicalTurkRequesterBindingStub _stub = new com.amazonaws.mturk.requester.AWSMechanicalTurkRequesterBindingStub(portAddress, this);
            _stub.setPortName(getAWSMechanicalTurkRequesterPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAWSMechanicalTurkRequesterPortEndpointAddress(java.lang.String address) {
        AWSMechanicalTurkRequesterPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.amazonaws.mturk.requester.AWSMechanicalTurkRequesterPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.amazonaws.mturk.requester.AWSMechanicalTurkRequesterBindingStub _stub = new com.amazonaws.mturk.requester.AWSMechanicalTurkRequesterBindingStub(new java.net.URL(AWSMechanicalTurkRequesterPort_address), this);
                _stub.setPortName(getAWSMechanicalTurkRequesterPortWSDDServiceName());
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
        if ("AWSMechanicalTurkRequesterPort".equals(inputPortName)) {
            return getAWSMechanicalTurkRequesterPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AWSMechanicalTurkRequester");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AWSMechanicalTurkRequesterPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AWSMechanicalTurkRequesterPort".equals(portName)) {
            setAWSMechanicalTurkRequesterPortEndpointAddress(address);
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
