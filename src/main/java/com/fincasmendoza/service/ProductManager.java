package com.fincasmendoza.service;

import java.util.List;

import com.fincasmendoza.domain.Product;

public interface ProductManager {

	void incrementarPrecios(int porcentaje);

	List<Product> obtenerProductos();
}
