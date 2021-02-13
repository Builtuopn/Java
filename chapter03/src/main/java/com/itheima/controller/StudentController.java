package com.itheima.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.domain.Student;
import com.itheima.mapper.StudentMapper;

@Controller
public class StudentController {
	@Autowired
	private StudentMapper studentMapper;
  
	  @GetMapping("/toLoginPage")
	    public String toLoginPage(Model model){
	        model.addAttribute("list",studentMapper.findAll() );
	        return "login";
	    }

}
