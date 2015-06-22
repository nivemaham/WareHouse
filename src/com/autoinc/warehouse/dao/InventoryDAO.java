package com.autoinc.warehouse.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "inventory")
public class InventoryDAO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue
	@Column(name = "id",nullable=false)
	private int id;
	
	  
	@OneToOne
	@JoinColumn(name = "warehouseId",nullable=false)
	private WarehouseDAO warehouse;
	
	@Column(name = "productSpecId",nullable=false)
	private int productSpecId;
	
	@Column(name = "quantity",nullable=false)
	private int quantity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public WarehouseDAO getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(WarehouseDAO warehouse) {
		this.warehouse = warehouse;
	}

	

	public int getProductSpecId() {
		return productSpecId;
	}

	public void setProductSpecId(int productSpecId) {
		this.productSpecId = productSpecId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
