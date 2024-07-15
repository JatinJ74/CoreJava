package com.gvacharya.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayQueueDemo {

	public static void main(String[] args) {
		
		Queue<String> arrayQueue = new ArrayDeque<>();
		
		arrayQueue.offer("Apple");
		arrayQueue.offer("Bat");
		arrayQueue.offer("Cat");
		arrayQueue.offer("Dog");
		arrayQueue.offer("Fish");
		
		System.out.println(arrayQueue);
		
		System.out.println(arrayQueue.peek());
		
		System.out.println(arrayQueue.poll());
		
		System.out.println(arrayQueue.remove());
		
		System.out.println(arrayQueue);
		
	}
}
