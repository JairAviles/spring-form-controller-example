package com.first.assignment.services;

import com.first.assignment.bean.UserBean;

public class UserServiceImpl implements UserService {

	public void add(UserBean user) {
		System.out.println("Add user: \n" + user.toString());
	}
	
}
