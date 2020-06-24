package com.example.carbooking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.carbooking.model.User;

@Repository
public interface UserDao extends CrudRepository<User ,Integer>{
	
	public User findByUserNameAndPassword(String username,String password );

}
