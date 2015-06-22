package com.autoinc.warehouse.businessControler;

import com.autoinc.warehouse.util.WareHouseException;

public interface WarehouseControler {
	
	
	Boolean checkAvailability(int productId, int quantity) throws WareHouseException;
	
	 boolean reserveProducts(int productSpecId, int qunatity)
			throws WareHouseException ;
	 
	 boolean freeReservedProducts(int productSpecId, int qunatity , int warehouseId)throws WareHouseException;
}
