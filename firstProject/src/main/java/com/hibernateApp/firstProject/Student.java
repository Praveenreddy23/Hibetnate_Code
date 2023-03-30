package com.hibernateApp.firstProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//POJO class / java bean class
@Entity
@Table(name = "Student_Details")
public class Student {
	@Id
	@Column(name = "S_ID")
	private int usn;
	@Column(name = "S_Name")
	private String name;
	@Column(name = "S_Marks")
	private double marks;
	@Column(name = "CITY")
	private String city;
	
	private Certificate certi;

	public Student(int usn, String name, double marks, String city, Certificate certi) {
		super();
		this.usn = usn;
		this.name = name;
		this.marks = marks;
		this.city = city;
		this.certi = certi;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	public int getUsn() {
		return usn;
	}
	public void setUsn(int usn) {
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", marks=" + marks + ", city=" + city + ", certi=" + certi
				+ "]";
	}
	
	
	

}
