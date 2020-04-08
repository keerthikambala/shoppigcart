package com.cognizant.Product.Service;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class LogInService {
public boolean check(String uname, String pass) {
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","root");
		PreparedStatement pst= (PreparedStatement) con.prepareStatement("select * from check where uname=? and pass=?");
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
}
