package com.genesislab.smart.shop;

/**
 * 
 */
public class Item {

    /**
     * Default constructor
     */
    public Item() {
    }

    /**
     * 
     */
    private String idItem;

    /**
     * 
     */
    private String itemName;

    /**
     * 
     */
    private String itemDesc;

    /**
     * 
     */
    private double itemUnitPrice;

    /**
     * 
     */
    private String itemMetric;

    /**
     * 
     */
    private double availableUnits;

	public String getIdItem() {
		return idItem;
	}

	public void setIdItem(String idItem) {
		this.idItem = idItem;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public double getItemUnitPrice() {
		return itemUnitPrice;
	}

	public void setItemUnitPrice(double itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}

	public String getItemMetric() {
		return itemMetric;
	}

	public void setItemMetric(String itemMetric) {
		this.itemMetric = itemMetric;
	}

	public double getAvailableUnits() {
		return availableUnits;
	}

	public void setAvailableUnits(double availableUnits) {
		this.availableUnits = availableUnits;
	}



}