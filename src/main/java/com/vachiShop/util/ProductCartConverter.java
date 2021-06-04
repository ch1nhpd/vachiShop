package com.vachiShop.util;

import com.vachiShop.DTO.ProductCartDTO;
import com.vachiShop.entity.ProductCartEntity;

public class ProductCartConverter {
	
	public static ProductCartDTO toDTO(ProductCartEntity productCartEntity) {
		ProductCartDTO productCartDTO = new ProductCartDTO();
		productCartDTO.setId(productCartEntity.getId());
		productCartDTO.setIdCart(productCartEntity.getCartOfProduct().getId());
		productCartDTO.setProductId(productCartEntity.getProductOnCart().getId());
		productCartDTO.setQuantity(productCartEntity.getQuantity());
		return productCartDTO;
	}

}
