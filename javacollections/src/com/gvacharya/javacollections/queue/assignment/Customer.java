package com.gvacharya.javacollections.queue.assignment;

public class Customer implements Comparable<Customer>{

	private int id;
	private String name;
	private String type;
	public Customer(int id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		
		if(obj.getClass() != obj.getClass())
			return false;
		
		Customer temp = (Customer) obj;
		return this.getType().equalsIgnoreCase(temp.getType()) && this.type.equalsIgnoreCase(temp.type);
	}
	@Override
	public int compareTo(Customer o) {
		
		return this.getType().compareTo(o.getType());
	}
	
}
