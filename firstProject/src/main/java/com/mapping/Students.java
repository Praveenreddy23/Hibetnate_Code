package com.mapping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Std_Name")
public class Students {
	
	@Id
	@Column(name = "S_Id")
	private int sid;
	@Column(name = "S_Name")
	private String sname;
	
	@ManyToMany
	private List<Std_Course> course;
	public Students(int sid, String sname, List<Std_Course> course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.course = course;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<Std_Course> getCourse() {
		return course;
	}
	public void setCourse(List<Std_Course> course) {
		this.course = course;
	}
	
	
}
