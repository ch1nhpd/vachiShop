package com.vachiShop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vachiShop.entity.FeedbackEntity;
import com.vachiShop.entity.ProductEntity;

public interface FeedbackRepo extends JpaRepository<FeedbackEntity, Long>{

	List<FeedbackEntity> findByProduct_id(long id);
}
