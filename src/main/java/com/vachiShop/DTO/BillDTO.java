package com.vachiShop.DTO;

import java.util.List;

import com.vachiShop.entity.StatusOfBillEntity;

public class BillDTO extends AbstractDTO{


	private String address;
	
	private String phoneNumber;

	private String receiver;
	
	private String message;

	private StatusOfBillEntity status;
	
	private Long userId;

	private List<BillProductDTO> billProducts;

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

	public StatusOfBillEntity getStatus() {
		return status;
	}

	public void setStatus(StatusOfBillEntity status) {
		this.status = status;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public List<BillProductDTO> getBillProducts() {
		return billProducts;
	}

	public void setBillProducts(List<BillProductDTO> billProducts) {
		this.billProducts = billProducts;
	}
	
	
	
}
