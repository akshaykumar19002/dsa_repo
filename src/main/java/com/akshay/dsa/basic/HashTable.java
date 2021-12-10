package com.akshay.dsa.basic;

import com.akshay.dsa.exceptions.ElementNotPresentException;

/**
 * Implementation of hash table
 * @author Akshay Kumar
 *
 */
public class HashTable {

	private int INITIAL_SIZE = 16;
	private HashEntry[] data;
	
	class HashEntry {
		String key;
        String value;
        HashEntry next;

        HashEntry(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
	}
	
	public HashTable() {
		data = new HashEntry[INITIAL_SIZE];
	}
	
	public void put(String key, String value) {
		int index = getIndex(key);
		HashEntry entry = new HashEntry(key, value);
		if (data[index] == null) {
			this.data[index] = entry;
		} else {
			HashEntry temp = data[index];
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = entry;
		}
	}
	
	public String get(String key) throws ElementNotPresentException {
		int index = getIndex(key);
		HashEntry temp = data[index];
		if (temp == null) {
			throw new ElementNotPresentException();
		}
		while (temp != null && temp.next != null) {
			if (temp.key == key)
				break;
			temp = temp.next;
		}
		if (temp == null) {
			throw new ElementNotPresentException();
		}
		return temp.value;
	}
	
	private int getIndex(String key) {
		return (key.hashCode() & 0x7fffffff) % INITIAL_SIZE;
	}
	
	
	
}
