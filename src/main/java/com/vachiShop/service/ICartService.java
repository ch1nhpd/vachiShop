package com.vachiShop.service;

import java.util.List;

import com.vachiShop.DTO.ProductCartDTO;

public interface ICartService {
	List<ProductCartDTO> productsOnCart(Long userId);
}
