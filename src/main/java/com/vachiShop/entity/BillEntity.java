package com.vachiShop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bill")
public class BillEntity extends BaseEntity{
	
	@Column
	private String address;

	@ManyToOne
	@JoinColumn(name = "status_id")
	private StatusOfBillEntity status;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;
	
	@ManyToMany
	@JoinTable(name = "bill_product" ,joinColumns =  @JoinColumn(name = "bill_id"), 
									inverseJoinColumns = @JoinColumn(name = "product_id"))
	private List<ProductEntity> products_on_bill = new ArrayList<>();

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

	public List<ProductEntity> getProducts() {
		return products_on_bill;
	}

	public void setProducts(List<ProductEntity> products) {
		this.products_on_bill = products;
	}
	
	
}
