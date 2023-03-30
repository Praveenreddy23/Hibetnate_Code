package com.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Emp_Account {
	@Id
	private int acc_Id;
	private String name;
	private String acc_type;
	
	@ManyToOne
	private Employee emp;

	public Emp_Account(int acc_Id, String name, String acc_type, Employee emp) {
		super();
		this.acc_Id = acc_Id;
		this.name = name;
		this.acc_type = acc_type;
		this.emp = emp;
	}

	public Emp_Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAcc_Id() {
		return acc_Id;
	}

	public void setAcc_Id(int acc_Id) {
		this.acc_Id = acc_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcc_type() {
		return acc_type;
	}

	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

}
