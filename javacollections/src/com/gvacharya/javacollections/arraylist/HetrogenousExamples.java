package com.gvacharya.javacollections.arraylist;

import java.util.ArrayList; 
import java.util.List;

public class HetrogenousExamples {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>(5);
		
		list.add(10); 
		list.add("ABC");
		list.add(new Employee(1,"EMP1"));
		
		System.out.println(list);
		
		Generic<Integer,Integer> intGeneric = new Generic<>(10,20);
		
		System.out.println(intGeneric);
		
		Generic<String,String> StringGeneric = new Generic<>("HEllo","World");
		
		System.out.println(StringGeneric);
		
		Generic<Employee,String> StudentGeneric = new Generic<>(new Employee(1,"emp1"),"std2");
		
		System.out.println(StudentGeneric.getT());
		System.out.println(StudentGeneric.getU());
	}
}
