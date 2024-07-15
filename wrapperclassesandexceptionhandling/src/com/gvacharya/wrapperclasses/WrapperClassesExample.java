package com.gvacharya.wrapperclasses;
// Wrapping primitive datatype into wrapper object.
// Wrapping is supported by compiler. Thus Wrapping happens at compile time
// Benefits - inbuilt function for applications. no need to reinvent the wheel
// Working with boolean is bit difficult.
// boolean to primitive datatype not possible.
// but with String class it is.
// works with java api - collections, generic classes.
// Wrapper classes are immutable similar to string class objects
// Cnst pool/Literal pool and heap are used by wrapper object.
// memory consumption high - disadvantage
// package - java.lang.Number

// 
public class WrapperClassesExample {

	public static void main(String[] args) {
		
		Integer number = Integer.valueOf(10); //Boxing - primitive datatype ko wrap karna into wrapper object.
		
		int tempVal = 20;
		Integer numbe1 = tempVal; // Auto_boxing
		System.out.println(number);
		
		int tempVal1 = Integer.valueOf(number); //unboxing
		
		System.out.println(tempVal);
		
		tempVal = tempVal1; //auto-unboxing 
		
		Integer number1 = 10;
		Integer number2 = 20;
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		
		add(number1,number2);
		
		Boolean flag = true;
		String flagString = flag.toString();
		
		//Reverse number
		int num = number1.valueOf("10");
		
		StringBuilder str = new StringBuilder(number1.toString());
		System.out.println(str.reverse());
		
		// boolean to number data type  not possible
		// boolean to string  data type possible
		
	}
	
	public static void add(int number1, int  number2) {
		System.out.println(number1+number2);
	}
}
