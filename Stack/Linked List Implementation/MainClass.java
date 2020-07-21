package com.akash.LinkedListStack;

public class MainClass {

	public static void main(String[] args) {
		try {
			LinkedListStack stack = new LinkedListStack();
			System.out.println(" --Pushing in stack-- ");
			stack.push(1);
			stack.push(2);
			stack.push(3);
			stack.push(4);
			stack.push(5);
			System.out.println(" --stack after pushing-- ");
			System.out.println(stack.toString());
			System.out.println(" --stack.pop()  : "+ stack.pop());
			System.out.println(" --stack.peek() : " +stack.peek());
			System.out.println(stack.toString());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		/*  OUTPUT : 
		 *  --Pushing in stack-- 
 		 *	--stack after pushing-- 
		 *	5 4 3 2 1 
 		 *	--stack.pop()  : 5
 		 *	--stack.peek() : 4
		 *	4 3 2 1 
		 */

	}

}
