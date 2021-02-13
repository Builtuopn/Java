package com.itheima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.itheima.service.UsersService;
//Model把数据存放在Model 里边，等前端进行取出来
@Controller
public class UsersController {
	@Autowired
	private UsersService usersService;
	@GetMapping("/findId")
	public String findId(Model model) {
		//把数据存放在Model 里边
		model.addAttribute("users", usersService.findId(1));
		
		return "user";
		
	} 
	
// 把user所有的信息返回到视图层
	@GetMapping("/findAll")
	public String findAll(Model model) {
		model.addAttribute("userAll", usersService.findAll());
		return "index";
		
	}
//根据id删除
	@GetMapping("/delete")
	public String delete(Integer id) {
		usersService.delete(id);
		return "redirect:index";
		
	}

}
