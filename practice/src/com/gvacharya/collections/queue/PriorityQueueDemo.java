package com.gvacharya.collections.queue;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		Queue<String> pqd = new PriorityQueue<>();
		
		pqd.offer("Apple");
		pqd.offer("Apple");
		pqd.offer("Apple");
		pqd.offer("Apple");
		
		System.out.println(pqd.peek());
		
		System.out.println(pqd.poll());
		pqd.stream().forEach(System.out::println);
		
		Object[] object = pqd.toArray();
		System.out.println(Arrays.toString(object));
		
	}
}
