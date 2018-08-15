package com.nareen.entity;

public class Student {
	
	String name;
	String studDepartment;
	Address studAddr;
	StudentType studType;
	
	public Student() {
		
	}
	public StudentType getStudentType() {
		return studType;
	}
	public void setStudentType(StudentType studType) {
		this.studType = studType;
	}
	public Address getStudAddr() {
		return studAddr;
	}
	public void setStudAddr(Address studAddr) {
		this.studAddr = studAddr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudDepartment() {
		return studDepartment;
	}
	public void setStudDepartment(String studAddress) {
		this.studDepartment = studAddress;
	}

}
