package com.springtutorial.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppStudentAnnotation {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		
		Student stu = (Student)context.getBean("student");
		
		System.out.println(stu.getName());
		System.out.println(stu.getAge());
	}
}
