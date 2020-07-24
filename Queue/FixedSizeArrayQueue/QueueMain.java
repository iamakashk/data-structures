package com.akash.fixedarrayqueue;

public class QueueMain {

	public static void main(String[] args) {
		try {
			FixedArrayQueue queue = new FixedArrayQueue();
			queue.enQueue(1);
			queue.enQueue(2);
			queue.enQueue(3);
			queue.enQueue(4);
			queue.enQueue(5);
			System.out.println("Queue after enqueue: "+ queue.toString());
			System.out.println("Removed element: " + queue.deQueue());
			System.out.println("Removed element: " + queue.deQueue());
		}catch(Exception ex) {
			ex.printStackTrace();
		}	
		/*
		 * OUTPUT: 
		 * Queue after enqueue: |1|2|3|4|5|0|0|0|0|0|0|0|0|0|0|0|
		 * Removed element: 1
		 * Removed element: 2
		 */
	}
}
