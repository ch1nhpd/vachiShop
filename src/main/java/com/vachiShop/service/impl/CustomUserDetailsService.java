package com.vachiShop.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vachiShop.DTO.MyUser;
import com.vachiShop.constant.SystemConstant;
import com.vachiShop.entity.RoleEntity;
import com.vachiShop.entity.UserEntity;
import com.vachiShop.repository.UserRepo;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity userEntity = userRepo.findOneByUserNameAndStatus(username, SystemConstant.ACTIVE_STATUS);
		
		if(userEntity==null) {
			throw new UsernameNotFoundException("User not found");
		}
		
		List<GrantedAuthority> authorities = new ArrayList<>();
		for (RoleEntity role : userEntity.getRoles()) {
			authorities.add(new SimpleGrantedAuthority(role.getCode()));
		}
		
		MyUser myUser = new MyUser(userEntity.getUserName(), userEntity.getPassWord(), 
				true, true, true, true, authorities);
		myUser.setFullName(userEntity.getFullName());
		
		return myUser;
	}

}
