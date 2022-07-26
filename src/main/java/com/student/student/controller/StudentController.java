package com.student.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.student.entities.Student;
import com.student.student.services.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return this.studentService.getStudents();
	}
	
	@GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable String studentId) {
		return this.studentService.getStudent(Integer.parseInt(studentId));
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student){
		return this.studentService.addStudent(student);
	}  
	
     @PutMapping("/students") 
	public Student updateStudent(@RequestBody Student student) {
    	 return this.studentService.updateStudent(student);
     } 
    
     
	@DeleteMapping("/students/{studentId}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable String studentId) {
		try {
			this.studentService.deleteStudent(Integer.parseInt(studentId));
			return new ResponseEntity<>(HttpStatus.OK);
	     	}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
