package com.gvacharya.javacollections.set;
import com.gvacharya.javacollections.arraylist.Employee;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Integer> intSet = new HashSet<>();
		
		intSet.add(11);
		intSet.add(12);
		intSet.add(13);
		intSet.add(14);
		intSet.add(16);
		intSet.add(16);
		
		System.out.println(intSet.size());
		
		intSet.forEach(System.out::println);
		
		Set<Employee> employeeSet = new HashSet<>();
		
		employeeSet.add(new Employee(1,"Nimisha"));
		employeeSet.add(new Employee(1,"NimIsha"));
		employeeSet.add(new Employee(1,"NiMIsha"));
		employeeSet.add(new Employee(1,"NimiSha"));
		
		System.out.println(employeeSet.hashCode());
		System.out.println(employeeSet.hashCode());
		System.out.println(employeeSet.hashCode());
		
		
		System.out.println(employeeSet);
		
		//Adv for loop
		for(Employee emp: employeeSet)
			System.out.println(emp);
		
		employeeSet.forEach(System.out::println);
		employeeSet.forEach((e -> System.out.println(e)));
		
		employeeSet.stream().forEach(System.out::println);
		
		Iterator<Employee> iterator = employeeSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.hasNext());
		}
		
		Enumeration<Employee> empEnum = Collections.enumeration(employeeSet);
		
		while(empEnum.hasMoreElements())
			System.out.println(empEnum.nextElement());
		
		Boolean isContains = employeeSet.contains(new Employee(1,"assdf"));
		System.out.println(isContains);
		
		employeeSet.contains(new Employee(1,"assdf"));
		
		Employee[] empArray = (Employee[]) employeeSet.toArray(); 
		System.out.println(empArray);
		
		
		//Stream to array  and  list
		Employee[] empArray1;
		try(
				Stream<Employee> empStream2 = employeeSet.stream();
				
				){
			empArray1 = empStream2
					.filter(e-> e.getName().length()>= 6)
					.filter(e-> e.getName().charAt(5) == 'h')
					.toArray(Employee[]::new);
				}
		System.out.println(empArray1);
		
		List<Integer> idList;
		try(
				Stream<Employee> empStream2 = employeeSet.stream()
				){
			// collect (Collector.toList()) will return modifiable list
			idList = empStream2
						.map(e-> e.getEmpId())
						.collect(Collectors.toList());
			
			// toList will return immutable list object (unsupportedObject)
			idList = empStream2
				.map(e->e.getEmpId())
					.sorted()
						.toList();
			
		}
//		Iterator<Integer> intIterator = idList.listIterator();
//		while(intIterator.hasNext()) {
//			intIterator.next();
//			intIterator.remove();
//		}
		
		
		//isempty
		//empty
		//add
		//remove
		//clear
		//size
		//contains
		//toArray
				
		
	}
}
