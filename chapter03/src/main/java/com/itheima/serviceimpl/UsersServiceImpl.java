package com.itheima.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.domain.User;
import com.itheima.mapper.UsersMapper;
import com.itheima.service.UsersService;
@Service
public class UsersServiceImpl implements UsersService{
	@Autowired
	private UsersMapper usersMapper;
	@Override
	public User findId(int id) {
		 
		return usersMapper.findId(id);
	}
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return usersMapper.findAll();
	}
	@Override
	public void delete(Integer id) {
		usersMapper.delete(id);
	}
}
