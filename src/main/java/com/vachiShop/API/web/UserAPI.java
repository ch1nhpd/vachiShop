package com.vachiShop.API.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vachiShop.DTO.UserDTO;
import com.vachiShop.service.IUserService;

@RestController(value = "userApiOfWeb")
public class UserAPI {
	
	@Autowired
	private IUserService userService;

	@PostMapping("/api/user")
	public long creatUser(@RequestBody UserDTO userDTO) {
		return userService.save(userDTO);
	}
}
