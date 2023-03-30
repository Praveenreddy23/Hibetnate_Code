package com.hibernateApp.firstProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Employee_Details")
public class Emp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "E_ID")
	private int eid;
	
	public Emp(int eid, String ename, double esal, int x) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.x = x;
	}
	@Column(name = "E_NAME",length = 20)
	private String ename;
	
	@Column(name = "E_SAL",length = 50)
	private double esal;
	
	@Transient
	private int x;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public Emp() {
		super();
	}
	@Override
	public String toString() {
		return "EMP [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", x=" + x + "]";
	}
	

}
