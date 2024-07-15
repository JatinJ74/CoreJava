package com.gvacharya.collections.list;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();

//		Deque<String> stack1 = new ArrayDeque<>();
		
		stack.push("Apple");
		stack.push("Ball");
		stack.push("Cat");
		stack.push("Dog");
		stack.push("Elephant");
		
//		System.out.println(stack);
//		
//		System.out.println(stack.remove(stack.peek()));
//		
//		System.out.println(stack.peek());
//		System.out.println(stack.pop());
//		System.out.println(stack.peek());
//		
//		System.out.println(stack.empty());
//		
//		
//		while(stack.empty() == false) {
//			stack.peek();
//			System.out.println(stack.pop());
//		}
		
		//traditional loop
//		for(int i=0;i<stack.size();i++) {
//			System.out.println(stack.get(i));
//		}
		
		//enhanced loop
//		for(String e:stack)
//				System.out.println(e);
		
//		System.out.println(stack.search("Elephant"));
		
//		stack.forEach(e->System.out.println(e));
		
//		stack.stream().forEach(System.out::println);
		
//		Iterator<String> stackIterator = stack.iterator();
//		
//		while(stackIterator.hasNext())
//			System.out.println(stackIterator.next());
		
//		ListIterator<String> stackListIterator = stack.listIterator();
//		
//		while(stackListIterator.hasNext())
//			System.out.println(stackListIterator.next());
		
//		Enumeration<String> stackEnum = Collections.enumeration(stack);
//		
//		while(stackEnum.hasMoreElements())
//			System.out.println(stackEnum.nextElement());
		
		System.out.println(stack.search("Apple"));
		
	}
}

//push
//pop
//peek
//empty
//search


//add
//remove
//get
//set
//size
//isEmpty
//iterator
//contains
//listIterator
//removeif
//toArray
//clear
