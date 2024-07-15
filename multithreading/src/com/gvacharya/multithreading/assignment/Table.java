package com.gvacharya.multithreading.assignment;

public class Table {

	private int table;
	private int tableNo;
	
	public Table() {
		
	}
	
	public Table(int table, int tableNo) {
		this.table = table;
		this.tableNo = tableNo;
	
	}
	
	public void printTable(int tableNumber) {
		
		System.out.println("Table No: "+tableNumber);
		
		synchronized (this){
			for(int i=0;i<11;i++) {
				System.out.println(table*i);
			}
		
		}
	}

	public void setTable(int table,int tableNo) {
		this.table = table;
		this.tableNo = tableNo;
		
	}
}
