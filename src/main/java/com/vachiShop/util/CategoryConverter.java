package com.vachiShop.util;

import com.vachiShop.DTO.CategoryDTO;
import com.vachiShop.entity.CategoryEntity;

public class CategoryConverter {

	public static CategoryDTO toDTO(CategoryEntity categoryEntity) {
		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setId(categoryEntity.getId());
		categoryDTO.setCode(categoryEntity.getCode());
		categoryDTO.setName(categoryEntity.getName());
		return categoryDTO;
	}
}
