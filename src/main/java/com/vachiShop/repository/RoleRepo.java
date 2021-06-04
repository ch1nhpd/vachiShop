package com.vachiShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vachiShop.entity.RoleEntity;

public interface RoleRepo extends JpaRepository<RoleEntity, Long>{
	RoleEntity findOneByCode(String code);
}
