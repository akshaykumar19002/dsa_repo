package com.akshay.dsa.basic;

import com.akshay.dsa.basic.linkedlist.LinkedList;
import com.akshay.dsa.exceptions.EmptyQueueException;

/**
 * Queue
 * @author Akshay Kumar
 *
 */
public class Queue {

	private LinkedList head = null;
	
	/**
	 * Initializes the head of the queue
	 */
	public Queue() {
		this.head = new LinkedList();
	}
	
	/**
	 * Appends the element to the end of the queue
	 * @param element - to be added to the end of the queue
	 */
	public void enqueue(Object element) {
		this.head.add(element);
	}
	
	/**
	 * Removes and returns the first element of the queue
	 * @return the first element of the queue
	 * @throws EmptyQueueException if the queue is empty
	 */
	public Object dequeue() throws EmptyQueueException {
		if (this.head.isEmpty()) {
			throw new EmptyQueueException();
		}
		return this.head.removeFirst();
	}
	
	/**
	 * Returns but does not remove the first element of the queue
	 * @return the first element of the queue
	 * @throws EmptyQueueException if the queue is empty
	 */
	public Object peek() throws EmptyQueueException {
		if (this.head.isEmpty())
			throw new EmptyQueueException();
		return this.head.getFirst();
	}
	
	/**
	 * Check if the queue is empty
	 * @return true if the queue is empty
	 */
	public boolean isEmpty() {
		return this.head.isEmpty();
	}
		
}
