package com.akshay.dsa.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.akshay.dsa.exceptions.ElementNotPresentException;

public class DoublyLinkedListQueueTest {

	@Test
	public void testEnqueue() throws ElementNotPresentException {
		DoublyLinkedListQueue queue = new DoublyLinkedListQueue();
		queue.enqueue(10);
		assertEquals(10, queue.peek());
	}
	
	@Test
	public void testDequeue() throws ElementNotPresentException {
		DoublyLinkedListQueue queue = new DoublyLinkedListQueue();
		queue.enqueue(10);
		assertEquals(10, queue.dequeue());
	}
	
	@Test
	public void testEmptyQueue() {
		DoublyLinkedListQueue queue = new DoublyLinkedListQueue();
		assertEquals(true, queue.isEmpty());
	}
}
