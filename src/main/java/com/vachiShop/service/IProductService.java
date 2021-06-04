package com.vachiShop.service;

import java.util.List;
import java.util.Map;

import com.vachiShop.DTO.ProductDTO;

public interface IProductService {
	List<ProductDTO> listSaleOff();
	List<ProductDTO> listLatest();
	List<ProductDTO> listTopRated();
	List<ProductDTO> listTopView();
	List<ProductDTO> listRelated(ProductDTO product);
	ProductDTO findByCode(String code);
	List<ProductDTO> searchResults(Map<String, String> params);
}
