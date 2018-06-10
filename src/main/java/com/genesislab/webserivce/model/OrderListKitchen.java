package com.genesislab.webserivce.model;

import java.util.*;

import com.genesislab.webservice.handle.WSModel;

/**
 * 
 */
public class OrderListKitchen extends WSModel {

    /**
     * Default constructor
     */
    public OrderListKitchen() {
    }

    /**
     * 
     */
    private String shopId;

    /**
     * 
     */
    private int empId;

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

    
}