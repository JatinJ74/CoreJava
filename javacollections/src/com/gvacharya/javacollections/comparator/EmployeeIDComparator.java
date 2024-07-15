package com.gvacharya.javacollections.comparator;

import java.util.Comparator;

import com.gvacharya.javacollections.arraylist.Employee;

public class EmployeeIDComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getEmpId(),o2.getEmpId());
	}

}
