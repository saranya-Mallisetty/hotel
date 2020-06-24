package com.example.carbooking.dto;

public class Routedto {
	private Integer routeid;
	private String source;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCabno() {
		return cabno;
	}
	public void setCabno(String cabno) {
		this.cabno = cabno;
	}
	private String destination;
	private double price;
	private String cabno;



}
