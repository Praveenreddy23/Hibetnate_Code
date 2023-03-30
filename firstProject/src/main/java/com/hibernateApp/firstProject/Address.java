package com.hibernateApp.firstProject;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "Employee_Address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Address_Id")
	private int addressId;
	
	@Column(length = 20, name = "AREA") 
	private String area;
	
	@Column(name = "CITY", length = 10)
	private String city;
	
	@Column(name = "Is_Open")
	private boolean isOpen;
	
	@Transient
	private double x;
	
	@Column(name = "Add_Date")
	@Temporal(TemporalType.DATE)
	private Date addDate;
	
	@Lob
	private byte[] image;
	
	public Address() {
		super();
	}
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAddDate() {
		return addDate;
	}
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Address(int addressId, String area, String city, boolean isOpen, double x, Date addDate, byte[] image) {
		super();
		this.addressId = addressId;
		this.area = area;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addDate = addDate;
		this.image = image;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", Area=" + area + ", city=" + city + ", isOpen=" + isOpen + ", x="
				+ x + ", addDate=" + addDate + ", image=" + Arrays.toString(image) + "]";
	}
	
	

}
