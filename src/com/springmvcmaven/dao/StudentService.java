package com.springmvcmaven.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.springmvcmaven.domain.*;

@Service("StudentService")
public class StudentService {
	
	public List<Student> getAllStudents(){
		
		List<Student> students = new ArrayList<Student>();
		Student student = new Student();
		student.setName("Jose");
		students.add(student);
		
		return students;
	}
			
	
	
}
