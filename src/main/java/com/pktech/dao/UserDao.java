package com.pktech.dao;

import org.apache.ibatis.annotations.Mapper;

import com.pktech.entity.User;

@Mapper
public interface UserDao {
	
	public User findUserByPhone(String phone);
}
