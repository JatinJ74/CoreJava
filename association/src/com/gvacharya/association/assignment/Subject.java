package com.gvacharya.association.assignment;

import java.util.List;

public class Subject {

	private String subjectName;
//	private List<String> subjectList; 
	
	

	public String getSubjectName() {
		return subjectName;
	}

	@Override
	public String toString() {
		return "Subject [subjectName=" + subjectName + "]";
	}

	public Subject(String subjectName) {
	super();
	this.subjectName = subjectName;
}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	
	
}
