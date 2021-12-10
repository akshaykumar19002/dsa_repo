package com.akshay.dsa.basic;

import java.util.EmptyStackException;

/**
 * Dynamic Stack using LinkedList
 * @author Akshay Kumar
 *
 */
public class DynamicStack {

	private LinkedList stack;
	
	/**
	 * Initializes the stack
	 */
	public DynamicStack(){
		this.stack = new LinkedList();
	}

	/**
	   * This is used to check whether the stack is empty or not
	   * @return isEmpty This returns boolean true if the stack is empty else it returns false
	   */
	public boolean isEmpty() {
		if (stack.isEmpty())
			return true;
		return false;
	}
	
	/**
	 * This method is used to add data to the stack
	 * @param data value to be added to the stack
	 */
	public void push(Object data) {
		this.stack.add(data);
	}
	
	/**
	 * This method is used to remove the top element of the stack
	 * @return Object the value at the top of the stack
	 * @throws EmptyStackException if the stack is empty
	 */
	public Object pop() {
		if (stack.isEmpty())
			throw new EmptyStackException();
		return stack.removeLast();
	}
	
	/**
	 * Fetch the top of the stack
	 * @return Object the top element of the stack
	 * @throws EmptyStackException if the stack is empty
	 */
	public Object seek() {
		if (isEmpty())
			throw new EmptyStackException();
		return stack.getLast();
	}
	
}
