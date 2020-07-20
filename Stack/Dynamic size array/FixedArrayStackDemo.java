package com.akash.stack.fixedArray;

public class FixedArrayStackDemo {

	public static void main(String args[]) {
		FixedArrayStack stack = new FixedArrayStack();
		try {
			// adding element in stack
			stack.push(1);
			stack.push(2);
			stack.push(3);
			stack.push(4);
			stack.push(5);
			
			// removing element
			stack.pop();
			
			System.out.println(stack.top());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(stack.toString());
	}
}
