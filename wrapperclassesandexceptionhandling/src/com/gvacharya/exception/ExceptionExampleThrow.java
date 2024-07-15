package com.gvacharya.exception;

public class ExceptionExampleThrow {

	public static void main(String[] args) {
		
		try {
			division(10,0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	public static void division(int num1, int num2) throws Exception {
		if(num2 == 0) {
//			throw new ArithmeticException("Can not divide by Zero");
			throw new Exception("Can not divide by Zero");
		}
	}
}
