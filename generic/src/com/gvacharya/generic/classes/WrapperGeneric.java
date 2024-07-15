package com.gvacharya.generic.classes;

import java.util.List;
import java.util.Objects;

public class WrapperGeneric<T extends Number>{

	
	private List<T> tList;
	
	
	public WrapperGeneric() {
	}
	public WrapperGeneric(int t, List<T> tList) {
		
		this.tList = tList;
	}
	
	public List<T> gettList() {
		return tList;
	}
	public void settList(List<T> tList) {
		this.tList = tList;
	}
	
	public boolean addElement(T t) {
		return tList.add(t);
	}
	public void gForEach() {
		tList.forEach(System.out::println);
	}
	@Override
	public String toString() {
		return "WrapperGeneric [tList=" + tList + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(tList);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WrapperGeneric other = (WrapperGeneric) obj;
		return Objects.equals(tList, other.tList);
	}
	
	
}
