package com.cg.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Exam {

	public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	Student neeraj=context.getBean("neeraj", Student.class);
	neeraj.displayStudentinfo();
	
	Student drishya= context.getBean("drishya",Student.class);
	drishya.displayStudentinfo();

	}
	
}
