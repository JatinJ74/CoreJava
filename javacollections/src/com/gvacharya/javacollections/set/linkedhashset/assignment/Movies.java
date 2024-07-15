package com.gvacharya.javacollections.set.linkedhashset.assignment;

import com.gvacharya.javacollections.arraylist.Employee;

public class Movies {

	private int id;
	private String name;
	private String leadActor;
	public Movies(int id, String name, String leadActor) {
		super();
		this.id = id;
		this.name = name;
		this.leadActor = leadActor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLeadActor() {
		return leadActor;
	}
	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
	@Override
	public String toString() {
		return "Moives [id=" + id + ", name=" + name + ", leadActor=" + leadActor + "]";
	}
	
	
	@Override
	public int hashCode() {
		int hash = 13;
		hash = hash*17 + id;
		hash = hash*17 + name.toLowerCase().hashCode();
		hash = hash*17 + leadActor.toLowerCase().hashCode();
		return hash;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;

		if (this.getClass() != o.getClass())
			return false;

		Movies temp = (Movies) o;
 
		return (temp.getName() == this.getName() && temp.name.equalsIgnoreCase(this.name) 
				&& temp.leadActor.equalsIgnoreCase(this.leadActor));
	}
	
	
}
