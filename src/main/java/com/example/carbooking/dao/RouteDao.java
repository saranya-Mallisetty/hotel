package com.example.carbooking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.carbooking.model.Route;
@Repository
public interface RouteDao extends CrudRepository<Route,Integer> {

	Iterable<Route> findAll();
	

	
}
