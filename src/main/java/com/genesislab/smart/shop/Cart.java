package com.genesislab.smart.shop;

import java.util.List;

import com.genesislab.smart.smartcard.SmartCard;

/**
 * 
 */
public class Cart {

    /**
     * Default constructor
     */
    public Cart() {
    }

	/**
     * 
     */
    private List<Item> item;

    /**
     * 
     */
    private SmartCard smartCard;

    /**
     * 
     */
    private Table orderTable;

    /**
     * 
     */
    private double price;

    /**
     * 
     */
    private String submtTime;

    /**
     * 
     */
    private String supplyTime;

    /**
     * 
     */
    private String status;

    /**
     * 
     */
    private Employee closedBy;


    public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	public SmartCard getSmartCard() {
		return smartCard;
	}

	public void setSmartCard(SmartCard smartCard) {
		this.smartCard = smartCard;
	}

	public Table getOrderTable() {
		return orderTable;
	}

	public void setOrderTable(Table orderTable) {
		this.orderTable = orderTable;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSubmtTime() {
		return submtTime;
	}

	public void setSubmtTime(String submtTime) {
		this.submtTime = submtTime;
	}

	public String getSupplyTime() {
		return supplyTime;
	}

	public void setSupplyTime(String supplyTime) {
		this.supplyTime = supplyTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Employee getClosedBy() {
		return closedBy;
	}

	public void setClosedBy(Employee closedBy) {
		this.closedBy = closedBy;
	}

}