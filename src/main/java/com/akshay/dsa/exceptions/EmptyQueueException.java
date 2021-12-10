package com.akshay.dsa.exceptions;

/**
 * EmptyQueueException
 * @author Akshay Kumar
 *
 */
public class EmptyQueueException extends Exception {
	
	public EmptyQueueException() {
		super("Queue is empty");
	}
}