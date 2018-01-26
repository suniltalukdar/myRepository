package com.myBank.app.model;

public class Branch {
	private String branchCd;
	private String branchName;
	private Address branchAdd;
	
	public String getBranchCd() {
		return branchCd;
	}
	public void setBranchCd(String branchCd) {
		this.branchCd = branchCd;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public Address getBranchAdd() {
		return branchAdd;
	}
	public void setBranchAdd(Address branchAdd) {
		this.branchAdd = branchAdd;
	}
	
	
	
}
