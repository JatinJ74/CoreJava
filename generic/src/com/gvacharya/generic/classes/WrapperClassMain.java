package com.gvacharya.generic.classes;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassMain {

	public static void main(String[] args) {
		
		List<Number> wrapperList = new ArrayList<>();
		
		WrapperGeneric<Number> wrapperGeneric = new WrapperGeneric();
		
		wrapperGeneric.settList(wrapperList);
		
		wrapperGeneric.addElement(10);
		wrapperGeneric.addElement(10.03F);
		wrapperGeneric.addElement(10.222222222D);
//		wrapperGeneric.addElement("ABC");
		
		wrapperGeneric.gForEach();
		
		
	}
	

}
