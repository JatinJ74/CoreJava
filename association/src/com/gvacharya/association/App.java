package com.gvacharya.association;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setRollNo(10);
		student.setName("Abc");
		System.out.println(student);
		
		
		Address address = new Address();
		address.setLaneNo(1);
		address.setLandMark("GVAIET");
		address.setArea("Shelu -");
		address.setCity("Raigad");
		
		student.setAddress(address);
		
		List<Subject> subjectList = new ArrayList<>();
		
		subjectList.add(new Subject("Deep Learning"));
		subjectList.add(new Subject("Machine Learning"));
		subjectList.add(new Subject("Data Visualization"));
		subjectList.add(new Subject("Quantum Computing"));
		
		student.setSubjectList(subjectList);
		
		System.out.println(student);
	}
}
