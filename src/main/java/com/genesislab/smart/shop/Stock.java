package com.genesislab.smart.shop;

import java.util.List;

/**
 * 
 */
public class Stock {

    /**
     * Default constructor
     */
    public Stock() {
    }

    /**
     * 
     */
    private List<Item> itemList;

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}


}