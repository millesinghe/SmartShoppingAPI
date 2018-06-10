package com.genesislab.webserivce.model;

import com.genesislab.webservice.handle.WSModel;

/**
 * 
 */
public class UpdateItemStatus extends WSModel {

    /**
     * Default constructor
     */
    public UpdateItemStatus() {
    }

    /**
     * 
     */
    private String itemId;

    /**
     * 
     */
    private boolean status;

    /**
     * 
     */
    private String note;

    /**
     * 
     */
    private int emId;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getEmId() {
		return emId;
	}

	public void setEmId(int emId) {
		this.emId = emId;
	}

    
}