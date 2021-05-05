package com.vachiShop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class CartEntity extends BaseEntity{

	@OneToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;
	
	@ManyToMany
	@JoinTable(name = "cart_product", joinColumns = @JoinColumn(name  = "cart_id"),
										inverseJoinColumns = @JoinColumn(name = "product_id"))
	private List<ProductEntity> products_on_cart = new ArrayList<>();

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public List<ProductEntity> getProducts_on_cart() {
		return products_on_cart;
	}

	public void setProducts_on_cart(List<ProductEntity> products_on_cart) {
		this.products_on_cart = products_on_cart;
	}
	
	
}
