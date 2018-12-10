package com.example.demo.service.impl;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Student;
import com.example.demo.mapper.IStudentMapper;
import com.example.demo.service.IStudentSrv;

@Service
public class StudentSrvImpl implements IStudentSrv {

	@Autowired
	IStudentMapper mapper;
	int result;

	@Override
	public int addStuInfo(Student stu) {

		result = mapper.addStuInfo(stu);
		return result;
	}

	@Override
	public int deleteStuInfo(Student stu) {
		result = mapper.deleteStuInfo(stu);
		return result;
	}

	@Override
	public int updateStuInfo(Student stu) {
		result = mapper.updateStuInfo(stu);
		return result;
	}

	@Override
	public ArrayList<Student> querylist(Student stu) {
		ArrayList<Student> stuList = new ArrayList<Student>();
		stuList = mapper.querylist(stu);
		return stuList;
	}
	
	public JSONObject returnObj(int result) {
		JSONObject obj = new JSONObject();
		if(result == 0) {
			obj.put("msg", "失败");
			obj.put("flag", false);
		}else {
			obj.put("msg", "成功");
			obj.put("flag", true);
		}
		return obj;
		
	}

}
