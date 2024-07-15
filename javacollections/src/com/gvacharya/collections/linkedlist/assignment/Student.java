package com.gvacharya.collections.linkedlist.assignment;

public class Student implements Comparable<Student> {

	private int rollNo;
	private String Name;
	private float Fees;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name, float fees) {
		super();
		this.setRollNo(rollNo);
		setName(name);
		setFees(fees);
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getFees() {
		return Fees;
	}
	public void setFees(float fees) {
		Fees = fees;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + Name + ", Fees=" + Fees + "]";
	}
	
	@Override
	public int compareTo(Student temp) {
		// TODO Auto-generated method stub
		return Integer.compare(this.getRollNo(),temp.getRollNo());
	}
	
	
}
