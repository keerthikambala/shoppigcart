package com.cognizant.Product.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.Product.Dao.ProductDAO;
import com.cognizant.Product.Entity.Product;


@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDAO productDao;
	
	@Override
	@Transactional
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAllProducts();
		
	}

	@Override
	@Transactional
	public void saveProduct(Product theProduct) {
		// TODO Auto-generated method stub
		productDao.saveProduct(theProduct);
	}

	@Override
	@Transactional
	public Product getProduct(int theproductId) {
		// TODO Auto-generated method stub
		Product product=productDao.getProduct(theproductId);
		return product;
	}

	@Override
	@Transactional
	public void deleteProduct(int theproductId) {
		// TODO Auto-generated method stub
		productDao.deleteProduct(theproductId);
	}
	@Override
	@Transactional
	public List<Product> getAllProducts(String productName) {
		// TODO Auto-generated method stub
		return productDao.getAllProducts(productName);
	}
}
