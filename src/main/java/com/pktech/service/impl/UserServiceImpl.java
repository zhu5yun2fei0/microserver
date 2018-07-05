package com.pktech.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pktech.dao.UserDao;
import com.pktech.entity.User;
import com.pktech.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userdao;

	@Override
	public User findUserByPhone(String phone) {
		
		return userdao.findUserByPhone(phone);
	}

}
