package com.akash.stack.fixedArray;

public class FixedArrayStack {

	// Index of the top element of the stack.
	int top  = -1;
	
	// default array capacity
	private final int CAPACITY = 10;
	
	// Array used to implement stack
	int stack[] = new int[CAPACITY];
	
	/*
	 * This will return if stack is empty or not
	 */
	public boolean isEmpty() {
		if(size() == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push(int data) throws Exception {
		if(size() == CAPACITY) {
			throw new Exception("Stack is full");
		}else
		stack[++top] = data;
	}
	
	public int pop() throws Exception {
		/*
		 * Here you can either reduce the size of the stack and 
		 * then later on replace that element when the index comes or
		 * you can simply replace with Integer.MIN_VALUE
		 */
		int data;
		if(isEmpty()) {
			throw new Exception(" Stack is empty ");
		}else {
			data = stack[top];
			stack[top--] = Integer.MIN_VALUE;
			return data;
		}
	}
	
	// inspects the element which is on the top of the stack
	public int top() throws Exception {
		if(isEmpty()) 
			throw new Exception("Stack is empty");
		return stack[top];
	}
	
	//returns size of the stack
	public int size() {
		return (top+1);
	}
	
	/*
	 * This will return string representation of the stack.
	 * e.g. |1,2,3,4,5,6|
	 */
	public String toString() {
		String s= "|";
		if(size() >0 ) {
			s += stack[0];
		}
		if(size() > 1) {
			for(int i =1 ; i < size();i++) {
				s += ","+ stack[i];
			}
		}
		return s+ "|";
	}
}
