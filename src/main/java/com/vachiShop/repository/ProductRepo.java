package com.vachiShop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vachiShop.entity.ProductEntity;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, Long>{
	List<ProductEntity> findBySaleOffGreaterThan(Long saleOff);
	List<ProductEntity> findAllOrderByIdDesc();
	List<ProductEntity> findAllOrderByViewDesc();
	List<ProductEntity> findAllOrderByRateAvgDesc();
}
