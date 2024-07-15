package com.gvacharya.multithreading.demo;

public class ThreadDemo extends Thread{

	@Override
	public void run() {
		printHello();
	}
	
	public static void printHello() {
		for(int i=10;i>0;i--)
			System.out.println("Hello "+i);
	}
}
