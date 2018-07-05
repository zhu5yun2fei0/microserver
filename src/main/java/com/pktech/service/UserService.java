package com.pktech.service;

import com.pktech.entity.User;

public interface UserService {
	public User findUserByPhone(String phone);
}
