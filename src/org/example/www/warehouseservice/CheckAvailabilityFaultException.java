
/**
 * CheckAvailabilityFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package org.example.www.warehouseservice;

public class CheckAvailabilityFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1434805302480L;
    
    private org.example.www.warehouseservice.CheckAvailabilityFault faultMessage;

    
        public CheckAvailabilityFaultException() {
            super("CheckAvailabilityFaultException");
        }

        public CheckAvailabilityFaultException(java.lang.String s) {
           super(s);
        }

        public CheckAvailabilityFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public CheckAvailabilityFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.example.www.warehouseservice.CheckAvailabilityFault msg){
       faultMessage = msg;
    }
    
    public org.example.www.warehouseservice.CheckAvailabilityFault getFaultMessage(){
       return faultMessage;
    }
}
    