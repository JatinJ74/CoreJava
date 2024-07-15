package com.gvacharya.multithreading.assignmenttwo;

public class MainMessage {


	public static void main(String[] args) {
		
		Messages msg = new Messages();
	
		new Thread(() -> msg.printMessage("ABC"),"Thread-1").start();
		 
		new Thread(() -> msg.printMessage("BCA"),"Thread-2").start();
	}
}
