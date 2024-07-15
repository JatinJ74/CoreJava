package com.gvacharya.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.stream.Collectors;

public class StreamApiDemo {

	public static void main(String[] args) {
		
		List<Integer> streamapi = new ArrayList<>();
		
		streamapi.addAll(Arrays.asList(1,2,4,3,6,5,7,7,8,9,8));
 //		streamapi.stream().forEach(e->System.out.println(e));
		
//		streamapi.stream().sorted().forEach(e->System.out.println(e));
//		streamapi.stream().sorted().distinct().forEach(e->System.out.println(e));
//		long evenumber = streamapi.stream().filter(element -> element%2 == 0).distinct().count();
//		System.out.println(evenumber);
		
//		Set<Integer> set = streamapi.stream().distinct().collect(Collectors.toSet());
//		
//		System.out.println(set);
		
		List<Integer> list = streamapi.stream().distinct().map(StreamApiDemo::factorialN).collect(Collectors.toList());
		
		System.out.println(list);
		
		String string = "When you own your morning, you elevate your life. ";
		System.out.println(string);
//		StringBuilder newString = new StringBuilder(string);
//		System.out.println(newString);
//		
//		System.out.println(newString.reverse());
		
		List<String> newstring = new ArrayList<>();
		
		newstring.addAll(Arrays.asList(string));
		
		System.out.println(newstring);
		
		List<String> string2 = newstring.stream().map(String::toLowerCase).collect(Collectors.toList());
		
		System.out.println(string2);
//		
//		for(int i=string2.size();i>0;i--) {
//			String[] reverse =
//		}
		
		System.out.println(string2.get(4));
		
//		
//		String words = string2.toString();
//		System.out.println(words);
//		
		
		
		
		
		
	}
	
	public static int factorialN(int a) {
		if(a==0) {
			return 1;
		}
		return a * factorialN(a-1);
		
	}
}
//sorted - Consumer
//filter - predicate
//map - functional
//limit - 
//skip
//distinct

//max
//min
//foreach
//collect
//anymatch
//allmatch
//findfirst
//findany
//count