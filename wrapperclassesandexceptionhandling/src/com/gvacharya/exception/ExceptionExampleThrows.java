package com.gvacharya.exception;

public class ExceptionExampleThrows {

	public static void main(String[] args) {
		
		try {
			division(10,0);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void division(int num1, int num2)
	throws Exception{
		System.out.println(num1/num2);
	}
}
