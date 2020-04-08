package com.cognizant.Product.Dao;

import com.cognizant.Product.Entity.Login;

public interface UserDAO {


	boolean validateUser(String uname, String pass);

	void saveUser(Login login);

}
