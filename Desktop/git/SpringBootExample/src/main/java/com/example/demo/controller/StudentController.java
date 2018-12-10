package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Student;
import com.example.demo.service.IStudentSrv;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	IStudentSrv service;
	int result;
	JSONObject obj = null;

	@RequestMapping(value = "add")
	public ModelAndView add(Student stu) {
		ModelAndView maw = new ModelAndView();
		maw.addObject("obj",JSONObject.toJSON(stu));
		result = service.addStuInfo(stu);
		obj = service.returnObj(result);
		maw.setViewName("Main");
		return maw;
	}

	@RequestMapping("/delete")
	public JSONObject delete(Student stu) {
		result = service.deleteStuInfo(stu);
		obj = service.returnObj(result);
		return obj;

	}

	@RequestMapping("/update")
	public JSONObject update(Student stu) {
		result = service.updateStuInfo(stu);
		obj = service.returnObj(result);
		return obj;

	}

	@RequestMapping("/query")
	@ResponseBody
	public JSONObject query(Student stu) {
		obj = new JSONObject();
		ArrayList<Student> arr = new ArrayList<Student>();
		arr = service.querylist(stu);
		obj = service.returnObj(arr.size());
		obj.put("list", arr);

		return obj;
	}

}
