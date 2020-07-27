package com.akash.queue.dynamicarray;

public class DynamicArrayQueue {

	int length, front , rear;
	static final int CAPACITY = 16;
	int[] queueArray;
	
	/*
	 * initializing elements for queue
	 */
	public DynamicArrayQueue() {
		length = 0;
		front = 0;
		rear = 0;
		queueArray = new int[CAPACITY];
	}
	
	public void enQueue(int data) {
		if(isFull()) {
			expand();
		}
		rear++;
		queueArray[rear%CAPACITY] = data;
		length++;
	}
	public int deQueue() {
		
	}
	public boolean isFull() {
		if(size() == CAPACITY) {
			return true;
		}else {
			return false;
		}
	}
	public int size() {
		return length+1;
	}
	
	public void expand() {
		
	}
	public void shrink() {
		
	}
}
