package com.gvacharya.association;

import java.util.List;

public class Student {

	private int rollNo; //one to one
	private String name; // one to one
	
	
	private Address address; // one to one
	
	private List<Subject> subjectList; // one to many

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	@Override
	public String toString() {
		return "Student ["
				+ "rollNo=" + rollNo 
				+ ", name=" + name 
				+ ", address=" + address 
				+ ", subjectList=" + subjectList
				+ "]";
	}
	
	
}
