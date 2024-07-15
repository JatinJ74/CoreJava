package com.gvacharya.multithreading.demo;

public class ThreadJoinMethod {

	public static void main(String[] args) {
		
		System.out.println("Start of the main method");
		
		Thread thread1 = new Thread(
								() -> {
									try {
										for(int i=0;i<10;i++) {
											Thread.sleep(100);
											System.out.println(i + " thread1");
										}
									} catch (Exception e) {
										e.printStackTrace();
									}
								});
		
		Thread thread2 = new Thread(
				() -> {
					try {
						for(int i=0;i<10;i++) {
							Thread.sleep(100);
							System.out.println(i + " thread2");
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				});
		
		
		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread2.start();
		
		System.out.println("End of Main method");
		
	}
}
