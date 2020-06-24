package com.example.carbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.carbooking.dto.Credentials;
import com.example.carbooking.dto.UserRequestDto;
import com.example.carbooking.service.UserService;


@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping(value="/users")
	public String register(@RequestBody UserRequestDto userRequestDto) {
	userService.saveUserDetails(userRequestDto)	;
	return "success";
	}
	@PostMapping(value="/users/login")
   public String login(@RequestBody Credentials credentials) {
		boolean isExists=userService.authenticate(credentials.getUsername(),credentials.getPassword());
		if(isExists) 
			return "success";
		return "invalid";
		
	}

}
