package com.gvacharya.multithreading.demo;

public class MultiThreadingDemo extends Thread{

	private int table;
	
	@Override
	public void run() {
		for(int i =1 ;i<10;i++) {
			System.out.println(10*i);
		}
	}

	public void setTable(int table) {
		this.table = table;
	}
	
	public static void main(String[] args) {
		
		MultiThreadingDemo thread1 = new MultiThreadingDemo();
		MultiThreadingDemo thread2 = new MultiThreadingDemo();
		
		thread1.setTable(10);
		thread2.setTable(5);
		thread1.run();
		thread2.run();
	}
}
