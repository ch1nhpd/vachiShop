package com.vachiShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vachiShop.entity.CartEntity;
import com.vachiShop.entity.ProductCartEntity;

public interface ProductCartRepo extends JpaRepository<ProductCartEntity, Long>{
	ProductCartEntity findOneByCartOfProduct(CartEntity cartEntity);
}
