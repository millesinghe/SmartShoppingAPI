package com.genesislab.smart.smartcard;

import java.util.List;

import com.genesislab.smart.shop.Cart;

/**
 * 
 */
public class SmartCard {

    /**
     * Default constructor
     */
	public SmartCard() {
    }

    /**
     * 
     */
    private int cardNo;

    /**
     * 
     */
    private boolean isQR;

    /**
     * 
     */
    private int usedCount;

    /**
     * 
     */
    private boolean isActivate;

    /**
     * 
     */
    private boolean isAbanded;

    /**
     * 
     */
    private List<Cart> boughtCarts;

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public boolean isQR() {
		return isQR;
	}

	public void setQR(boolean isQR) {
		this.isQR = isQR;
	}

	public int getUsedCount() {
		return usedCount;
	}

	public void setUsedCount(int usedCount) {
		this.usedCount = usedCount;
	}

	public boolean isActivate() {
		return isActivate;
	}

	public void setActivate(boolean isActivate) {
		this.isActivate = isActivate;
	}

	public boolean isAbanded() {
		return isAbanded;
	}

	public void setAbanded(boolean isAbanded) {
		this.isAbanded = isAbanded;
	}

	public List<Cart> getBoughtCarts() {
		return boughtCarts;
	}

	public void setBoughtCarts(List<Cart> boughtCarts) {
		this.boughtCarts = boughtCarts;
	}


}