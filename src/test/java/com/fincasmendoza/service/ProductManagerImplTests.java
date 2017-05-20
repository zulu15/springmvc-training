package com.fincasmendoza.service;

import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class ProductManagerImplTests {

	private ProductManager productManager;

	
	// será invocado previamente a cada llamada a un método de test.
	@Before
	public void setUp() throws Exception {
		productManager = new ProductManagerImpl();
	}

	@Test
	public void testGetProductsWithNoProducts() {
		productManager = new ProductManagerImpl();
		assertNull(productManager.obtenerProductos());
	}
}
