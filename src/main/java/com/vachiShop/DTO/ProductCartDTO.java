package com.vachiShop.DTO;

public class ProductCartDTO extends AbstractDTO{
	
	
	private Long productId;
	
	private long idCart;
	
	private long quantity;


	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public long getIdCart() {
		return idCart;
	}

	public void setIdCart(long idCart) {
		this.idCart = idCart;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	
	
	

}
