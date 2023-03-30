package com.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Course_Name")
public class Std_Course {

	@Id
	private int cid;

	private String cName;

	@ManyToMany
	@JoinTable(
			name = "C_Learn",joinColumns = {@JoinColumn(name="C_Id")},
			inverseJoinColumns = {@JoinColumn(name="C_Name")}
			)
	private List<Students> students;
	public Std_Course(int cid, String cName, List<Students> students) {
		super();
		this.cid = cid;
		this.cName = cName;
		this.students = students;
	}
	public Std_Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public List<Students> getStudents() {
		return students;
	}
	public void setStudents(List<Students> students) {
		this.students = students;
	}


}
