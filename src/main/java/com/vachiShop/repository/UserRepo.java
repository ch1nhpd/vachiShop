package com.vachiShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vachiShop.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Long>{

	UserEntity findOneByUserNameAndStatus(String userName, int status);
}
