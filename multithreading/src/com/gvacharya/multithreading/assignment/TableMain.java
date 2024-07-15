package com.gvacharya.multithreading.assignment;

public class TableMain {

	public static void main(String[] args) {
		
		Table table = new Table();
		
		table.setTable(10,20);
		
		RunnableTable runTable = new RunnableTable(table,10);
		RunnableTable runTable1 = new RunnableTable(table,20);
		
		Thread thread1 = new Thread(runTable);
		
		Thread thread2 = new Thread(runTable1);
		
		thread1.start();
		thread2.start();
		
		
		
	}
}
 