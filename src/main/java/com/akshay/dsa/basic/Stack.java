package com.akshay.dsa.basic;

import java.util.EmptyStackException;

/**
 * Stack Implementation using Array
 * @author Akshay Kumar
 *
 * @param <T>
 */
public class Stack<T> {
	
	private Object data[];
	private int top = -1;
	private int size = 0;
	
	/**
	 * Constructor for creating stack
	 * @param size - the size of the stack
	 */
	public Stack(int size){
		this.size = size;
		this.data = new Object[size];
	}

	/**
	   * This is used to check whether the stack is empty or not
	   * @return isEmpty This returns boolean true if the stack is empty else it returns false
	   */
	public boolean isEmpty() {
		if (top == -1)
			return true;
		return false;
	}
	
	public boolean isStackFull() {
		if (top == size-1)
			return true;
		return false;
	}
	
	/**
	 * This method is used to add data to the stack
	 * @param data value to be added to the stack
	 * @throws StackOverflowError if the stack is full
	 */
	public void push(T data) {
		if (isStackFull())
			throw new StackOverflowError();
		this.data[++top] = data;
	}
	
	/**
	 * This method is used to remove the top element of the stack
	 * @return int the value at the top of the stack
	 * @throws EmptyStackException if the stack is empty
	 */
	public Object pop() {
		if (!this.isEmpty())
			return this.data[top--];
		throw new EmptyStackException();
	}
	
	/**
	 * Fetch the top of the stack
	 * @return int the top element of the stack
	 * @throws EmptyStackException if the stack is empty
	 */
	public Object seek() {
		if (!isEmpty())
			return this.data[top];
		throw new EmptyStackException(); 
	}
	
}
