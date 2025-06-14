package com.tut.ProjectwithMaven;

import javax.persistence.*;

@Entity
@Table(name="student_details")
public class Student {	
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;
  @Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
}
  @Column(name="student_name")
private String name;
  private String city;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Student(int id, String name, String city) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
  
}
