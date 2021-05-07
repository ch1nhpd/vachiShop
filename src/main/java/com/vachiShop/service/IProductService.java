package com.vachiShop.service;

import java.util.List;

import com.vachiShop.DTO.ProductDTO;

public interface IProductService {
	List<ProductDTO> listSaleOff();
	List<ProductDTO> listLatest();
	List<ProductDTO> listTopRated();
	List<ProductDTO> listTopView();
}
