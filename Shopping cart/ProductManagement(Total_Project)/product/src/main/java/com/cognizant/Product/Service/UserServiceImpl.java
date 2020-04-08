package com.cognizant.Product.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.Product.Dao.UserDAO;
import com.cognizant.Product.Entity.Login;



@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDao;
	
	@Override
	@Transactional
	public boolean validateUser(String username, String password) {
		return userDao.validateUser(username,password);
	}

	@Override
	@Transactional
	public void saveUser(Login login) {
		userDao.saveUser(login);
	}

}
