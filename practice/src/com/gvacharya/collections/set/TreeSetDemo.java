package com.gvacharya.collections.set;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		treeSet.addAll(Arrays.asList(1,3,2,4,6,5,7,9,8));
		
		System.out.println(treeSet);
		
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		
		SortedSet<Integer> headSet = treeSet.headSet(4);
		
		System.out.println(headSet);
		
		SortedSet<Integer> tailSet = treeSet.tailSet(5);
		System.out.println(tailSet);
		
		SortedSet<Integer> subSet = treeSet.subSet(2, 7);
		System.out.println(subSet);
		
		NavigableSet<Integer> descendingSet = treeSet.descendingSet();
		
		System.out.println(treeSet);
		System.out.println(descendingSet);
		
	}
}
//first
//last
//headset
//tailset
//subset
//descendingset