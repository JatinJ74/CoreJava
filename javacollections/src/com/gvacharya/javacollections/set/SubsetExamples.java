package com.gvacharya.javacollections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubsetExamples {
	
	public static void main(String[] args) {
		//dafault construct / initial capacity 16 hashTable
//		Set<Integer> intSet = new HashSet<>();
		
		//paramatrized constructor / intialize capaicty value
//		Set<Integer> intSet1 = new HashSet<>(32);
		
		//provide initial capacity and load factor
		SortedSet<Integer> intSet = new TreeSet<>();
		
		intSet.add(11);
		intSet.add(12);
		intSet.add(13);
		intSet.add(14);
		intSet.add(15);
		intSet.add(16);
		intSet.add(17);
		intSet.add(18);
		
		Set<Integer> subSet = intSet.subSet(12,16);
		
		System.out.println(subSet);
		
		subSet.remove(14);
		
		System.out.println(subSet);
		
		subSet.add(15);
		
		System.out.println(subSet);
		
		Set<Integer> tailSet = intSet.tailSet(14);
		
		System.out.println(tailSet);
		
		Set<Integer> headSet = intSet.headSet(16);
		
		System.out.println(headSet);
		
		// Only for reading purpose
		Set<Integer> unModifiableSet = Collections.unmodifiableSet(intSet);
		
//		unModifiableSet.add(20);
//		unModifiableSet.remove(15);
		System.out.println(unModifiableSet);
		
		Iterator<Integer> intIterator = unModifiableSet.iterator();
		
		while(intIterator.hasNext())
			System.out.println(intIterator.next());
		
		Set checkedSet = Collections.checkedSet(intSet, Integer.class);
		checkedSet.add(10);
		
		Set<Integer> syncSet = Collections.synchronizedSet(intSet);
		System.out.println(syncSet);
		
//		HashSet<Integer> subSet = ;
		
		
	}
	
}
