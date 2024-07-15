package com.gvacharya.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> arrayString = new ArrayList<>();
		
		arrayString.addAll(Arrays.asList("Apple","Ball","Dog","Cat","Eel","Fish"));
		
		arrayString.add(2,"Meow");
		
		System.out.println(arrayString);
//		arrayString.clear();
//		System.out.println(arrayString);
		
		//Iterating over each elements
		
		//traditional for loop
//		for(int i=0;i<arrayString.size();i++) {
//			System.out.println(arrayString.get(i));
//		}
		
		//enhanced for loop
//		for(String element:arrayString)
//				System.out.println(element);
//		
		
		//forEach - lambda expression
//		arrayString.forEach(e->System.out.println(e));
		
		//forEach - scope operater
//		arrayString.forEach(System.out::println);
	
//		Iterator<String> iterateString = arrayString.iterator();
//		
//		while(iterateString.hasNext())
//			System.out.println(iterateString.next());
		
//		ListIterator<String> listIterator  = arrayString.listIterator();
//		
//		while(listIterator.hasNext())
//			System.out.println(listIterator.next());
		
//		Stream<String> streamString = arrayString.stream();
//		
//		streamString.forEach(e->System.out.println(e));
//		
//		Enumeration<String> enumList = Collections.enumeration(arrayString);
//		
//		while(enumList.hasMoreElements())
//			System.out.println(enumList.nextElement());
		
//		arrayString.remove("Cat");
//		System.out.println(arrayString);
		
//		arrayString.add("Cat");
//		boolean contains = arrayString.contains("Cat");
//		System.out.println(contains);
		
//		System.out.println(arrayString.isEmpty());
//		System.out.println(arrayString.size());
//		System.out.println(arrayString);
//		System.out.println(arrayString.set(2, "Carl"));
//		System.out.println(arrayString.get(2));
		
		//thread safe
//		List<String> syncList = Collections.synchronizedList(arrayString);
		
		System.out.println();
		Collections.sort(arrayString);
		System.out.println(arrayString);
		
	}
}
//add
//remove(element)
//set(index,element)
//get(index)
//size
//contains
//isEmpty
//clear
