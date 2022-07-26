package com.student.student.services;

import java.util.List;

import com.student.student.entities.Student;

public interface StudentService {
	
	public List<Student> getStudents();
	
	public Student getStudent(int studentId);
	
	public Student addStudent(Student student);
	
	public Student updateStudent(Student student);
	
	public void deleteStudent(int parseInt);
	

}
