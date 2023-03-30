package com.mapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Employee {
	@Id
	private int empId;
	private String firstName;
	private String lastName;
	
	@OneToMany(mappedBy = "emp",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Emp_Account> account;

	public Employee(int empId, String firstName, String lastName, List<Emp_Account> account) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.account = account;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
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

	public List<Emp_Account> getAccount() {
		return account;
	}

	public void setAccount(List<Emp_Account> account) {
		this.account = account;
	}
	

}
