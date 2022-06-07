package com.dailywork.service.impl;

import java.util.List;

import com.dailywork.dao.UserDAO;
import com.dailywork.dao.impl.UserDAOImpl;
import com.dailywork.pojo.User;
import com.dailywork.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO;
	
	@Override
	public List<User> get() {
		userDAO = new UserDAOImpl();
		return userDAO.get();
	}

	@Override
	public User getUserById(int id) {
		userDAO = new UserDAOImpl();
		return userDAO.getUserById(id);
	}

	@Override
	public String save(User user) {
		userDAO = new UserDAOImpl();
		return userDAO.save(user);
	}

	@Override
	public String update(User user) {
		userDAO = new UserDAOImpl();
		return userDAO.update(user);
	}

	@Override
	public User login(String email, String password) {
		userDAO = new UserDAOImpl();
		return userDAO.login(email,password);
	}

}
