package com.vachiShop.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vachiShop.DTO.CategoryDTO;
import com.vachiShop.DTO.ProductDTO;
import com.vachiShop.entity.CategoryEntity;
import com.vachiShop.entity.ProductEntity;
import com.vachiShop.repository.CategoryRepo;
import com.vachiShop.service.ICategoryService;
import com.vachiShop.util.CategoryConverter;
import com.vachiShop.util.ProductConverter;

@Service
public class CategoryService implements ICategoryService{

	@Autowired
	private CategoryRepo categoryRepo;
	
	@Override
	public List<ProductDTO> listProductOf(String code,int page) {
		int maxPageItem = 12;
		List<ProductEntity> listProductEntity = categoryRepo.findByCode(code).getProducts();
		List<ProductDTO> listResults = new ArrayList<ProductDTO>();
		for(int i = maxPageItem*(page-1); i<maxPageItem*page;++i) {
			listResults.add(ProductConverter.toDTO(listProductEntity.get(i)));
		}
		return listResults;
	}

	@Override
	public List<CategoryDTO> listCategory() {
		List<CategoryDTO> listResults = new ArrayList<CategoryDTO>();
		for (CategoryEntity categoryEntity : categoryRepo.findAll()) {
			listResults.add(CategoryConverter.toDTO(categoryEntity));
		}
		return listResults;
	}

}
