package com.gvacharya.collections.linkedlist.assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StudentInfo {

	public static void main(String[] args) {
		
//		List<Student> studentLinkedList = Arrays.asList(
//				
//				new Student(1,"ABC",100F),
//				new Student(1,"ABC",100F),
//				new Student(1,"ABC",100F),
//				new Student(1,"ABC",100F),
//				new Student(1,"ABC",100F)
//				);
		
		List<Student> studentLinkedList = new LinkedList<>();
		
		
		studentLinkedList.add(new Student(1,"Kunal",1000f));
		studentLinkedList.add(new Student(3,"Abhishek",2000f));
		studentLinkedList.add(new Student(5,"Rohit",7500f));
		studentLinkedList.add(new Student(4,"Sagar",600f));
		studentLinkedList.add(new Student(2,"Binod",2500f));
		
		System.out.println(studentLinkedList);
		
		//Comparator
		// for rollNo
		studentLinkedList.sort((e1,e2) -> Integer.compare(e1.getRollNo(), e2.getRollNo()));
		System.out.println("rollno" + studentLinkedList);
		
		// for fees
		studentLinkedList.sort((e1,e2) -> Float.compare(e1.getFees(), e2.getFees()));
		System.out.println("fees" +studentLinkedList);
		
		// for name
		studentLinkedList.sort((e1,e2) -> e1.getName().compareTo(e2.getName()));
		System.out.println("name" +studentLinkedList);
		
		Collections.sort(studentLinkedList);
		System.out.println(studentLinkedList);
		//comparable
//		studentLinkedList.sort();
		
		
	}
}
