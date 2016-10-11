package com.springtutorial.jdbc;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDAO {
	/**
	 * This method is to be used to initialize database
	 * resources (connection DB)
	 */
	public void setDataSource(DataSource ds);
	
	/**
	 * This method is to be used to
	 * create a record in student table
	 */
	public void createStudent(String name, Integer age);
	
	/**
	 * This method is to be used to list down
	 * a record from the student table
	 */
	public StudentDTO getStudent(Integer id);
	
	/**
	 * This method is to be used to list down
	 * all records in the student table
	 */
	public List<StudentDTO> listStudents();
	
	/**
	 * this method is to be used to 
	 * remove record in student table
	 */
	public void removeRecord(Integer id);
	
	/**
	 * This method is used to 
	 * update record in student table
	 */
	public void update(Integer id, Integer age);
}
