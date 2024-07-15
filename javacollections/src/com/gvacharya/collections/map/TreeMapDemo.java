package com.gvacharya.collections.map;

import java.util.NavigableMap;
import java.util.TreeMap;

import com.gvacharya.javacollections.arraylist.Employee;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		NavigableMap<Employee, Float> studentMap = new TreeMap<>();
		
		studentMap.put(new Employee(1,"abc"), 1000F);
		studentMap.put(new Employee(2,"aac"), 1000F);
		studentMap.put(new Employee(3,"bbc"), 1000F);
		studentMap.put(new Employee(4,"cbc"), 1000F);
		studentMap.put(new Employee(5,"cbc"), 1000F);
		
		studentMap.forEach((k,v) -> System.out.println("Key: "+ k + "\n" + "Value: " + v ));
	}
}
