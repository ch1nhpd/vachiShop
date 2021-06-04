package com.vachiShop.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "bill")
public class BillEntity extends BaseEntity{
	
	@Column
	private String address;
	
	@Column
	private String phoneNumber;
	
	@Column
	private String receiver;
	
	@Column
	private String message;

	@ManyToOne
	@JoinColumn(name = "status_id")
	private StatusOfBillEntity status;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;
	
	@OneToMany(mappedBy = "bill")
	private List<BillProductEntity> billProducts;
	
	

	public List<BillProductEntity> getBillProducts() {
		return billProducts;
	}

	public void setBillProducts(List<BillProductEntity> billProducts) {
		this.billProducts = billProducts;
	}

	public StatusOfBillEntity getStatus() {
		return status;
	}

	public void setStatus(StatusOfBillEntity status) {
		this.status = status;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	
	
	
}
