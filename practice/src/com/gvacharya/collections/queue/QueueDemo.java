package com.gvacharya.collections.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("Apple");
		queue.offer("Bat");
		queue.offer("Cat");
		queue.offer("Dog");
		queue.offer("Elephant");
		
		System.out.println(queue);
		
		System.out.println(queue.peek());
		
		System.out.println(queue.poll());
		
		System.out.println(queue);
		
		boolean a = queue.contains("Dog");
		System.out.println(a);
	}
}
//offer
//peek
//poll
//remove
//contains