package com.gvacharya.multithreading.deadlock;

public class DeadLockDemo {

	public Thread getThread1(Object lock1,Object lock2) {
		return new Thread(new RunnableLock1(lock1,lock2));
	}
	
	public Thread getThread2(Object lock1,Object lock2) {
		return new Thread(new RunnableLock2(lock1,lock2));
	}
	
	class RunnableLock1 implements  Runnable{
		Object lock1;
		Object lock2;
		
		public RunnableLock1(Object lock1, Object lock2) {
			this.lock1 = lock1;
			this.lock2 = lock2;
		}
		
		
		@Override
		public void run() {
			synchronized(lock1) {
				System.out.println("Thread-1 acquired lock1");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
					
				}
				
				synchronized (lock2) {
					System.out.println("Thread-2 acquired lock2");
				}
			}
		}
	}
	
	class RunnableLock2 implements  Runnable{
		Object lock1;
		Object lock2;
		
		public RunnableLock2(Object lock1, Object lock2) {
			this.lock1 = lock1;
			this.lock2 = lock2;
		}
		
		
		@Override
		public void run() {
			synchronized(lock2) {
				System.out.println("Thread-2 acquired lock2");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
					
				}
				
				synchronized (lock1) {
					System.out.println("Thread-1 acquired lock1");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Object lock1 = new Object();
		Object lock2 = new Object();
		
		DeadLockDemo deadLock = new DeadLockDemo();
		
		Thread thread1 = deadLock.getThread1(lock1, lock2);
		Thread thread2 = deadLock.getThread2(lock1, lock2);
		
		thread1.start();
		thread2.start();
	}
}
