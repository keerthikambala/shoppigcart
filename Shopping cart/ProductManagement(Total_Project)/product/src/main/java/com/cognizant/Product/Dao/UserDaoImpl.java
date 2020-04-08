package com.cognizant.Product.Dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cognizant.Product.Entity.Login;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;



@Repository
public class UserDaoImpl implements UserDAO {

	@Autowired
	SessionFactory factory;
	@Override
	public boolean validateUser(String uname, String pass){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/product?useSSL=false","root","root");
			PreparedStatement pst= (PreparedStatement) con.prepareStatement("select * from Login where uname=? and pass=?");
			pst.setString(1, uname);
			pst.setString(2, pass);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				System.out.println("connected");
				return true;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		return false;
	}
	public void saveUser(Login login) 
	{
		Session session=factory.getCurrentSession();
		session.save(login);
	}
	
}
