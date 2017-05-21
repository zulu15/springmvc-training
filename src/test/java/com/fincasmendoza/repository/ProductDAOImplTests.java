package com.fincasmendoza.repository;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fincasmendoza.domain.Product;
import com.fincasmendoza.repository.ProductDAO;

public class ProductDAOImplTests {

	private ApplicationContext appContext;
	private ProductDAO productDAO;

	@Before
	public void setUp() {
		appContext = new ClassPathXmlApplicationContext("classpath:test-context.xml");
		productDAO = (ProductDAO) appContext.getBean("productDAO");
	}

	@Test
	public void testGetProductList() {
		List<Product> products = productDAO.getProductList();
		assertEquals(products.size(), 4, 0);
	}

	@Test
	public void testSaveProduct() {
		List<Product> products = productDAO.getProductList();

		Product p = products.get(0);
		Double price = p.getPrice();
		p.setPrice(200.12);
		productDAO.saveProduct(p);

		List<Product> updatedProducts = productDAO.getProductList();
		Product p2 = updatedProducts.get(0);
		assertEquals(p2.getPrice(), 200.12, 0);

		p2.setPrice(price);
		productDAO.saveProduct(p2);
	}
}
