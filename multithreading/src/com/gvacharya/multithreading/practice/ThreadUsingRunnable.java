package com.gvacharya.multithreading.practice;

public class ThreadUsingRunnable implements Runnable{

	@Override
	public void run() {
		printMultiThreading();
		
	}
	
	public static void printMultiThreading() {
		String text1 = "Hello, Thread";
		
		for(int i=10;i>0;i--)
			System.out.println(Thread.currentThread().getName() 
					+ " " 
					+ Thread.currentThread().getPriority()
					+ " " 
					+ text1+i);
	}
	
	public static void main(String[] args) {
		
		ThreadUsingRunnable thread1 = new ThreadUsingRunnable();
		
		Thread threadObject = new Thread(thread1);
		
		threadObject.setName("Thread-1");
		threadObject.setPriority(10);
		threadObject.start();
		
		ThreadUsingRunnable thread2 = new ThreadUsingRunnable();
		
		Thread threadObject1 = new Thread(thread1);
		
		threadObject1.setName("Thread-2");
		threadObject1.setPriority(1);
		threadObject1.start();
	}

}
