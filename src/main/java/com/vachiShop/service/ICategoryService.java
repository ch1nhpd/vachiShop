package com.vachiShop.service;

import java.util.List;

import com.vachiShop.DTO.CategoryDTO;
import com.vachiShop.DTO.ProductDTO;

public interface ICategoryService {
	List<ProductDTO> listProductOf(String code,int page);
	List<CategoryDTO> listCategory();
}
