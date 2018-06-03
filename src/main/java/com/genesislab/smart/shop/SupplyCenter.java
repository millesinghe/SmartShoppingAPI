package com.genesislab.smart.shop;

import java.util.*;

/**
 * 
 */
public class SupplyCenter {

    /**
     * Default constructor
     */
    public SupplyCenter() {
    }

	/**
     * 
     */
    private List<Cart> orders;

    /**
	 * @return the orders
	 */
	public List<Cart> getOrders() {
		return orders;
	}

	/**
	 * @param orders the orders to set
	 */
	public void setOrders(List<Cart> orders) {
		this.orders = orders;
	}


}