package com.fincasmendoza.service;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fincasmendoza.domain.Product;

//keep the bar green to keep the code clean 

public class ProductManagerImplTests {

	private ProductManagerImpl productManager;
	private List<Product> productos; 
	private static final String MONITOR_DESCRIPTION = "Monitor de 4 pulgadas led smart TV";
	private static final double MONITOR_PRICE = 6500;
	private static final String MOUSE_DESCRIPTION = "Mouse Verbatim gamer";
	private static final double MOUSE_PRICE = 850;
	
	// será invocado previamente a cada llamada a un método de test.
	@Before
	public void setUp() throws Exception {
		productManager = new ProductManagerImpl();
		productos = new ArrayList<Product>();
		productos.add(new Product(MONITOR_DESCRIPTION, MONITOR_PRICE));
		productos.add(new Product(MOUSE_DESCRIPTION, MOUSE_PRICE));
		productManager.setProductList(productos);
	}

	@Test
	public void testGetProductsWithNoProducts() {
		productManager = new ProductManagerImpl();
		assertNull(productManager.obtenerProductos());
	}
	
	@Test
	public void testGetProductsWithProducts() {
       assertNotNull(productManager.obtenerProductos());
       assertEquals(MONITOR_DESCRIPTION, productManager.obtenerProductos().get(0).getDescription());
       assertEquals(MONITOR_PRICE, productManager.obtenerProductos().get(0).getPrice(),0);

       assertEquals(MOUSE_DESCRIPTION, productManager.obtenerProductos().get(1).getDescription());
       assertEquals(MOUSE_PRICE, productManager.obtenerProductos().get(1).getPrice(),0);


	}
	
	
	
	
	
	
	
	
	
	
	
	
}
