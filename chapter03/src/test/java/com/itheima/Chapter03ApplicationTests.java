package com.itheima;

import com.itheima.domain.Comment;
import com.itheima.domain.Student;
import com.itheima.mapper.CommentMapper;
import com.itheima.mapper.StudentMapper;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter03ApplicationTests { 
	@Autowired
	private StudentMapper studentMapper;
    @Test
    public void selectComment() {
    	List<Student> list = studentMapper.findAll();	
    	System.out.println(list);  	
    }
//    测试根据ID查询
    @Test
    public void selectFindeId() {
    	Student s =studentMapper.findId(1);
    	System.out.println(s);
    }
//  测试根据 删除学生
  @Test
  public void  deleteStudent() {
	int a =  studentMapper.deleteStudent(3);
	System.out.println(a);
	if(a==1) {
		System.out.println("删除成功");
		
	}
	else {
		System.out.println("删除失败");
	}
  }
  
//测试添加学生

public void insertStudent() {
	 int i = studentMapper.insertStudent(2, "小明", "12345678910", "石家庄", 18);
	 System.out.println(i);
}
//测试修改学生
@Test
public void UpdateStudent() {
//	  int u = studentMapper.updateStudent(5, "小刚");
//	  System.out.println(u);
}




}
