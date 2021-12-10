package com.akshay.dsa.tree;

public class Trie {
	
	TrieNode root;
	
	public Trie() {
		root = new TrieNode();
	}
	
	public void insert(String word) {
		TrieNode temp = root;
		for (char ch: word.toCharArray()) {
			if (!temp.containsKey(ch)) {
				temp.put(ch);
			}
			temp = temp.get(ch);
		}
		temp.setEnd();
	}
	
	public boolean search(String word) {
		TrieNode temp = searchPrefix(word);
		return temp != null && temp.isEndWord();
	}
	
	private TrieNode searchPrefix(String word) {
		TrieNode temp = root;
		for (char ch: word.toCharArray()) {
			if (temp.containsKey(ch))
				temp = temp.get(ch);
			else
				return null;
		}
		return temp;
	}
	
	public boolean startsWith(String word) {
		return searchPrefix(word) != null;
	}

	
	public class TrieNode{
		
		TrieNode [] childs;
		boolean isEnd = false;
		
		public TrieNode() {
			this.childs = new TrieNode[26];
		}
		
		public boolean containsKey(char ch) {
			int index = ch - 'a';
			return childs[index] != null;
		}
		
		public TrieNode get(char ch) {
			int index = ch - 'a';
			return childs[index];
		}
		
		public void put(char ch) {
			int index = ch - 'a';
			childs[index] = new TrieNode();
		}
		
		public void setEnd() {
			this.isEnd = true;
		}
		
		public boolean isEndWord() {
			return this.isEnd;
		}
		
	}
}
