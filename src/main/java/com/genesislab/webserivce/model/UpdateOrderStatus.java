package com.genesislab.webserivce.model;

import java.util.*;

import com.genesislab.webservice.handle.WSModel;

/**
 * 
 */
public class UpdateOrderStatus extends WSModel {

    /**
     * Default constructor
     */
    public UpdateOrderStatus() {
    }

    /**
     * 
     */
    private int orderId;

    /**
     * 
     */
    private boolean status;

    /**
     * 
     */
    private int empId;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

    
}