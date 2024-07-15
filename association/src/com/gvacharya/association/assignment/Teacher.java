package com.gvacharya.association.assignment;

public class Teacher {

	private String TeacherName;

	public String getTeacherName() {
		return TeacherName;
	}

	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}

	@Override
	public String toString() {
		return "Teacher [TeacherName=" + TeacherName + "]";
	}

	public Teacher(String teacherName) {
		super();
		TeacherName = teacherName;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
