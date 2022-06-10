package com.crd.action;

import com.crd.pojo.Company;
import com.crd.service.UserService;

public class UserAction {

	public static void main(String[] args) {
		Company company1 = new Company("ABC", "Goregaon", "fhjj5h");
		Company company2 = new Company("XYZ", "Goregaon", "lsdvkdv");
		UserService userService =  new UserService();
		userService.save(company1);
		userService.save(company2);
	}
}
