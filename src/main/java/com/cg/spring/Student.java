package com.cg.spring;

public class Student {
	
	private String studentname;
	private int id;
	
	
	
	public Student(int id) {
	
		this.id = id;
	}


	public Student(String studentname, int id) {
	 
		this.studentname = studentname;
		this.id = id;
	}


	public void displayStudentinfo() {
		System.out.print("Student name:" + studentname +  "  ID:" +id);
	}


}
