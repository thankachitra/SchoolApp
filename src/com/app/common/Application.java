package com.app.common;

import java.util.List;

import com.app.entity.School;
import com.app.entity.Student;

public class Application {

	public static void main(String args[]) {
		
		//Create Student using two argument constructor
		Student one = new Student(101,"FIRST");
		//Setting values for person for student
		one.setName("Abinaya");
		one.setAge(12);
		Address add1=new Address("fairlands dr","pleasanton",94558);
		one.setLocation(add1);
		
		//Create Student two
		Student two = new Student(102,"KG");
		two.setName("Santhosh");
		two.setAge(6);
		Address add2=new Address("Mountain House","MH",91111);
		two.setLocation(add2);	
		System.out.println("student 2"+two);

		// Create School using constructor 
		
		School mySchool = new School();
		mySchool.setName("Fairlands");
		
		mySchool.register(one);
		mySchool.register(two);

		//register student using method overloading *register(String name, String grade) 
		String name="Pranavi";
		String grade="1st";
		mySchool.register(name, grade);
		List <Student>student_list =mySchool.getRegisteredStudents();

		for(Student s:student_list) {
			
			System.out.println("Student Id" +s.getId());
			System.out.println("Student grade " +s.getGrade());
			System.out.println("Student age " +s.getAge());
			System.out.println("Student Name " +s.getName());
			System.out.println("Student Address " +s.getLocation());
		}
	}
}
