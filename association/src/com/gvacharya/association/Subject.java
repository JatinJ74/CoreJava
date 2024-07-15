package com.gvacharya.association;

public class Subject {
	
	private String subjectName;
	private String subjectProfName;

	public Subject(String subjectName) {
		super();
		this.setSubjectName(subjectName);
	}

	public Subject() {
		super();
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "Subject [subjectName=" + subjectName + "]";
	}

	public String getSubjectProfName() {
		return subjectProfName;
	}

	public void setSubjectProfName(String subjectProfName) {
		this.subjectProfName = subjectProfName;
	}

	
	
}
