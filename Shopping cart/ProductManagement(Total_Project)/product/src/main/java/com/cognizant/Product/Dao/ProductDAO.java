package com.cognizant.Product.Dao;

import java.util.List;

import com.cognizant.Product.Entity.Product;


public interface ProductDAO {
   public List<Product> getAllProducts();

void saveProduct(Product theProduct);
public Product getProduct(int theId);  
public void deleteProduct(int theId);
public List<Product> getAllProducts(String productName);
}