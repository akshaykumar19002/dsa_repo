package com.akshay.dsa.basic;

/**
 * 
 * @author Akshay Kumar
 *
 */
public class DynamicArray {

	private Object [] data;
	private int capacity;
	private int size = -1;
	
	/**
	 * Initializes an array with the fixed capacity
	 * @param capacity - the initial capacity of the array
	 */
	public DynamicArray(int capacity) {
		this.capacity = capacity;
		this.data = new Object[capacity];
	}
	
	/**
	 * Returns the element at the specified position in this list.
	 * @param index - index of the element to return
	 * @return the element at the specified position in this list
	 * @throws IndexOutOfBoundsException if the index is greater than the size of the array
	 */
	public Object get(int index) {
		if (index > size || index < 0)
			throw new IndexOutOfBoundsException();
		return this.data[index];
	}
	
	/**
	 * Replaces the element at the specified position in this list with the specified element.
	 * @param index - index of the element to replace
	 * @param element - element to be stored at the specified position
	 */
	public Object set(int index, Object element) {
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		Object value = this.data[index];
		this.data[index] = element;
		return value;
	}
	
	/**
	 * Adds an element at the end of the array
	 * @param element - element to be added to the array
	 */
	public void insert(Object element) {
		size ++;
		if (size == capacity) {
			resize();
		}
		data[size] = element;
	}

	/**
	 * Doubles the capacity of the array
	 */
	private void resize() {
		this.capacity *= 2;
		Object[] newData = new Object [this.capacity];
		for (int i = 0; i < size; i++) {
			newData[i] = this.data[i];
		}
		this.data = newData;
	}
		
	/**
	 * Removes and returns the last element in the array
	 * @return the last element in the array and return -1 if the array is empty
	 */
	public Object remove() {
		if (!isEmpty()) {
			this.size --;
			return this.data[size+1];
		}
		return -1;
	}
	
	/**
	 * Removes and returns the element at the specified index in the array
	 * @param index - the index to which the element to be removed
	 * @return - the element at the specified index
	 * @throws IndexOutOfBoundsException if the index is not present in the array
	 */
	public Object remove(int index) {
		if (index > size || index < 0){
			throw new IndexOutOfBoundsException();
		}
		Object value = null;
		if (index == size) {
			size --;
			return this.data[size + 1];
		}
		value = this.data[index];
		for (int i=index; i<size; i++) {
			this.data[i] = this.data[i+1];
		}
		size --;
		return value;
	}
	
	/**
	 * Displays the whole array
	 */
	public void viewArray() {
		for (int i=0; i<=size; i++) {
			System.out.println("Index " + i + ": " + this.data[i]);
		}
	}
	
	/**
	 * Returns the number of elements in this list.
	 * @return the number of elements in the list
	 */
	public int size() {
		return this.size;
	}
	
	
	/**
	 * Returns true if this list contains no elements
	 * @return true if the list contains no elements
	 */
	public boolean isEmpty() {
		if (size == -1) {
			return true;
		}
		return false;
	}
	
	/**
	 * Returns true if this list contains the specified element
	 * @param element - element whose presence in this list is to be tested
	 * @return true if the list contains the specified element
	 */
	public boolean contains(Object element) {
		for (int i=0; i<=size; i++) {
			if (element == data[i])
				return true;
		}
		return false;
	}
}
