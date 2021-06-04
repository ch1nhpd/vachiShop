package com.vachiShop.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vachiShop.entity.ProductEntity;

@Repository
@Transactional
public interface ProductRepo extends JpaRepository<ProductEntity, Long>, JpaSpecificationExecutor<ProductEntity>{
	List<ProductEntity> findBySaleOffGreaterThan(Long saleOff);
	List<ProductEntity> findAllByOrderByIdDesc();
	List<ProductEntity> findAllByOrderByViewDesc();
	List<ProductEntity> findAllByOrderByRateAvgDesc();
	ProductEntity findByCode(String code);
	List<ProductEntity> findByNameContaining(String name);
}
