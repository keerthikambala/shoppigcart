package com.cognizant.Product.Service;

import com.cognizant.Product.Entity.Login;

public interface UserService 
{

	boolean validateUser(String username, String password);

	void saveUser(Login login);	
}
