package com.fincasmendoza.domain;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public Product(String description, double price) {
		this.description = description;
		this.price = price;
	}

	private String description;
	private double price;
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [description=" + description + ", price=" + price + "]";
	}
	
	
	
}
