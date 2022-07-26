package com.student.student.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.student.dao.StudentDao;
import com.student.student.entities.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
      @Autowired
      private StudentDao studentDao;
	

	@Override
	public List<Student> getStudents() {
		 return studentDao.findAll();
	}
     
	@Override
	public Student getStudent(int studentId) {
		return studentDao.getReferenceById(studentId);
	}
	
	@Override
	public Student addStudent(Student student) {
		studentDao.save(student);
		return student;
	}
	
	
	@Override
	public Student updateStudent(Student student) {
           studentDao.save(student);
		return student;
	}

	@Override
	public void deleteStudent(int parseInt) {
		Student entity = studentDao.getReferenceById(parseInt);
		studentDao.delete(entity);
			
	}
}
