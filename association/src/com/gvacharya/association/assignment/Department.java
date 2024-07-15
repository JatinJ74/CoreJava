package com.gvacharya.association.assignment;

import java.util.List;

public class Department {

	private String departmentName;
	private int noOfSubject;
	
	private Teacher teacher;
	
	private List<Subject> subject;

	public Department() {
		
	}

	public Department(String departmentName, int noOfSubject, Teacher teacher, List<Subject> subject) {
		super();
		this.departmentName = departmentName;
		this.noOfSubject = noOfSubject;
		this.teacher = teacher;
		this.subject = subject;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getNoOfSubject() {
		return noOfSubject;
	}

	public void setNoOfSubject(int noOfSubject) {
		this.noOfSubject = noOfSubject;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Department ["
				+ "departmentName=" + departmentName 
				+ ", noOfSubject=" + noOfSubject 
				+ ", teacher=" + teacher
				+ ", subject=" + subject + "]";
	}
	
	
}
