package com.pktech.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pktech.entity.User;
import com.pktech.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public Map<String,Object> login(@RequestParam String phone,@RequestParam String password){
		Map<String, Object> map=new HashMap<String,Object>();
		User user=new User();
			user=userService.findUserByPhone(phone);
			System.out.println(user.getPassword()+"----"+password);
			if(password.equals(user.getPassword())) {
				map.put("0000", "登陆成功");
			}else {
				map.put("0001", "密码错误");
			}

		return map;
	}
}
