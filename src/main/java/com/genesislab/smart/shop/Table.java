package com.genesislab.smart.shop;

/**
 * 
 */
public class Table {

    /**
     * Default constructor
     */
	public Table() {
    }

	/**
     * 
     */
    private int tblNo;

    /**
     * 
     */
    private String tblName;

    /**
     * 
     */
    private int seatCount;

    /**
     * 
     */
    private String note;

    /**
     * 
     */
    private boolean isQR;

    public int getTblNo() {
		return tblNo;
	}

	public void setTblNo(int tblNo) {
		this.tblNo = tblNo;
	}

	public String getTblName() {
		return tblName;
	}

	public void setTblName(String tblName) {
		this.tblName = tblName;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean isQR() {
		return isQR;
	}

	public void setQR(boolean isQR) {
		this.isQR = isQR;
	}

}