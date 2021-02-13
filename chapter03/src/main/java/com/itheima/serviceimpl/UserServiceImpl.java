package com.itheima.serviceimpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import com.itheima.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}
	@Override
	public User findId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	 
	

}
