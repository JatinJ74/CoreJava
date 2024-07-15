package com.gvacharya.association.assignment;

import java.util.ArrayList;
import java.util.List;

public class DepartmentMain {

	public static void main(String[] args) {
		
		Department department = new Department();
		
		department.setDepartmentName("Computer Science");
		department.setNoOfSubject(4);
		System.out.println(department);
		
		
		List<Subject> subjectName = new ArrayList<>();
		
		subjectName.add(new Subject("OS"));
		subjectName.add(new Subject("AOA"));
		subjectName.add(new Subject("DS"));
		subjectName.add(new Subject("Core Java"));
//		
		department.setSubject(subjectName);
		
		System.out.println(department);
		
		Teacher teacherName = new Teacher();
		teacherName.setTeacherName("Rohit Girpade");
		
		department.setTeacher(teacherName);
		
		System.out.println(department);
		
	}
}

