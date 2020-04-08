package com.cognizant.Product.Service;

import java.util.List;

import com.cognizant.Product.Entity.Product;





public interface ProductService {
	List<Product> getAllProducts();

	void saveProduct(Product theProduct);

	public Product getProduct(int theId);

	void deleteProduct(int theId);  
	 public List<Product> getAllProducts(String productName);
}
