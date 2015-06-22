
/**
 * FreeProductFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package org.example.www.warehouseservice;

public class FreeProductFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1434805302431L;
    
    private org.example.www.warehouseservice.FreeProductFault faultMessage;

    
        public FreeProductFaultException() {
            super("FreeProductFaultException");
        }

        public FreeProductFaultException(java.lang.String s) {
           super(s);
        }

        public FreeProductFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public FreeProductFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.example.www.warehouseservice.FreeProductFault msg){
       faultMessage = msg;
    }
    
    public org.example.www.warehouseservice.FreeProductFault getFaultMessage(){
       return faultMessage;
    }
}
    