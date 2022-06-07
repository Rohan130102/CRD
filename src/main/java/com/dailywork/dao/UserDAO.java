package com.dailywork.dao;

import java.util.List;

import com.dailywork.pojo.Task;
import com.dailywork.pojo.User;

public interface UserDAO {

	List<User> get();
	User getUserById(int id);
	String save(User user);
	String update(User user);
	User login(String email, String password);
	String save(Task t);
}
