package com.genesislab.smart.smartcard;

import java.util.*;

/**
 * 
 */
public class DiscountCard implements Loyality {

    /**
     * Default constructor
     */
    public DiscountCard() {
    }

    /**
     * 
     */
    private String discountPercentage;

    /**
     * 
     */
    private double discountAmount;

	public String getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(String discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}

    
}