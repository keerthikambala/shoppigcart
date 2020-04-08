package com.cognizant.Product.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.Product.Entity.Product;



@Repository
public class ProductDaoImpl implements ProductDAO {
	@Autowired
	private SessionFactory factory;
	
	
	@Transactional
	public List<Product> getAllProducts() 
	{
		Session session=factory.getCurrentSession();
		Query<Product> query=session.createQuery("from Product order by productName",Product.class);
		List<Product> listOfPro= query.getResultList();
		System.out.println("**");
		listOfPro.forEach(s -> System.out.println(s));
		System.out.println("**");
		return listOfPro;
	}


	@Override
	public void saveProduct(Product theProduct) {
		Session session=factory.getCurrentSession();
		//session.save(theCustomer);
		session.saveOrUpdate(theProduct);
		//If primary key is there, update. Else create new record.
	}


	@Override
	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		Session session=factory.getCurrentSession();
		Product product=session.get(Product.class, productId);
		return product;
	}


	@Override
	public void deleteProduct(int theproductId) {
		// TODO Auto-generated method stub
		Session session = factory.getCurrentSession();
		String s="delete from Product where product_id=:theproductId";
		Query thequery = session.createQuery(s);
		thequery.setParameter("theproductId", theproductId);
		thequery.executeUpdate();
	}
	
	@Override
	public List<Product> getAllProducts(String productName) {
		Session session =factory.getCurrentSession();
		Query query=null;
		if(productName!=null && productName.trim().length() >0) {
		//query =session.createQuery("FROM Product where productName=:productName");
		  query = session.createQuery("FROM Product WHERE productName like concat('%',:productName,'%')");
		query.setParameter("productName", productName);
		}
		else {
			query =session.createQuery("from Product");
	
		}
		List<Product> product = query.getResultList();
		System.out.println("************");
		product.forEach(p->System.out.println(p));
		System.out.println("************");
		return product;
	}

}
