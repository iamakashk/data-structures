package com.akash.queue.linkedlist;

public class LinkedListQueue {

	int size ;
	LinkedListNode front , rear ;
	public LinkedListQueue(){
		this.front = this.rear = null;
		size = 0;
	}
	// Inserting into queue
	public void enQueue(int data) {
		LinkedListNode oldRear = rear;
		 rear = new LinkedListNode(data);
		 rear.next = null;
		 if (isEmpty()) 
		 {
		 front = rear;
		 }
		 else 
		 {
		 oldRear.next = rear;
		 }
		 size++;
		 System.out.println(data+ " added to the queue");
	}
	
	public int deQueue()
	 {
	 int data = front.data;
	 front = front.next;
	 if (isEmpty()) 
	 {
	 rear = null;
	 }
	 size--;
	 System.out.println(data+ " removed from the queue");
	 return data;
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
	public String toString() {
		String str = "";
		LinkedListNode temp = front;
		while(temp.next != null) {
			str += "|" + temp.data;
			temp = temp.next;
		}
		str += "|" + temp.data;
		return str;
	}
}
