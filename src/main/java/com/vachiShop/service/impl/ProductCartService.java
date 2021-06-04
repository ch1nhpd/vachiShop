package com.vachiShop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vachiShop.DTO.ProductCartDTO;
import com.vachiShop.entity.ProductCartEntity;
import com.vachiShop.repository.ProductCartRepo;
import com.vachiShop.service.IProductCartService;

@Service
public class ProductCartService implements IProductCartService{
	
	@Autowired
	private ProductCartRepo productCartRepo;

	@Override
	public void update(List<ProductCartDTO> productCartDTOs) {
		for (ProductCartDTO productCartDTO : productCartDTOs) {
			ProductCartEntity  productCartEntity = productCartRepo.findOne(productCartDTO.getId());
			productCartEntity.setQuantity(productCartDTO.getQuantity());
			productCartRepo.save(productCartEntity);
		}
		
	}

	

	

}
