package com.app.entity;

import com.app.common.Person;

public class Student extends Person //"IS A" relationship 
{
	
	private int id;
	private String grade;
	
	//Two argument constructor
	public Student(int id, String grade) {
		// calling parent class constructor
		super();
		this.id = id;
		this.grade = grade;
	}
	public Student( String grade) {
		// calling parent class constructor
		super();
		this.grade = grade;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
