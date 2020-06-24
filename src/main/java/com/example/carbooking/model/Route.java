package com.example.carbooking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Route {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Integer routeid;
	private String source;
	private String destination;
	private double price;


	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private String cabno;
	public Integer getRouteid() {
		return routeid;
	}
	public void setRouteid(Integer routeid) {
		this.routeid = routeid;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getCabno() {
		return cabno;
	}
	public void setCabno(String cabno) {
		this.cabno = cabno;
	}

	
	

}
