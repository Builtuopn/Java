package com.itheima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.service.UserService;
import com.itheima.serviceimpl.UserServiceImpl;
//一般来说：一个界面一个方法
@Controller
public class UserController {
	@Autowired
	private UserService  userServiceImpl;
 	@ResponseBody
	@GetMapping("/findUser")
	public String findUser(   ) { 
		//userService.findAll();
 		System.out.println(userServiceImpl.findAll());
		return "index";
		
	}
	 
}
