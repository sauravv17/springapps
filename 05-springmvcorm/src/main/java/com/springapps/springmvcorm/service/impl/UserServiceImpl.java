package com.springapps.springmvcorm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapps.springmvcorm.dao.UserDao;
import com.springapps.springmvcorm.entity.User;
import com.springapps.springmvcorm.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public int save(User user) {
		// TODO Auto-generated method stub
		return 0;
	}
}
