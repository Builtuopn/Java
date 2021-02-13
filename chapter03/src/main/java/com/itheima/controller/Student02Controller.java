package com.itheima.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itheima.domain.Student;
import com.itheima.mapper.StudentMapper;
@Controller
public class Student02Controller {
	@Autowired
	private StudentMapper studentMapper;
	@GetMapping("/login")
	public String login(Model model) {	
		model.addAttribute("student", studentMapper.findAll());
		return "login2";		
	}
//	跳转到修改界面
	@GetMapping("/updateInfo")
	public String updateInfo(Model model,Integer id) {	
		model.addAttribute("users", studentMapper.findId(id));
		return "usersUpdate";
	}
//修改界面需要执行的方法
	  @RequestMapping("/update")
	    public String updateUser(Student student){
		  studentMapper.updateStudent(student);
	        return "redirect:/login2";
	    }
}
