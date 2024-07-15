package com.gvacharya.stringbuilderandstringbuffer;

public class StringBuilderAndStringBuffer {

	public static void main(String[] args) {
		
		StringBuffer strBuffer = new StringBuffer("Jatin");
		System.out.println(strBuffer.capacity());
		
		StringBuilder strBuilder = new StringBuilder("Jaiswal");
		System.out.println(strBuilder.capacity());
		
		System.out.println(strBuilder.length());
		System.out.println(strBuilder.reverse());
		System.out.println(strBuilder.reverse());
		System.out.println(strBuilder.append("Jatin"));
		System.out.println(strBuilder.insert(7," "));
		
		// toString Method;
		
		String name = strBuilder.toString();
		System.out.println(name);
		
		//equals
		StringBuilder strBuilder1 = new StringBuilder("Hafees Saeed");
		if(strBuilder1.equals(strBuilder)) {
			System.out.println("Both are  equal");
		}
		
		//Comparator
		if(strBuilder.compareTo(strBuilder1)<0) {
			System.out.println("obj1 is alphabatically smaller then2nd object");
		}
		
	}
}
