package com.gvacharya.multithreading.demo;

public class RunnableDemo implements Runnable{

	@Override
	public void run() {
		
		printRunnable();
			
	}
	
	public static void printRunnable() {
		for (int i = 0; i <=10; i++) 
			System.out.println("Runnable" + i);
	}

}
