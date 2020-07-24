package com.akash.fixedarrayqueue;

public class FixedArrayQueue {

	private int front, rear, size;
	private int[] queueArray;

	// Fixed capacity of the array
	private static final int CAPACITY = 16;

	public FixedArrayQueue() {
		front = 0;
		rear = 0;
		size = 0;
		queueArray = new int[CAPACITY];
	}

	/**
	 * Adding data to queue
	 * 
	 * @param data
	 * @throws Exception
	 */
	public void enQueue(int data) throws Exception {
		if (size() > CAPACITY) {
			throw new Exception("Queue is full : Overflow");
		}
		size++;
		queueArray[rear] = data;
		rear = (rear + 1) % CAPACITY;
	}

	/**
	 * Removing data from queue
	 * 
	 * @return
	 * @throws Exception
	 */
	public int deQueue() throws Exception {
		if (size() == 0) {
			throw new Exception("Queue is empty: Underflow");
		}
		size--;
		int data = queueArray[(front) % CAPACITY];
		queueArray[front] = Integer.MIN_VALUE;
		front = (front + 1) % CAPACITY;
		return data;

	}

	/** @return size of the queue */
	public int size() {
		return size + 1;
	}

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

	public boolean isFull() {
		if (size() == CAPACITY) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		} else {
			return false;
		}
	}

}
