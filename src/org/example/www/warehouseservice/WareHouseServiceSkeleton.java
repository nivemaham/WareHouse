/**
 * WareHouseServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package org.example.www.warehouseservice;

import com.autoinc.warehouse.businessControler.WarehouseControler;
import com.autoinc.warehouse.businessControler.WarehouseControlerImpl;
import com.autoinc.warehouse.util.WareHouseException;

/**
 * WareHouseServiceSkeleton java skeleton for the axisService
 */
public class WareHouseServiceSkeleton {
	
	WarehouseControler controler = new WarehouseControlerImpl();
	/**
	 * Auto generated method signature
	 * 
	 * @param checkAvailability
	 * @return checkAvailabilityResponse
	 * @throws CheckAvailabilityFaultException
	 */

	public org.example.www.warehouseservice.CheckAvailabilityResponse checkAvailability(
			org.example.www.warehouseservice.CheckAvailability checkAvailability)
			throws CheckAvailabilityFaultException {
		
		boolean result = false;
		try {
			result = controler.checkAvailability(
					checkAvailability.getProductId(),
					checkAvailability.getQuantity());
		} catch (WareHouseException e) {
			CheckAvailabilityFaultException ex = new CheckAvailabilityFaultException();
			CheckAvailabilityFault msg = new CheckAvailabilityFault();
			msg.localCheckAvailabilityFault ="ProductnotAvailable";
			msg.setCheckAvailabilityFault(
					new String("Product not found exception " +
							"thrown  by WarehouseWS"));
			ex.setFaultMessage(msg);
			throw ex;

		}

		CheckAvailabilityResponse response = new CheckAvailabilityResponse();

		response.setAvailabilityType(result ? "IMMEDIATE" : "IN PRODUCTION");
		response.setIsAvailable(result);
		response.setCustomerId(checkAvailability.getCustomerId());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param freeProduct
	 * @return freeProductResponse
	 * @throws FreeProductFaultException
	 */

	public org.example.www.warehouseservice.FreeProductResponse freeProduct(
			org.example.www.warehouseservice.FreeProduct freeProduct)
			throws FreeProductFaultException {
		
		FreeProductResponse response = new FreeProductResponse();
		
		try {
			response.setIsFree(controler.freeReservedProducts(freeProduct.getProductId(), freeProduct.getQuantity(), freeProduct.getWarehouseid()));
		} catch (WareHouseException e) {
			throw new FreeProductFaultException("Failed to free reserved product", e);
		}
		response.setOrderid(freeProduct.getOrderid());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param reserveProduct
	 * @return reserveProductResponse
	 * @throws ReserveProductFaultException
	 */

	public org.example.www.warehouseservice.ReserveProductResponse reserveProduct(
			org.example.www.warehouseservice.ReserveProduct reserveProduct)
			throws ReserveProductFaultException {

		ReserveProductResponse response = new ReserveProductResponse();
		
		try {
			response.setIsReserved(controler.reserveProducts(reserveProduct.getProductId(), reserveProduct.getQuantity()));
		} catch (WareHouseException e) {
			ReserveProductFaultException ex= new ReserveProductFaultException();
			ReserveProductFault fault = new ReserveProductFault();
			fault.localReserveProductFault="Cannot reserve requested products";
			ex.setFaultMessage(fault);
			throw ex;
		}
		response.setOrderid(reserveProduct.getOrderid());
		return response;
	}

}
