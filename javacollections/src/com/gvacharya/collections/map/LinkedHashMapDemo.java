package com.gvacharya.collections.map;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

import com.gvacharya.javacollections.arraylist.Employee;
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		Map<Employee,Float> empLinkedHashMap = new LinkedHashMap<>();
		
		empLinkedHashMap.put(new Employee(1,"abc"), 1000F);
		empLinkedHashMap.put(new Employee(2,"abc"), 1000F);
		empLinkedHashMap.put(new Employee(3,"abc"), 1000F);
		empLinkedHashMap.put(new Employee(4,"abc"), 1000F);
		empLinkedHashMap.put(new Employee(5,"abc"), 1000F);
		empLinkedHashMap.put(new Employee(6,"abc"), 1000F);
		
//		empLinkedHashMap.forEach((k,v)->System.out.println(k+ " " + v));
		
//		Ite rator<Map.Entry<Employee,Float>> empIterator = empLinkedHashMap.entrySet().iterator();
//		
//		while(empIterator.hasNext())
//			System.out.println(empIterator.next());
		
//		Enumeration<Map.Entry<Employee,Float>> empEnum = Collections.enumeration(empLinkedHashMap.entrySet());
//		
//		while(empEnum.hasMoreElements())
//			System.out.println(empEnum.nextElement());
		
//		try (
//				
//				Stream<Map.Entry<Employee,Float>> empStream = empLinkedHashMap.entrySet().stream();
//				
//				){
//			
//					empStream.forEach(System.out::println);
//		} 
		
		for(Employee emp: empLinkedHashMap.keySet())
			empLinkedHashMap.compute(emp, (k,v) -> v +(v*0.05f));
		
		empLinkedHashMap.forEach((k,v)->System.out.println(k+ " " + v));
		
	}
}
