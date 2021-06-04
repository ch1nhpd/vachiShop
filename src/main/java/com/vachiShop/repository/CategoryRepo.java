package com.vachiShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vachiShop.entity.CategoryEntity;

@Repository
public interface CategoryRepo extends JpaRepository<CategoryEntity, Long>{
	CategoryEntity findById(Long id);
	CategoryEntity findByCode(String code);

}
