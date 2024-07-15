package com.gvacharya.stringclass;

public class StringDemo {

	public static void main(String[] args) {
		String name = "ABC";
		String name1 = "ABC";
		
		String name2 = new String("ABC");
		
		if(name1==name2) {
			System.out.println(true);
		} 
		if(name==name1) {
			System.out.println(true);
		}
		if(name1.equals(name2)) {
				System.out.println(true);
			} 
		if(name.equals(name1)) {
				System.out.println(true);
		}
		
		String str = "Shelo 410101";
		
		System.out.println(str.charAt(0));
		System.out.println();
		
		char[] strArry = str.toCharArray();
		System.out.println(strArry);
		
		//compareTo functions
		// pahele character wise comparision is done
		// then  length  wise comparision  is done
		
	}
}
