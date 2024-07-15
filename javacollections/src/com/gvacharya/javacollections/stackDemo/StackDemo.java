package com.gvacharya.javacollections.stackDemo;

import java.util.Stack;

import com.gvacharya.javacollections.arraylist.Employee;

public class StackDemo {

	
	public static void main(String[] args) {
		
		Stack<Employee> empStack = new Stack<>();
		
		
		
		empStack.push(new Employee(1,"ABC"));
		empStack.push(new Employee(2,"ABC"));
		empStack.push(new Employee(3,"ABC"));
		empStack.push(new Employee(4,"ABC"));
		empStack.push(new Employee(5,"ABC"));
		
		empStack.peek();
		
//		System.out.println(empStack.size());
		
		System.out.println(empStack);
		
	
		while(!empStack.isEmpty()) {
			
			System.out.println(empStack.pop());
		}
//		Employee poppedElement = empStack.pop();
//		
//		System.out.println(poppedElement);
		//push
		//peek
		//pop
		}
}
