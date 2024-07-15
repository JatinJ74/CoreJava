package com.gvacharya.javacollections.vector;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import com.gvacharya.javacollections.arraylist.Employee;

public class VectorDemo {

	public static void main(String[] args) {
		Employee emp = new Employee(1,"ABC");
		List<Employee> employeeList = new Vector<>();
		List<Employee> employeeList1 = Arrays.asList(
				new Employee(1,"ABC"),
				new Employee(3,"BCC"),
				new Employee(2,"CBC")
				
				);
				
		
		employeeList.add(new Employee(1,"ABC"));
		
//		
//		Employee emp1 = employeeList.get(0);
//		System.out.println(emp1);
//		
//		employeeList.addAll(employeeList1);
//		
//		employeeList.remove(1);
//		
//		System.out.println(employeeList.removeIf(e->e.getName().equals("EMP3")));
//		
//		employeeList.forEach(System.out::println);
//		
		employeeList.retainAll(employeeList1); //performs intersection operation
		System.out.println(employeeList);
		
	}
}
