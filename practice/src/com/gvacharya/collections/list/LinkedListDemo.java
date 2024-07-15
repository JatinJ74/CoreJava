package com.gvacharya.collections.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<String> linkedList = new LinkedList<>();
		
		linkedList.add("Aeroplane");
		linkedList.addAll(Arrays.asList("Bat","Cat","Dance","Enhance","Fragnance"));
		System.out.println(linkedList);
		
		linkedList.set(1, "See");
		System.out.println(linkedList);
		
		String element = linkedList.get(0);
		System.out.println(element);
		
		System.out.println(linkedList.contains("See"));
		
		//Traditional loop
//		for(int i=0;i<linkedList.size();i++)
//			System.out.println(linkedList.get(i));
		
		//for enhanced loop
//		for(String element1:linkedList)
//				System.out.println(element1);
			
		//forEach
//		linkedList.forEach(element2->System.out.println(element2));
		
		//Stream
//		linkedList.stream().forEach(e->System.out.println(e));
		
		//iterator
//		Iterator<String> stringrator = linkedList.iterator();
//		while(stringrator.hasNext())
//			System.out.println(stringrator.next());
		
		//listIterator
//		ListIterator<String> stringList = linkedList.listIterator();
//		
//		while(stringList.hasNext())
//			System.out.println(stringList.next());
		
		//enumeration
//		Enumeration<String> enumList = Collections.enumeration(linkedList);
//		while(enumList.hasMoreElements())
//			System.out.println(enumList.nextElement());
		
		
//		System.out.println(linkedList.isEmpty());
		
		List<String> syncLinkedList = Collections.synchronizedList(linkedList);
	}
}
