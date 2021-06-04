package com.vachiShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vachiShop.entity.CartEntity;

public interface CartRepo extends JpaRepository<CartEntity, Long>{

	CartEntity findByUser_id(Long userId);
	
}
