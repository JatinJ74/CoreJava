package com.gvacharya.multithreading.practice;

public class ThreadUsingThreadClass extends Thread{

	private String text1 = "Multithreading";
	
	
	@Override
	public void run() {
		for(int i=10;i>0;i--)
			System.out.println(text1 + i);
	}
	
	public static void main(String[] args) {
		
		ThreadUsingThreadClass ThreadDemo = new ThreadUsingThreadClass();
		ThreadDemo.start();
	}
}
