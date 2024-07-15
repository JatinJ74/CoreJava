package com.gvacharya.javacollections.set.linkedhashset.assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		Set<Movies> movieLinkedHashSet = new LinkedHashSet<>(); 
		
		movieLinkedHashSet.add(new Movies(1,"Khatro ke Khiladi","Akshay Kumar"));
		movieLinkedHashSet.add(new Movies(2,"Main Khiladi Tu Anadi","Akshay Kumar"));
		movieLinkedHashSet.add(new Movies(3,"Khiladi No.1","Akshay Kumar"));
		movieLinkedHashSet.add(new Movies(4,"Khiladi 786","Akshay Kumar"));
		movieLinkedHashSet.add(new Movies(5,"Khiladiyo ka Khiladi","Akshay Kumar"));
		
//		System.out.println(movieLinkedHashSet.hashCode());
//		System.out.println(movieLinkedHashSet.hashCode());
//		System.out.println(movieLinkedHashSet.hashCode());
//		System.out.println(movieLinkedHashSet.hashCode());
		
		movieLinkedHashSet.forEach(e -> System.out.println(e.hashCode()));
		
		System.out.println(movieLinkedHashSet.equals(new Movies(3,"Khiladi No.1","Akhsay kumar")));
	}
}
