package com.gvacharya.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionExampleTwo {

	public static void main(String[] args) {
		try {
		division(10,0);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		try { 
			System.out.println(getDate("18.06.2024"));
		} catch (ParseException e) {
			System.out.println(e);
		}finally {
			
		}
		
		
	}
	
	public static void division(int num1, int num2) {
		System.out.println(num1/num2);
	}
	
	public static Date getDate(String dateString) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy");
		
		return dateFormat.parse(dateString);
		
	}
}
