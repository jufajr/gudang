package com.training.domain;

import java.util.Date;

public class Student {
	private String idStudent;
	private String name;
	private Date dob;
	private String addressStreet;

	public Student() {
	}

	public Student(String id, String name, Date dob, String street) {
		this.idStudent = id;
		this.name = name;
		this.dob = dob;
		this.addressStreet = street;
	}

	public String getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(String idStudent) {
		this.idStudent = idStudent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddressStreet() {
		return addressStreet;
	}

	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}
}
