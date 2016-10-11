package com.springtutorial.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAOImplement implements StudentDAO{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	@Override
	public void setDataSource(DataSource ds) {
		// TODO Auto-generated method stub
		this.dataSource = ds;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public void createStudent(String name, Integer age) {
		// TODO Auto-generated method stub
		String sql = "insert into student (name,age) values (?,?)";
		jdbcTemplateObject.update(sql, name, age);
		System.out.println("Created record name="+ name +" Age= "+age );
		return;
	}

	@Override
	public StudentDTO getStudent(Integer id) {
		// TODO Auto-generated method stub
		String sql = "select * from student where id = ?";
		StudentDTO student = jdbcTemplateObject.queryForObject(sql, new Object[]{id}, new StudentMapper());
		return student;		
	}

	@Override
	public List<StudentDTO> listStudents() {
		// TODO Auto-generated method stub
		String sql = "select * from student";
		List<StudentDTO> students = jdbcTemplateObject.query(sql, new StudentMapper());
		return students;
	}

	@Override
	public void removeRecord(Integer id) {
		// TODO Auto-generated method stub
		String sql = "delete from student where id = ?";
		jdbcTemplateObject.update(sql, id);
		System.out.println("Deleted record with id: "+ id);
		return;
	}

	@Override
	public void update(Integer id, Integer age) {
		// TODO Auto-generated method stub
		String sql = "update student set age = ? where id = ?";
		jdbcTemplateObject.update(sql, age, id);
		return;
	}

}
