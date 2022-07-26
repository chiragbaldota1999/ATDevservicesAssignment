package com.student.student.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private int rollNo;
	private String firstName;
	private String lastName;
	private String year;
	
	
	public Student(int id, int rollNo, String firstName, String lastName, String year) {
		super();
		this.id = id;
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.year = year;
	}
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollno) {
		this.rollNo = rollno;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", year=" + year + "]";
	}

}
