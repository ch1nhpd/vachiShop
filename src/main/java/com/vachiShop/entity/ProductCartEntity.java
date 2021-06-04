package com.vachiShop.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="produc_cart")
public class ProductCartEntity extends BaseEntity{
	
	private long quantity;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private ProductEntity productOnCart;
	
	@ManyToOne
	@JoinColumn(name = "cart_id")
	private CartEntity cartOfProduct;

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public ProductEntity getProductOnCart() {
		return productOnCart;
	}

	public void setProductOnCart(ProductEntity productOnCart) {
		this.productOnCart = productOnCart;
	}

	public CartEntity getCartOfProduct() {
		return cartOfProduct;
	}

	public void setCartOfProduct(CartEntity cartOfProduct) {
		this.cartOfProduct = cartOfProduct;
	}
	 
	
}
