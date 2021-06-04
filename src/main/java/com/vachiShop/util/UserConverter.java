package com.vachiShop.util;

import com.vachiShop.DTO.UserDTO;
import com.vachiShop.entity.UserEntity;

public class UserConverter {
	
	public static UserEntity toEntity(UserDTO userDTO) {
		UserEntity userEntity = new UserEntity();
		userEntity.setFullName(userDTO.getFullName());
		userEntity.setUserName(userDTO.getUserName());
		userEntity.setPassWord(userDTO.getPassWord());
		userEntity.setEmail(userDTO.getEmail());
		userEntity.setStatus(userDTO.getStatus());
		
		return userEntity;
	}

}
