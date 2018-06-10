package com.genesislab.webserivce.model;

import java.util.List;

import com.genesislab.webservice.handle.WSModel;

/**
 * 
 */
public class AvailableItems extends WSModel {

    /**
     * Default constructor
     */
    public AvailableItems() {
    	super();
    }

    /**
     * 
     */
    private String shopId;

    /**
     * 
     */
    private String dateUpdate;

    /**
     * 
     */
    private List<String> availableIdList;

    /**
     * 
     */
    private List<String> notAvailableIdList;

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getDateUpdate() {
		return dateUpdate;
	}

	public void setDateUpdate(String dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	public List<String> getAvailableIdList() {
		return availableIdList;
	}

	public void setAvailableIdList(List<String> availableList) {
		this.availableIdList = availableList;
	}

	public List<String> getNotAvailableIdList() {
		return notAvailableIdList;
	}

	public void setNotAvailableList(List<String> notAvailableList) {
		this.notAvailableIdList = notAvailableList;
	}

}