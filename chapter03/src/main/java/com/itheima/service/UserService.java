package com.itheima.service;
import java.util.List;

import com.itheima.domain.User;
//业务层的方法就是跟mapper的方法一样
public interface UserService {
	//根据ID查询的方法
	public User findId(int id);
	//查询所有的信息
	public List<User> findAll();
}
