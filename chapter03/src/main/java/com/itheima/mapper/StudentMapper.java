package com.itheima.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.itheima.domain.Student;
@Mapper
public interface StudentMapper {
//	一个方法代表一条sql语句
	//查询学生表的全部信息
	@Select("select * from student")
	public List<Student> findAll();
	//执行该方法 执行这一条sql语句 
//	2.根据ID进行查询
	@Select("select * from student where sid = #{sid}")
	public Student findId(int sid);
// 3.删除语句
	@Delete("delete from student where sid = #{sid}")
	public int deleteStudent(int sid);
//4.添加功能
	@Insert("insert into student value(#{sid},#{sname},#{phone},#{address},#{age})")
	public int insertStudent(int sid,String sname,String phone,String address,int age);
//5.修改功能:把sid为1 的学生的姓名修改为小明
	@Update("update student set sname = #{sname} where sid =  #{sid}")
	public int updateStudent(Student student);
}
 
