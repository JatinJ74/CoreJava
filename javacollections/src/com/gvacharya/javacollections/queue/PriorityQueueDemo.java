package com.gvacharya.javacollections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> intQueue = new PriorityQueue<>();
		
		intQueue.offer(2);
		intQueue.offer(5);
		intQueue.offer(3);
		intQueue.offer(1);
		intQueue.offer(4);
		intQueue.offer(6);
		intQueue.offer(7);
		
		System.out.println(intQueue);
		
		//Dequeuing
		// removing element
		
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		
//		Comparator<Mails> mailComparator = ((e1,e2) -> e1.getMailId().compareTo(e2.getMailId()));
//		Queue<Mails> mailQueue = new PriorityQueue<>(mailComparator);
		Queue<Mails> mailQueue = new PriorityQueue<>((e1,e2) -> e1.getMailId().compareTo(e2.getMailId()));
		
		mailQueue.offer(new Mails("abc@123gmail.com", "p3"));
		mailQueue.offer(new Mails("abc@45gmail.com", "p1"));
		mailQueue.offer(new Mails("abc@23gmail.com", "p6"));
		mailQueue.offer(new Mails("abc@53gmail.com", "p4"));
		mailQueue.offer(new Mails("abc@36gmail.com", "p2"));
		mailQueue.offer(new Mails("abc@13gmail.com", "p5"));
		
		
		System.out.println(mailQueue.poll());
		System.out.println(mailQueue.poll());
		System.out.println(mailQueue.poll());
		System.out.println(mailQueue.poll());
		System.out.println(mailQueue.poll());
		System.out.println(mailQueue.poll());
		
		
	}
}
