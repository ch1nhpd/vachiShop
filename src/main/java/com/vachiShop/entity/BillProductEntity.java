package com.vachiShop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bill_product")
public class BillProductEntity extends BaseEntity{

	@Column
	private Long quantity;
	
	@ManyToOne()
	@JoinColumn(name = "bill_id")
	private BillEntity bill;
	
	@ManyToOne()
	@JoinColumn(name = "product_id")
	private ProductEntity productOnBill;

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public BillEntity getBill() {
		return bill;
	}

	public void setBill(BillEntity bill) {
		this.bill = bill;
	}

	public ProductEntity getProductOnBill() {
		return productOnBill;
	}

	public void setProductOnBill(ProductEntity productOnBill) {
		this.productOnBill = productOnBill;
	}
	
	
}
