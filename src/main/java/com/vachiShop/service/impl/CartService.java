package com.vachiShop.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vachiShop.DTO.ProductCartDTO;
import com.vachiShop.entity.ProductCartEntity;
import com.vachiShop.repository.CartRepo;
import com.vachiShop.service.ICartService;
import com.vachiShop.util.ProductCartConverter;

@Service
public class CartService implements ICartService{

	@Autowired 
	private CartRepo cartRepo;
	
	@Override
	public List<ProductCartDTO> productsOnCart(Long userId) {
		List<ProductCartDTO> listResult = new ArrayList<>();
		for (ProductCartEntity productCartEntity : cartRepo.findByUser_id(userId).getProductCarts()) {
			listResult.add(ProductCartConverter.toDTO(productCartEntity));
		}
		return listResult;
	}

	
}
