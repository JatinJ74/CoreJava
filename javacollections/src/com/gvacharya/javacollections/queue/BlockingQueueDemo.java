package com.gvacharya.javacollections.queue;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class BlockingQueueDemo {
	
	public static void main(String[] args) {
		
		BlockingQueue<Integer> intQueue = new PriorityBlockingQueue<>(5);
		
		try {
			
			intQueue.put(10);
			intQueue.put(8);
			intQueue.put(7);
			intQueue.put(6);
			intQueue.put(5);
			intQueue.put(4);
			intQueue.put(3);	
			intQueue.take();
			intQueue.take();
			intQueue.take();
			intQueue.take();
			intQueue.take();
			intQueue.take();
			intQueue.take();
			System.out.println(intQueue);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
}
