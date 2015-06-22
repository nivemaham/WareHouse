
/**
 * ReserveProductFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package org.example.www.warehouseservice;

public class ReserveProductFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1434805302500L;
    
    private org.example.www.warehouseservice.ReserveProductFault faultMessage;

    
        public ReserveProductFaultException() {
            super("ReserveProductFaultException");
        }

        public ReserveProductFaultException(java.lang.String s) {
           super(s);
        }

        public ReserveProductFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ReserveProductFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.example.www.warehouseservice.ReserveProductFault msg){
       faultMessage = msg;
    }
    
    public org.example.www.warehouseservice.ReserveProductFault getFaultMessage(){
       return faultMessage;
    }
}
    