package com.genesislab.webserivce.model;

import java.util.List;

import com.genesislab.smart.shop.Item;
import com.genesislab.webservice.handle.WSModel;

/**
 * 
 */
public class SubmitOrder extends WSModel {

    /**
     * Default constructor
     */
    public SubmitOrder() {
    }

    /**
     * 
     */
    private int customerId;

    /**
     * 
     */
    private int tableId;

    /**
     * 
     */
    private List<Item> orderList;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getTableId() {
		return tableId;
	}

	public void setTableId(int tableId) {
		this.tableId = tableId;
	}

	public List<Item> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Item> orderList) {
		this.orderList = orderList;
	}

    
    
}