package com.gvacharya.generic.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericDemo {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		ObjectBox<Integer> intBox = new ObjectBox<>();
		
		intBox.setzList(intList);
		
		boolean result = intBox.addElement(10);
		boolean result2 = intBox.addElement(20);
		boolean result3 = intBox.addElement(30);
//		System.out.println(result);
		
//		System.out.println(intList);
		
		
		List<String> stringList = new ArrayList<>();
		ObjectBox<String> stringBox = new ObjectBox<>();
		
		stringBox.setzList(stringList);
		
		boolean result4 = stringBox.addElement("ABC");
		boolean result5 = stringBox.addElement("bBC");
//		System.out.println(result4);
		
		
//		List<?> resultIntList = intBox.getzList();
//		List<?> resultStringList = stringBox.getzList();
//		
//		resultIntList.forEach(System.out::println);
//		resultStringList.forEach(System.out::println);
		
//		intBox.zForEach();
//		zSort(stringBox);
		
		List<Student> studentList = new ArrayList<>();
 		ObjectBox<Student> studentBox = new ObjectBox<>();
 		
 		studentBox.setzList(studentList);
 		
 		studentBox.addElement(new Student(1,"abc"));
 		studentBox.addElement(new Student(5,"bbc"));
 		studentBox.addElement(new Student(3,"cbc"));
 		studentBox.addElement(new Student(2,"dbc"));
 		
 		zSort(studentBox);
	}
	
	public static <T extends Comparable<T>> void zSort(ObjectBox<T> zList){
		Collections.sort(zList.getzList());
		System.out.println(zList.getzList());
	}
}
