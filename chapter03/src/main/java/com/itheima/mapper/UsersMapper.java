package com.itheima.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.itheima.domain.User;
//（Mybatis）数据访问层:=>业务层Service=》业务层的实现类调用mapper层的方法=》controller 调用service层的方法,把数据进行交互（把给前端，或者是获取到前端的数据）SpringMVC
//数据访问层:需要给@Mapper注解，数据库的操作（CRUD）都在这个类中编写
@Mapper
public interface UsersMapper {
	//根据id进行查询
	@Select("select id,username,paswword from user where id = #{id}")
	public User findId(int id);
	//查询所有的信息
	@Select("select id,username,paswword from user")
	public List<User> findAll();
	@Delete("delete from user where id = #{id}")//1
	public void delete(Integer id);
}
