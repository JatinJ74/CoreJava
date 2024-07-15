package com.gvacharya.collections.list;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<>();
		
		vector.add("Apple");
		vector.addElement("Ball");
		vector.insertElementAt("Cat", 2);
		
		System.out.println(vector);
		
		System.out.println(vector.get(1));
		System.out.println(vector.elementAt(2));
		System.out.println(vector.firstElement());
		System.out.println(vector.lastElement());
		
		System.out.println(vector.remove("Apple"));
		System.out.println(vector.removeElement("Cat"));
		vector.removeElementAt(0);
		System.out.println(vector);
	}
}
//add
//addElement
//insertElementAt

//remove
//removeElement
//removeElementAt

//get
//elementAt
//firstElement
//LastElement

