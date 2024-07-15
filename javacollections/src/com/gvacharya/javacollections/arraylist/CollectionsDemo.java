package com.gvacharya.javacollections.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		List<Integer> intList1 = new ArrayList<>();
		
		//Intial capacity
		List<Integer> intList = new ArrayList<>(5);
		
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		
//		Collections.addAll(intList1, intList);
		
		Collections.reverse(intList);
		System.out.println(intList);
		Collections.shuffle(intList);
		System.out.println(intList);
		Collections.rotate(intList, 2);
		System.out.println(intList);
		
		int index = Collections.binarySearch(intList, 3);
		System.out.println(index);
		
		int max = Collections.max(intList);
		System.out.println(max);
		
		
		
	}
}
