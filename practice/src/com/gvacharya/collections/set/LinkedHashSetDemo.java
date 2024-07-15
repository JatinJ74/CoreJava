package com.gvacharya.collections.set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<String> lhd = new LinkedHashSet<>();
		
		
		lhd.add("Apple");
		lhd.add("Banana");
		lhd.add("Cake");
		lhd.add("Dosa");
		lhd.addAll(Arrays.asList("Elaichi","Fish","Ghee"));
		
		System.out.println(lhd);
		
		System.out.println(lhd.size());
		System.out.println(lhd.contains("Elaichi"));
		System.out.println(lhd.remove("Fish"));
		System.out.println(lhd);
		
		Object[] string = lhd.toArray();
		System.out.println(Arrays.toString(string));
		
	}
}
