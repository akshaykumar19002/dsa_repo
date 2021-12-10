package com.akshay.dsa.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Undirected Graph implementation using adjacency list
 * @author Akshay Kumar
 *
 */
public class Graph {
	
	private List<LinkedList<Integer>> adjacencyList;
	private Integer capacity;
	private boolean directed;

	/**
	 * Initializes the adjacency list based to the specified number of nodes
	 * @param noOfNodes - no of vertices in the graph
	 */
	public Graph(Integer noOfNodes, boolean directed) {
		this.adjacencyList = new ArrayList<LinkedList<Integer>>();
		this.capacity = noOfNodes;
		this.directed = directed;
		for (int i=0; i<capacity; i++)
			adjacencyList.add(new LinkedList<Integer>());
	}

	public List<LinkedList<Integer>> getAdjacencyList() {
		return adjacencyList;
	}

	public void setAdjacencyList(List<LinkedList<Integer>> adjacencyList) {
		this.adjacencyList = adjacencyList;
	}
	
	/**
	 * Adds an edge to the graph
	 * @param a1 - vertex 1
	 * @param a2 - vertex 2
	 */
	public void addEdge(Integer a1, Integer a2) {
		adjacencyList.get(a1).add(a2);
		if (!directed)
			adjacencyList.get(a2).add(a1);
	}
	
	/**
	 * Removes an edge from the graph
	 * @param a1 - vertex 1
	 * @param a2 - vertex 2
	 */
	public void removeEdge(Integer a1, Integer a2) {
		adjacencyList.get(a1).remove(a2);
		if (!directed)
			adjacencyList.get(a2).remove(a1);
	}
	
	/**
	 * Prints all the edges in the graph
	 */
	public void printAllTheEdges() {
		LinkedList<Integer> temp;
		for (int i =0; i<capacity; i++) {
			temp = adjacencyList.get(i);
			System.out.print(i + " --> ");
			for (Integer t: temp) {
				System.out.print(t + "--> ");
			}
			System.out.println();
		}
	}
	
}
