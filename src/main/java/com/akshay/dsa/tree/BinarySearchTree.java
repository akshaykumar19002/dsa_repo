package com.akshay.dsa.tree;

import com.akshay.dsa.models.BinaryTreeNode;

/**
 * Binary Search Tree implementation only for String and Integer type
 * @author Akshay Kumar
 *
 */
public class BinarySearchTree{

	private BinaryTreeNode root;

	/**
	 * Empty Constructor
	 */
	public BinarySearchTree() {
		this.root = null;
	}
	
	/**
	 * Adds the data to the binary search tree
	 * @param data - element to be added to the binary search tree
	 */
	public void add(Integer data) {
		BinaryTreeNode newNode = new BinaryTreeNode(data);
		if (root == null) {
			this.root = newNode;
			return;
		}
		BinaryTreeNode temp = this.root;
		while (temp != null) {
			if (temp.getData() == data) {
				return;
			}
			if (temp.getData() > data) {
				if (temp.getLeft() == null) {
					temp.setLeft(newNode);
					return;
				}
				temp = temp.getLeft();
			} else {
				if (temp.getRight() == null) {
					temp.setRight(newNode);
					return;
				}
				temp = temp.getRight();
			}
		}
		return;
	}
	
	/**
	 * Finds the specified data in the bst
	 * @param data - element to be searched in the bst
	 * @return true if the element is present in the bst
	 */
	public boolean search(Integer data) {
		BinaryTreeNode temp = root;
		while (temp != null) {
			if (temp.getData() == data) {
				return true;
			}
			if (temp.getData() > data)
				temp = temp.getLeft();
			else
				temp = temp.getRight();
		}
		return false;
	}
	
	/**
	 * Deletes the specified element from the bst
	 * @param data - element to be deleted from the bst
	 * @return data to be deleted from the bst, null if the element is not present in the bst
	 */
	public void delete(Integer data) {
		delete(root, data).getData();
	}
	
	private BinaryTreeNode delete(BinaryTreeNode temp, Integer data) {
		if (temp == null)
			return null;
		if (temp.getData() == data) {
			if (temp.getLeft() == null && temp.getRight() == null)return null;
			if (temp.getLeft() == null)	return temp.getRight();
			if (temp.getRight() == null) return root.getLeft();
			BinaryTreeNode left = root.getLeft();
			BinaryTreeNode right = root.getRight();
			BinaryTreeNode p = right;
			while (p.getLeft() != null)
				p = p.getLeft();
			return right;
		}
		if (data > temp.getData()) temp.setRight(delete(temp.getRight(), data));
		else 
			temp.setRight(delete(temp.getLeft(), data));
		return temp;
	}
	
	public void traversal() {
		preorderTraversal(this.root);
	}
	
	private void preorderTraversal(BinaryTreeNode node) {
		if (node == null)
			return;
		System.out.println(node.getData());
		preorderTraversal(node.getLeft());
		preorderTraversal(node.getRight());
		return;
	}
	
}
