package com.gvacharya.javacollections.arraylist;

public class Employee implements Comparable<Employee> {

	private int empId;
	private String name;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}

//	@Override
//	public int compareTo(Employee temp) {
//		return this.name.compareTo(temp.name);
//	}

	@Override
	public int compareTo(Employee temp) {
//		int result = 0;
//		
//		if(this.empId<temp.empId)
//			result = -1;
//		if(this.empId==temp.empId)
//			result = 0;
//		if(this.empId>temp.empId)
//			result = 1;
//		
//		return result; 

		return Integer.compare(this.empId, temp.empId);
 
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;

		if (this.getClass() != o.getClass())
			return false;

		Employee temp = (Employee) o;

		return (temp.getEmpId() == this.getEmpId() && temp.name.equalsIgnoreCase(this.name));
	}

	@Override
	public int hashCode() {
		int hash = 13;
		hash = hash * 17 + empId;
		hash = hash * 17 + name.toLowerCase().hashCode();
		return hash;

	}

}
