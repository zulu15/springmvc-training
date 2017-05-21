package com.fincasmendoza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fincasmendoza.domain.Product;
import com.fincasmendoza.repository.ProductDAO;

@Component
public class ProductManagerImpl implements ProductManager {

	@Autowired
	private ProductDAO productDAO;

	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	public ProductDAO getProductDAO() {
		return productDAO;
	}

	public void incrementarPrecios(int porcentaje) {
		for (Product product : productDAO.getProductList()) {
			double newPrice = product.getPrice() * (100 + porcentaje) / 100;
			product.setPrice(newPrice);
			productDAO.saveProduct(product);
		}

	}

	public List<Product> obtenerProductos() {
		return productDAO.getProductList();
	}

}
