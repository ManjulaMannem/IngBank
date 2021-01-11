package com.bak.bankkata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CustomerAccountDetails {
    @Id
	@Column  
	private int id;  
    @Column  
	private int accountno;  
	@Column  
	private String name;  
	@Column  
	private int mobileno;  
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	@Override
	public String toString() {
		return "CustomerAccountDetails [id=" + id + ", accountno=" + accountno + ", name=" + name + ", mobileno="
				+ mobileno + ", address=" + address + ", amount=" + amount + ", status=" + status + ", email=" + email
				+ ", modifiedon=" + modifiedon + "]";
	}
	public CustomerAccountDetails(int id, int accountno, String name, int mobileno, String address, long amount,
			String status, String email, String modifiedon) {
		super();
		this.id = id;
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
