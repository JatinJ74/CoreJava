package com.gvacharya.multithreading.demo;

public class ThreadUsingThreadClass {

	public static void main(String[] args) {
		
		ThreadDemo thread1 = new ThreadDemo();
		ThreadDemo thread2 = new ThreadDemo();
		
		thread1.run();
		thread2.run();
	}
}
