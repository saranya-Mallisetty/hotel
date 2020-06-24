package com.example.carbooking.serviceimpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carbooking.dao.UserDao;
import com.example.carbooking.dto.UserRequestDto;
import com.example.carbooking.model.User;
import com.example.carbooking.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao userDao;

	@Override
	public void saveUserDetails(UserRequestDto userRequestDto) {
		User user = new User();
		BeanUtils.copyProperties(userRequestDto,user);
		userDao.save(user);
		
		
	}

	@Override
	public boolean authenticate(String username, String password) {
	User user=userDao.findByUserNameAndPassword(username, password);
		if(user  !=null) return true;
		return false;
		
	}

	

}
