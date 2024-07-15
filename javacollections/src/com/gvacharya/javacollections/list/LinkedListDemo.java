package com.gvacharya.javacollections.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

import com.gvacharya.javacollections.arraylist.Employee;
import com.gvacharya.javacollections.comparator.EmployeeComparator;
import com.gvacharya.javacollections.comparator.EmployeeIDComparator;
import com.gvacharya.javacollections.comparator.EmployeeNameComparator;
public class LinkedListDemo {

	
	public static void main(String[] args) {
		
		List<Integer> linkedList = new LinkedList<>();
		
		linkedList.add(10);
		System.out.println(linkedList);
		
		linkedList.addAll(Arrays.asList(11,12,13,14,15,16));
		System.out.println(linkedList);
		
		linkedList.add(2, 5);
		System.out.println(linkedList);
		
		linkedList.remove(2);
		System.out.println(linkedList);
		
		linkedList.remove(Integer.valueOf(11));
		System.out.println(linkedList);
		
		System.out.println(linkedList.get(1));
		
		System.out.println(linkedList.contains(12));
		
		System.out.println(linkedList);
		
		for(int i =0; i<linkedList.size();i++) {
			int element = linkedList.get(i);
			System.out.println(element);
		}
		
		System.out.println();
		
		for(int element:linkedList)
			System.out.println(element);
		
		linkedList.forEach(e->System.out.println(e));
		
		System.out.println();
		
		Iterator<Integer> iterator = linkedList.iterator();
		
		while(iterator.hasNext()) {
			Integer element = iterator.next();
			System.out.println(element);
		}
		
		linkedList.forEach(System.out::println);
		
		
		Enumeration<Integer> enumerate = Collections.enumeration(linkedList);
		
		while(enumerate.hasMoreElements()) {
			System.out.println(enumerate.nextElement());
		}
		
		ListIterator<Integer> listIterator = linkedList.listIterator();
		
		int i = 0;
		while(listIterator.hasPrevious()) {
			listIterator.previous();
			listIterator.set(i++);
		}
		
		System.out.println(linkedList);
		
		linkedList.sort((e1,e2) -> e1.compareTo(e2));
		
		linkedList.sort(Comparable::compareTo);
		
		Collections.sort(linkedList);
		
		List<Employee> employeeList = new LinkedList<>();
		
		employeeList.add(new Employee(1,"emp1"));
		employeeList.add(new Employee(2,"emp3"));
		employeeList.add(new Employee(4,"emp5"));
		employeeList.add(new Employee(3,"emp4"));
		employeeList.add(new Employee(5,"emp2"));
		
//		employeeList.sort(Comparable::compareTo);
		
//		System.out.println(employeeList);
		
//		Comparator<Employee> IDComparator = ((e1,e2) -> Integer.compare(e1.getEmpId(),e2.getEmpId()));
//		System.out.println(IDComparator);
//		
//		
//		Comparator<Employee> NameComparator = ((e1,e2) -> e1.getName().compareTo(e2.getName()));
//		System.out.println(NameComparator);
		
//		employeeList.sort(new EmployeeIDComparator());
//		System.out.println(employeeList);

		employeeList.sort((e1,e2) -> e1.getName().compareTo(e2.getName()));
		System.out.println(employeeList);
		
		employeeList.sort((e1,e2) -> Integer.compare(e1.getEmpId(),e2.getEmpId()));
		System.out.println(employeeList);
		
		try(
				
				Stream<Employee> employeeStream = employeeList.stream();
				){
			
				employeeStream.sorted(EmployeeComparator.idComparator).forEach(System.out::println);
		}
		
		
	}
}

//linkedlist student- roll,name,fees(float)
// array.aslist element add
// sort
//natural sorting order - roll no , comparable
// 3 comparator - roll, name, fees