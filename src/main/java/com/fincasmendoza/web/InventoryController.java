package com.fincasmendoza.web;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fincasmendoza.domain.Product;
import com.fincasmendoza.service.ProductManager;
import com.fincasmendoza.service.ProductManagerImpl;

@Controller
public class InventoryController {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private ProductManagerImpl productManager;

	@RequestMapping(value = "/hello.htm")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		logger.info("Returning hello view ");

		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("time", (new Date()).toString());
		myModel.put("productList", productManager.obtenerProductos());

		return new ModelAndView("hello", "modelo", myModel);

	}

	public void setProductManager(ProductManagerImpl productManager) {
		this.productManager = productManager;
	}
}
