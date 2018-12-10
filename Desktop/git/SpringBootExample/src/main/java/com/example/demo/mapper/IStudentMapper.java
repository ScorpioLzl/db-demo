package com.example.demo.mapper;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.context.annotation.Description;
import com.example.demo.entity.Student;

@Mapper
@Description("学生信息持久化层")
public interface IStudentMapper {
	
	@Insert("insert into studentinfo(id,name,address)values(#{id},#{name},#{address})")
	public int addStuInfo(Student stu);

	@Delete("<script>delete from studentinfo where 1=1 <if test=\"id!=null and id!=''\"> and id =#{id}</if> <if test=\"name!=null and name!=''\" >and name=#{name}</if></script>")
	public int deleteStuInfo(Student stu);

	@Update("update studentinfo set name=#{name},address=#{address} where id=#{id} ")
	public int updateStuInfo(Student stu);

	@Select("<script>select * from studentinfo where 1=1 <if test=\"id!=null and id!=''\"> and id =#{id}</if> <if test=\"name!=null and name !=''\" >and name =#{name}</if></script>")
	public ArrayList<Student> querylist(Student stu);
}
