
/**
 * WareHouseServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package org.example.www.warehouseservice;

        /**
        *  WareHouseServiceMessageReceiverInOut message receiver
        */

        public class WareHouseServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        WareHouseServiceSkeleton skel = (WareHouseServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("checkAvailability".equals(methodName)){
                
                org.example.www.warehouseservice.CheckAvailabilityResponse checkAvailabilityResponse1 = null;
	                        org.example.www.warehouseservice.CheckAvailability wrappedParam =
                                                             (org.example.www.warehouseservice.CheckAvailability)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.warehouseservice.CheckAvailability.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               checkAvailabilityResponse1 =
                                                   
                                                   
                                                         skel.checkAvailability(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), checkAvailabilityResponse1, false, new javax.xml.namespace.QName("http://www.example.org/WareHouseService/",
                                                    "checkAvailability"));
                                    } else 

            if("freeProduct".equals(methodName)){
                
                org.example.www.warehouseservice.FreeProductResponse freeProductResponse3 = null;
	                        org.example.www.warehouseservice.FreeProduct wrappedParam =
                                                             (org.example.www.warehouseservice.FreeProduct)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.warehouseservice.FreeProduct.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               freeProductResponse3 =
                                                   
                                                   
                                                         skel.freeProduct(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), freeProductResponse3, false, new javax.xml.namespace.QName("http://www.example.org/WareHouseService/",
                                                    "freeProduct"));
                                    } else 

            if("reserveProduct".equals(methodName)){
                
                org.example.www.warehouseservice.ReserveProductResponse reserveProductResponse5 = null;
	                        org.example.www.warehouseservice.ReserveProduct wrappedParam =
                                                             (org.example.www.warehouseservice.ReserveProduct)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.warehouseservice.ReserveProduct.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               reserveProductResponse5 =
                                                   
                                                   
                                                         skel.reserveProduct(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), reserveProductResponse5, false, new javax.xml.namespace.QName("http://www.example.org/WareHouseService/",
                                                    "reserveProduct"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (FreeProductFaultException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"freeProductFault");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (CheckAvailabilityFaultException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"checkAvailabilityFault");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (ReserveProductFaultException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"reserveProductFault");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
        
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.warehouseservice.CheckAvailability param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.warehouseservice.CheckAvailability.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.warehouseservice.CheckAvailabilityResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.warehouseservice.CheckAvailabilityResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.warehouseservice.CheckAvailabilityFault param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.warehouseservice.CheckAvailabilityFault.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.warehouseservice.FreeProduct param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.warehouseservice.FreeProduct.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.warehouseservice.FreeProductResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.warehouseservice.FreeProductResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.warehouseservice.FreeProductFault param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.warehouseservice.FreeProductFault.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.warehouseservice.ReserveProduct param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.warehouseservice.ReserveProduct.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.warehouseservice.ReserveProductResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.warehouseservice.ReserveProductResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.warehouseservice.ReserveProductFault param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.warehouseservice.ReserveProductFault.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.warehouseservice.CheckAvailabilityResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.warehouseservice.CheckAvailabilityResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.warehouseservice.CheckAvailabilityResponse wrapcheckAvailability(){
                                org.example.www.warehouseservice.CheckAvailabilityResponse wrappedElement = new org.example.www.warehouseservice.CheckAvailabilityResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.warehouseservice.FreeProductResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.warehouseservice.FreeProductResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.warehouseservice.FreeProductResponse wrapfreeProduct(){
                                org.example.www.warehouseservice.FreeProductResponse wrappedElement = new org.example.www.warehouseservice.FreeProductResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.warehouseservice.ReserveProductResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.warehouseservice.ReserveProductResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.warehouseservice.ReserveProductResponse wrapreserveProduct(){
                                org.example.www.warehouseservice.ReserveProductResponse wrappedElement = new org.example.www.warehouseservice.ReserveProductResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (org.example.www.warehouseservice.CheckAvailability.class.equals(type)){
                
                           return org.example.www.warehouseservice.CheckAvailability.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.warehouseservice.CheckAvailabilityResponse.class.equals(type)){
                
                           return org.example.www.warehouseservice.CheckAvailabilityResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.warehouseservice.CheckAvailabilityFault.class.equals(type)){
                
                           return org.example.www.warehouseservice.CheckAvailabilityFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.warehouseservice.FreeProduct.class.equals(type)){
                
                           return org.example.www.warehouseservice.FreeProduct.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.warehouseservice.FreeProductResponse.class.equals(type)){
                
                           return org.example.www.warehouseservice.FreeProductResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.warehouseservice.FreeProductFault.class.equals(type)){
                
                           return org.example.www.warehouseservice.FreeProductFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.warehouseservice.ReserveProduct.class.equals(type)){
                
                           return org.example.www.warehouseservice.ReserveProduct.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.warehouseservice.ReserveProductResponse.class.equals(type)){
                
                           return org.example.www.warehouseservice.ReserveProductResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.warehouseservice.ReserveProductFault.class.equals(type)){
                
                           return org.example.www.warehouseservice.ReserveProductFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    