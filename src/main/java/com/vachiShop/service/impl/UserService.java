package com.vachiShop.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.corba.se.impl.orbutil.closure.Constant;
import com.vachiShop.DTO.UserDTO;
import com.vachiShop.constant.SystemConstant;
import com.vachiShop.entity.RoleEntity;
import com.vachiShop.entity.UserEntity;
import com.vachiShop.repository.RoleRepo;
import com.vachiShop.repository.UserRepo;
import com.vachiShop.service.IUserService;
import com.vachiShop.util.UserConverter;

@Service
public class UserService implements IUserService{
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired RoleRepo roleRepo;

	@Override
	public long save(UserDTO userDTO) {
		userDTO.setStatus(SystemConstant.ACTIVE_STATUS);
		UserEntity userEntity = UserConverter.toEntity(userDTO);
		List<RoleEntity> roles = new ArrayList<>();
		roles.add(roleRepo.findOneByCode("USER"));
		userEntity.setRoles(roles);
		return userRepo.save(userEntity).getId();
	}
	
	

}
