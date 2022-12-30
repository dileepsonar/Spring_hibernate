package com.spring.hibernate.dao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name="student_details")
public class Student {
@Id
@Column (name="student_id")
	private int id;
@Column (name="student_name")
	private String studentNmae;
@Column (name="student_city")
	private String StudentCity;
public Student(int id, String studentNmae, String studentCity) {
	super();
	this.id = id;
	this.studentNmae = studentNmae;
	StudentCity = studentCity;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStudentNmae() {
	return studentNmae;
}
public void setStudentNmae(String studentNmae) {
	this.studentNmae = studentNmae;
}
public String getStudentCity() {
	return StudentCity;
}
public void setStudentCity(String studentCity) {
	StudentCity = studentCity;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

	
}
