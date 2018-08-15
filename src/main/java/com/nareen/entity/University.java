package com.nareen.entity;

public class University {
	
	String univName;
	Address univAddr;
	Student student; 

	
	public University() {
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getUnivName() {
		return univName;
	}

	public void setUnivName(String univName) {
		this.univName = univName;
	}

	public Address getUnivAddr() {
		return univAddr;
	}

	public void setUnivAddr(Address univAddr) {
		this.univAddr = univAddr;
	}
	
	

}
