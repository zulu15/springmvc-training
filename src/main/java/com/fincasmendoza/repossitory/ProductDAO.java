package com.fincasmendoza.repossitory;

import java.util.List;

import com.fincasmendoza.domain.Product;

public interface ProductDAO {

	List<Product> getProductList();
	int saveProduct(Product product);
}
