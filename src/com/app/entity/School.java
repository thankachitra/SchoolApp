package com.app.entity;

import java.util.ArrayList;
import java.util.List;

import com.app.common.Address;

public class School {
	
	private String name;
	//This is "has a" relationship
	private Address location;
	//This is same ArrayList collection
	private List<Student> registeredStudents;
	private List<Staff> staffList;

	public School() {
		registeredStudents = new ArrayList<Student>();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getLocation() {
		return location;
	}
	public void setLocation(Address location) {
		this.location = location;
	}
	public List<Student> getRegisteredStudents() {
		return registeredStudents;
	}
	public void setRegisteredStudents(List<Student> registeredStudents) {
		this.registeredStudents = registeredStudents;
	}

	//To register a student
	public String register(Student input) {
		System.out.println("Trying to register Student");
		//Add the student to registered List
		if(input != null) {
			registeredStudents.add(input);
		}
		System.out.println("Registered Student");

		return "Success";
	}
	
	//Example for over loading register method
	public String register(String name, String grade) {
		System.out.println("Trying to register Student using overloaded method");
		//Add the student to registered List
		 
		//Create Student two
		Student myStudent = new Student(grade);
		
		myStudent.setName(name);
 		
		
		registeredStudents.add(myStudent);

		System.out.println("Registered Student using overloaded method");

		return "Success";
	}
	
	
	public String registerStaffs(Staff staff1) {
		
		return "Success";
	}
	
}
