package com.vachiShop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class CartEntity extends BaseEntity{

	@OneToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;
	
	@OneToMany(mappedBy = "cartOfProduct")
	private List<ProductCartEntity> productCarts = new ArrayList<>();

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public List<ProductCartEntity> getProductCarts() {
		return productCarts;
	}

	public void setProductCarts(List<ProductCartEntity> productCarts) {
		this.productCarts = productCarts;
	}

	
	
}
