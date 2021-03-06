package com.akash.queue.dynamicarray;

public class DynamicArrayQueue {

	int length, front , rear;
	static int CAPACITY = 16;
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
	
	// pushes data into the queue
	public void enQueue(int data) {
		if(isFull()) {
			expand();
		}
		length++;
		queueArray[rear] = data;
		rear = (rear+1)%CAPACITY;
	}
	// removes or serves data from queue
	public int deQueue() throws Exception {
		if(size() == 0) {
			throw new Exception("Queue is empty");
		}else {
			length--;
			int data  = queueArray[front%CAPACITY];
			queueArray[front] = Integer.MIN_VALUE;
			front = (front+1)%CAPACITY;
			return data;
		}
	}
	// returns true if Queue is full
	public boolean isFull() {
		if(size() == CAPACITY) {
			return true;
		}else {
			return false;
		}
	}
	//returns size of the queue
	public int size() {
		return length+1;
	}
	// double the queue size
	public void expand() {
		int temp[] = new int[size()<<1]; // 2*size()
		for(int i = front ; i <= rear ; i++) {
			temp[i-front] = queueArray[i%CAPACITY];
		}
		queueArray = temp;
		front = 0;
		rear = size()-1;
		CAPACITY *=2;
	}

	//returns string representation of the queue
	public String toString() {
		String s = "|";
		for (int i = 0; i < queueArray.length; i++) {
			if (i == 0) {
				s += queueArray[i];
			} else {
				s += "|" + queueArray[i];
			}
		}
		return s + "|";
	}

}
