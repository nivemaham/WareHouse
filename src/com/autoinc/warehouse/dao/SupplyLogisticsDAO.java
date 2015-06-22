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
@Table(name = "supplylogistics")
public class SupplyLogisticsDAO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id",nullable=false)
	private int id;
	
	@OneToOne
    @JoinColumn(name = "location",nullable=false)
	private AddressDAO location;
	
	@Column(name = "serviceurl",nullable=false)
	private String serviceUrl;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public AddressDAO getLocation() {
		return location;
	}

	public void setLocation(AddressDAO location) {
		this.location = location;
	}

	public String getServiceUrl() {
		return serviceUrl;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}
}
