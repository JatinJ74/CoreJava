package com.gvacharya.multithreading.assignmenttwo;

public class Messages {

	public void printMessage(String message) {
		
		System.out.println(Thread.currentThread().getName());
		
		System.out.print("[ ");
		
		synchronized (this) {
			System.out.print(message);
		}
		
		System.out.println(" ]");
	}
}
