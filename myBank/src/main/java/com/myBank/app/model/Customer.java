package com.myBank.app.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="customer_details")
public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column
	private String custName;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String custId;
	@Column
	@NotNull
	private long custMobileNo;
	@Column
	@NotNull
	private Address currentAdd;
	@Column
	@NotNull
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
