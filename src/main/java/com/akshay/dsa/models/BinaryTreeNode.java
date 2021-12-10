package com.akshay.dsa.models;

public class BinaryTreeNode {
	
	private Integer data;
	private BinaryTreeNode left, right;
		
	public BinaryTreeNode() {}

	public BinaryTreeNode(Integer data) {
		this.data = data;
	}
	
	public Integer getData() {
		return data;
	}
	
	public void setData(Integer data) {
		this.data = data;
	}
	
	public BinaryTreeNode getLeft() {
		return left;
	}
	
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}
	
	public BinaryTreeNode getRight() {
		return right;
	}
	
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}

	public int compareTo(Integer o) {
		return this.data.compareTo(o);
	}

}
