package com.example.demo.service;

import java.util.ArrayList;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Student;

public interface IStudentSrv {
	/**
	 * 新增学生信息
	 * 
	 * @param stu
	 * @return 受影响行数
	 */
	public int addStuInfo(Student stu);

	/**
	 * 删除学生信息
	 * 
	 * @param stu
	 * @return 受影响行数
	 */
	public int deleteStuInfo(Student stu);

	/**
	 * 更新学生信息
	 * 
	 * @param stu
	 * @return 受影响行数
	 */
	public int updateStuInfo(Student stu);

	/**
	 * 查询学生信息
	 * 
	 * @param stu
	 * @return 数据集合
	 */
	public ArrayList<Student> querylist(Student stu);

	/**
	 * 对控制层返回的信息进行封装
	 * 
	 * @param result
	 * @return JSONobject
	 */
	public JSONObject returnObj(int result);
}
