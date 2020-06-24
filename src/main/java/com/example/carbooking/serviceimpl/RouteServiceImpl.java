package com.example.carbooking.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.example.carbooking.dao.RouteDao;
import com.example.carbooking.dto.Routedto;
import com.example.carbooking.model.Route;
import com.example.carbooking.service.RouteService;
@Service
public class RouteServiceImpl implements RouteService {

	@Override
	public List<Routedto> getSourceAndDestination(String source, String destination) {
		Iterable<Route> produts =RouteDao.findAll();
		List<Routedto> ProductResponseList=new ArrayList<Routedto>();
		produts.forEach(route -> ProductResponseList.add(Routedto(route)));
		return ProductResponseList;
	}

	private Routedto Routedto(Route route) {
		Routedto responsedto=new Routedto();
		BeanUtils.copyProperties(route, responsedto);
		return responsedto;
	}

	

}
