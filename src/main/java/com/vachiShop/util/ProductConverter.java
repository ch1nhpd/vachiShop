package com.vachiShop.util;

import com.vachiShop.DTO.ProductDTO;
import com.vachiShop.entity.ProductEntity;

public class ProductConverter {
	public static  ProductDTO toDTO(ProductEntity productEntity) {
		ProductDTO productDTO = new ProductDTO() ;
		productDTO.setName(productEntity.getName());
		productDTO.setPrice(productEntity.getPrice());
		productDTO.setSaleOff(productEntity.getSaleOff());
		productDTO.setView(productEntity.getView());
		productDTO.setCode(productEntity.getCode());
		productDTO.setRateAvg(productEntity.getRateAvg());
		return productDTO;
	}
}
