package com.akash.queue.dynamicarray;

public class QueueMain {
	public static void main(String args[]) {
		DynamicArrayQueue queue = new DynamicArrayQueue();
		try {
			for(int i = 1 ; i <= 20 ; i++) {
				queue.enQueue(i);
			}
			
			System.out.println("Queue after enqueue: "+ queue.toString());
			System.out.println("Removed element: " + queue.deQueue());
			System.out.println("Removed element: " + queue.deQueue());
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
