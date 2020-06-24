package com.example.carbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.carbooking.dto.Routedto;
import com.example.carbooking.service.RouteService;


public class RouteController {
	@Autowired
	RouteService routeservice;
	@GetMapping("/route")
	public List<Routedto> getSourceAndDestination(@RequestParam("source") String source,@RequestParam("destination") String destination)
	{
		return RouteService.getSourceAndDestination(source,destination);
	}

}
