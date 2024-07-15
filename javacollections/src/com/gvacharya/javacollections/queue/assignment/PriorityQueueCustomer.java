package com.gvacharya.javacollections.queue.assignment;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueCustomer {

	public static void main(String[] args) {
		
		Queue<Customer> customerQueue = new PriorityQueue<>();
		
		customerQueue.offer(new Customer(2,"Rohan","Prime"));
		customerQueue.offer(new Customer(1,"Rohit","Normal"));
		customerQueue.offer(new Customer(3,"Kunal","Classic"));
		customerQueue.offer(new Customer(4,"Jatin","Prime"));
		customerQueue.offer(new Customer(6,"Krishna","Normal"));
		customerQueue.offer(new Customer(5,"Vijay","Classic"));
		
		
		Iterator<Customer> iteratorCustomer = customerQueue.iterator();
		
		while(iteratorCustomer.hasNext()) {
			Customer cust = iteratorCustomer.next();
			String type = cust.getType();
////			if(type == "Normal") {
////				System.out.println("Normal");
////				System.out.println(cust);
//			}
			System.out.println(cust);
		}
	}
}
