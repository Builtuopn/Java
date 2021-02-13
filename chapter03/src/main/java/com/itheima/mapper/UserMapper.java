package com.itheima.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.itheima.domain.User;

@Mapper
public interface UserMapper {
//	1.查询所有的信息
	@Select("select * from user")
	public List<User> findAll();
	 

}
