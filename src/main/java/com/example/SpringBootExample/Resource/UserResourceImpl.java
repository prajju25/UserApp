package com.example.SpringBootExample.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.SpringBootExample.Model.LoginRequest;
import com.example.SpringBootExample.Model.User;
import com.example.SpringBootExample.Service.UserService;

@Controller
public class UserResourceImpl implements UserResource {
	
	@Autowired
	UserService userService;

	public String sendGreet(String name) {
		return "Hello, "+name+".";
	}
	
	public User doLogin(LoginRequest body) {
		return userService.login(body);
	}
}
