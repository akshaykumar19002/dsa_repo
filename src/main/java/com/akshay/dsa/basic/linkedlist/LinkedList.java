package com.akshay.dsa.basic.linkedlist;

import java.util.NoSuchElementException;

import com.akshay.dsa.models.Node;

/**
 * Singly LinkedList
 * @author Akshay Kumar
 *
 */
public class LinkedList {
	
	Node head;
	
	public LinkedList() {}
	
	/**
	 * Appends the specified element to the end of this list.
	 * @param element - element to be added to the list
	 */
	public void add(Object element) {
		Node newNode = new Node(element);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	

	/*
	To be tested again still getting some location issues
	*/
	
	/**
	 * Appends the specified index to the provided index in the list
	 * @param index - index where the element should be added
	 * @param element - element to be added to the list
	 */
	public void add(int index, Object element) {
		Node newNode = new Node(element);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		int count = 0;
		Node prev = null;
		while (temp.next != null) {
			if (count == index) {
				if (prev == null) {
					newNode.next = head;
					this.head = newNode;
					return;
				}
				newNode.next = prev.next;
				prev.next = newNode;
				return;
			}
			count ++;
			temp = temp.next;
		}
		temp.next = newNode;
	}
		
	/**
	 * Appends the specified element to the front of this list.
	 * @param element - element to be added to the end of the list
	 */
	public void addFirst(Object element) {
		Node newNode = new Node(element);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	/**
	 * Displays all the elements of the list
	 */
	public void viewList() {
		Node temp = this.head;
		if (temp == null) {
			System.out.println("List is empty");
			return;
		}
		int count = 1;
		while (temp != null) {
			System.out.println("Index " + count++ + " : " + temp.data);
			temp = temp.next;
		}
	}
	
	/**
	 * Clear all the elements of the list
	 */
	public void clear() {
		head = null;
	}
	
	/**
	 * Returns true if this list contains no elements
	 * @return true if list contains any element
	 */
	public boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}

	/**
	 * Returns true if this list contains the specified element. 
	 * @param element the data we are to find in the list
	 * @return true if list contains the element
	 */
	public boolean contains(Object element) {
		if (isEmpty()) {
			return false;
		}
		Node temp = head;
		while (temp != null) {
			if (temp.data == element) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	/**
	 * Returns the element at the specified position in this list.
	 * @param index - index of the element to return
	 * @return the element at the specified position in this list
	 * @throws IndexOutOfBoundsException if the specified index is not present in the list
	 */
	public Object get(int index) {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			if (count == index) {
				return temp.data;
			}
			count ++;
			temp = temp.next;
		}
		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Returns the first element in this list.
	 * @return the first element in the list
	 * @throws NoSuchElementException if the list is empty
	 */
	public Object getFirst() {
		if (head == null)
			throw new NoSuchElementException();
		return head.data;
	}
	
	/**
	 * Returns the last element in this list.
	 * @return the last element in the list
	 * @throws NoSuchElementException if the list is empty
	 */
	public Object getLast() {
		if (head == null)
			throw new NoSuchElementException();
		Node temp = head;
		while (temp.next != null)
			temp = temp.next;
		return temp.data;
	}
	
	/**
	 * Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
	 * @param element - element to search for
	 * @return the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element
	 */
	public int indexOf(Object element) {
		int counter = -1;
		Node temp = head;
		while (temp != null) {
			counter ++;
			if (temp.data.equals(element)) {
				return counter;
			}
			temp = temp.next;
		}
		return -1;
	}
	
	/**
	 * Retrieves, but does not remove, the head (first element) of this list.
	 * @return the head of list or null if the list is empty
	 */
	public Object peek() {
		if (head == null)
			return null;
		return head.data;
	}
	
	/**
	 * Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
	 * @return the first element of this list, or null if this list is empty
	 */
	public Object peekFirst() {
		return peek();
	}
	
	/**
	 * Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
	 * @return the last element of this list, or null if this list is empty
	 */
	public Object peekLast() {
		if (head == null) return null;
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}
	
	/**
	 * Retrieves and removes the head (first element) of this list.
	 * @return the head of this list
	 * @throws NoSuchElementException if the list is empty
	 */
	public Object remove() {
		if (head == null) throw new NoSuchElementException();
		Object value = head.data;
		head = head.next;
		return value;
	}
	
	/**
	 * Removes the element at the specified position in this list. 
	 * @param index index - the index of the element to be removed
	 * @return the element previously at the specified position
	 * @throws IndexOutOfBoundsException - if the index is out of range 
	 */
	public Object remove(int index) {
		return null;
	}
	
	/**
	 * Retrieves and removes the head (first element) of this list.
	 * @return the head of this list
	 * @throws NoSuchElementException if the list is empty
	 */
	public Object removeFirst() {
		return remove();
	}
	
	/**
	 * Removes and returns the last element from this list.
	 * @return the last element from this list
	 * @throws NoSuchElementException if the list is empty
	 */
	public Object removeLast() {
		Node temp = head;
		Object value = null;
		if (temp == null)
			throw new NoSuchElementException();
		if (head.next == null) {
			value = head.data;
			head  = null;
			return value;
		}
			
		while (temp.next != null && temp.next.next != null) {
			temp = temp.next;
		}
		value = temp.next.data;
		temp.next = null;
		return value;
	}
	
	/**
	 * Returns a deep copy of this LinkedList. (The elements themselves are cloned).
	 * @return a deep copy of this Linkedlist
	 */
	public LinkedList clone() {
		LinkedList newList = new LinkedList();
		Node temp = head;
		while (temp!=null) {
			newList.add(temp.data);
			temp = temp.next;
		}
		return newList;
	}

	public Node getHead() {
		return head;
	}
	
}
