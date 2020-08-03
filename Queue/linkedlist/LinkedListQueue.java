package com.akash.queue.linkedlist;

public class LinkedListQueue {

	int size ;
	LinkedListNode front , rear ;
	public LinkedListQueue(){
		this.front = this.rear = null;
		size = 0;
	}
	// Inserting into queue
	public void EnQueue(int data) {
		LinkedListNode node  = new LinkedListNode(data);
		if(isEmpty()) {
			front = node;
		}else {
			rear.next = node;
		}
	}
	/**
	 * @return true if queue is empty
	 */
	public boolean isEmpty() {
		if(size() == 0) {
			return true;
		}else {
			return false;
		}
	}
	public int size() {
		return size;
	}
}
