package com.vachiShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vachiShop.entity.ProductEntity;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, Long>{

}
