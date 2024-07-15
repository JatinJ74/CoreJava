package com.gvacharya.generic.classes;


import java.util.List;

public class ObjectBox<T>{

	private List<T> zList;

	public List<T> getzList() {
		return zList;
	}

	public void setzList(List<T> zList) {
		this.zList = zList;
	}
	
	public boolean addElement(T t) {
		return zList.add(t);
	}
	
	public void zForEach() {
		zList.forEach(System.out::println);
	}

}
