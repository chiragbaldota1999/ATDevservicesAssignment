package com.student.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.student.entities.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {
	
	

}
