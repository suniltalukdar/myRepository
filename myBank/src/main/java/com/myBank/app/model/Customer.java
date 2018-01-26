package com.myBank.app.model;

public class Customer {
	private String custName;
	private String custId;
	private long custMobileNo;
	private Address currentAdd;
	private Address permanentAdd;
	
	
	public Address getCurrentAdd() {
		return currentAdd;
	}
	public void setCurrentAdd(Address currentAdd) {
		this.currentAdd = currentAdd;
	}
	public Address getPermanentAdd() {
		return permanentAdd;
	}
	public void setPermanentAdd(Address permanentAdd) {
		this.permanentAdd = permanentAdd;
	}	
	public String getCustName() {
		return custName;
	}	
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public long getCustMobileNo() {
		return custMobileNo;
	}
	public void setCustMobileNo(long custMobileNo) {
		this.custMobileNo = custMobileNo;
	}
	
	
}
