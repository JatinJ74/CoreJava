package com.gvacharya.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<>();
		
		hashSet.addAll(Arrays.asList("Apple","Ball","Cat","Dog"));
		hashSet.add("Elephant");
		
		System.out.println(hashSet);
		
		System.out.println(hashSet.contains("Cat"));
		System.out.println(hashSet.isEmpty());
		
		System.out.println(hashSet.size());
		
		System.out.println(hashSet.remove("Cat"));
		System.out.println(hashSet);
		
		hashSet.stream().forEach(e->System.out.println(e));
		
		hashSet.clear();
		System.out.println(hashSet.size());;
	}
}
//add
//addAll
//removeAll
//remove
//contains
//isEmpty
//size