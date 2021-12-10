package com.akshay.dsa.exceptions;

/**
 * Exception to be thrown when the element is not present in the hash table 
 *
 */
public class ElementNotPresentException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ElementNotPresentException() {
		super("Entered key is not present in the Hash Table");
	}
}