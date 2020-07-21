package com.akash.LinkedListStack;

public class LinkedListStack {

	int length;
	LinkedList top;

	public LinkedListStack() {
		length = 0;
		top = null;
	}

	public boolean isEmpty() {
		if (length == 0)
			return true;
		return false;
	}

	public void push(int data) {
		LinkedList temp = new LinkedList();
		temp.data = data;
		temp.next = top;
		top = temp;
		length++;
	}

	public int size() {
		return length;
	}

	public int pop() throws Exception {
		if (size() == 0)
			throw new Exception("Stack is empty");
		int tempData = top.data;
		top = top.next;
		length++;
		return tempData;
	}

	public int peek() throws Exception {
		if (size() == 0)
			throw new Exception("Stack is empty");
		return top.data;
	}
	
	public String toString() {
		String s = "";
		if(isEmpty())
			return s;
		LinkedList temp = top;
		while(temp != null) {
			s += temp.data+ " ";
			temp = temp.next;
		}
		return s;
	}
}
