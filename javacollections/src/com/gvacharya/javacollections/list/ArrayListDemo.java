package com.gvacharya.javacollections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> intArrayList = 
				new ArrayList<>();
		intArrayList.add(1);
		intArrayList.add(2);
		intArrayList.add(3);
		intArrayList.add(4);
		intArrayList.add(5);
		
		System.out.println(intArrayList);
		
		List<String> stringList = new ArrayList<>();
		
		stringList.add("ABC");
		stringList.add("ccc");
		stringList.add("bbb");
		stringList.add("cbc");
		stringList.add("bbb");
		
		System.out.println(stringList.toString());
		
		// types of ways to  iterate over arraylist
		
		//for loop
		for(int i=0;i<stringList.size();i++) {
			System.out.println(stringList.get(i));
		}
		
		//adv for loop
		for(int num:intArrayList)
			System.out.println(num);
		
		// for each with lambda exp
		stringList.forEach(e->System.out.println(e));
		
		// for each with scope method resolution  operator
		stringList.forEach(System.out::println);
		
		// stream api
		stringList.stream().forEach(System.out::println);
		
		//Iterator aka cursor
		Iterator<Integer> intIterator = intArrayList.iterator();
		
		while(intIterator.hasNext())
			System.out.println(intIterator.next());
		
		// index
		System.out.println(intArrayList);
		int num = intArrayList.get(3);
		
		intArrayList.remove(num);
		System.out.println(intArrayList);
		
		//set method
		intArrayList.set(2, 10);
		System.out.println(intArrayList);
		
		// add method
		intArrayList.add(1,3);
		System.out.println(intArrayList);
		
		intArrayList.addAll(Arrays.asList(1,2,3,4,6,5,4));
		
		System.out.println(intArrayList);
		
		System.out.println(intArrayList.indexOf(10));
		
		int lastIndex = intArrayList.lastIndexOf(10);
		System.out.println(lastIndex);
		
		List<Integer> sublist = intArrayList.subList(1,6);
		System.out.println(sublist);
		
		
	}
}
