package com.vachiShop.DTO;

public class BillProductDTO extends AbstractDTO{

	private Long quantity;
	
	private Long idBill;
	
	private Long idProduct;

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getIdBill() {
		return idBill;
	}

	public void setIdBill(Long idBill) {
		this.idBill = idBill;
	}

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}
	
	
	
	

}
