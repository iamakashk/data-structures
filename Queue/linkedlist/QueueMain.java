package com.akash.queue.linkedlist;

public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListQueue queue = new LinkedListQueue();
		try {
			queue.enQueue(6);
			queue.enQueue(3);
			queue.enQueue(99);
			queue.enQueue(56);
			System.out.println(queue.toString());
			queue.deQueue();
			queue.deQueue();
			System.out.println(queue.toString());
			queue.enQueue(43);
			queue.enQueue(89);
			queue.enQueue(77);
			System.out.println(queue.toString());
			queue.deQueue();
			System.out.println(queue.toString());
			queue.enQueue(32);
			queue.enQueue(232);
			System.out.println(queue.toString());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
