package com.example.carbooking.service;

import com.example.carbooking.dto.UserRequestDto;

public interface UserService {

	void saveUserDetails(UserRequestDto userRequestDto);

	boolean authenticate(String username, String password);

}
