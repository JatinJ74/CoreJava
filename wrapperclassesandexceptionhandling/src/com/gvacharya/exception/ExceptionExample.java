package com.gvacharya.exception;

public class ExceptionExample {

	public static void main(String[] args) {
		try {
			int num = 10/0;
			
			System.out.println("line 9");
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println("hello");
	}
	
	
}
