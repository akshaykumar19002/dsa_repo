package com.akshay.dsa.basic;

import com.akshay.dsa.basic.linkedlist.DoublyLinkedList;
import com.akshay.dsa.exceptions.ElementNotPresentException;
import com.akshay.dsa.exceptions.EmptyQueueException;

/**
 * 
 * DoublyLinkedListQueue
 * @author Akshay
 *
 */
public class DoublyLinkedListQueue {

	private DoublyLinkedList head;
	
	/**
	 * Initializes the head of the queue
	 */
	public DoublyLinkedListQueue() {
		this.head = new DoublyLinkedList();
	}
	
	/**
	 * Appends an element to the end of the queue
	 * @param element - to be added to the end of the queue
	 */
	public void enqueue(Object element) {
		this.head.add(element);
	}
	
	/**
	 * Removes and returns the first element of the queue
	 * @return the first element of the queue
	 * @throws ElementNotPresentException if queue is empty
	 */
	public Object dequeue() throws ElementNotPresentException{
		if (isEmpty())
			throw new ElementNotPresentException();
		return this.head.removeFirst();
	}
	
	/**
	 * Returns but does not remove the first element of the queue
	 * @return the first element of the queue
	 * @throws EmptyQueueException if the queue is empty
	 */
	public Object peek() throws ElementNotPresentException{
		if (isEmpty())
			throw new ElementNotPresentException();
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
