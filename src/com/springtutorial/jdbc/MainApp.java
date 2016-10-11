package com.springtutorial.jdbc;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		
		StudentDAOImplement studentDAOImplement = (StudentDAOImplement)context.getBean("studentDAOImplementation"); 
		/*	
		System.out.println("-------------Records Creation---------------");
		studentDAOImplement.createStudent("Berenice", 31);
		studentDAOImplement.createStudent("Zulma", 38);
		studentDAOImplement.createStudent("Diana", 30);
		studentDAOImplement.createStudent("Caro", 29);
		
		System.out.println("-------------Listing Records---------------");
		List <StudentDTO> students = studentDAOImplement.listStudents();
		
		System.out.println(students.size()+" " +students.toString());
		for(StudentDTO record : students){
			System.out.println(record.getId());
			System.out.println(record.getName());
			System.out.println(record.getAge());
		}
		*/
		System.out.println("------------- Updating Record with ID = 13 -------------------");
		studentDAOImplement.update(13, 30);
		
		System.out.println("-------------Listing Records After Update---------------");
		List<StudentDTO> students2 = studentDAOImplement.listStudents();
		for(Iterator<StudentDTO> iterator = students2.iterator(); iterator.hasNext();){
			StudentDTO student = iterator.next();
			System.out.println("Record Id: "+student.getId());
			System.out.println("Record Name: "+student.getName());
			System.out.println("Record Age: "+student.getAge());
		}
		
		System.out.println("-------------Listing Records with id---------------");
		StudentDTO student = studentDAOImplement.getStudent(13);
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getAge());
		
		System.out.println("-------------Deleting Records with id---------------");
		studentDAOImplement.removeRecord(16);
		
	}
}
