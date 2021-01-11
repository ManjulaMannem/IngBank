package com.bak.bankkata.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class CustomerAccountDetails {
//	reference_no, name, mobile no, address, identity, identity_no, status(P - pending, C- completed), branch_id
    @Id
	@Column  
	private int accountno;  
	//defining name as column name  
	@Column  
	private String name;  
	//defining age as column name  
	@Column  
	private int mobileno;  
	//defining email as column name  
	@Column  
	private String address;
	
	@Column  
	private long amount;
	@Column  
	private String status;
	@Column  
	private String email;
	@Column  
	private String modifiedon;
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getModifiedon() {
		return modifiedon;
	}
	public void setModifiedon(String modifiedon) {
		this.modifiedon = modifiedon;
	}
	public CustomerAccountDetails(int accountno, String name, int mobileno, String address, long amount, String status,
			String email, String modifiedon) {
		super();
		this.accountno = accountno;
		this.name = name;
		this.mobileno = mobileno;
		this.address = address;
		this.amount = amount;
		this.status = status;
		this.email = email;
		this.modifiedon = modifiedon;
	}
	
	
	
}
