package com.example.demo.entity;

import java.io.Serializable;
/**
 * 
 * @author Scorpio
 * 学生实体类
 */
public class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String address;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
