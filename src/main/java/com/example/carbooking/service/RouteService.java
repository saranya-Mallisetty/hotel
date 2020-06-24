package com.example.carbooking.service;

import java.util.List;

import com.example.carbooking.dto.Routedto;

public interface RouteService {

	 List<Routedto> getSourceAndDestination(String source, String destination);
		

}
