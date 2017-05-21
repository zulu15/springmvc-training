package com.fincasmendoza.service;

import java.util.List;

import com.fincasmendoza.domain.Product;

public class ProductManagerImpl implements ProductManager {

	private List<Product> productList;

	public void incrementarPrecios(int porcentaje) {
		if (productList != null) {
			for (Product product : productList) {
				double newPrice = product.getPrice() * (100 + porcentaje) / 100;
				product.setPrice(newPrice);
			}
		}

	}

	public List<Product> obtenerProductos() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
}
