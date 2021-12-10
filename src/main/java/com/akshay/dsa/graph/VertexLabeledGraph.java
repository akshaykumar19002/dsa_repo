package com.akshay.dsa.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import com.akshay.dsa.models.LabeledNode;
import com.akshay.dsa.models.Node;

public class VertexLabeledGraph {

	List<LabeledNode> vertices;
	boolean isDirected = false;
	
	public VertexLabeledGraph(boolean isDirected) {
		vertices = new ArrayList<>();
		this.isDirected = isDirected;
	}
	
	public boolean addVertex(String label) {
		if (!isVertexExists(label)) {
			vertices.add(new LabeledNode(label));
			return true;
		}
		return false;
	}
	
	public void addEdge(String vertex1, String vertex2) {
		if (!isVertexExists(vertex1) || !isVertexExists(vertex2)) {
			throw new NoSuchElementException("Node does not exist");
		}
		LabeledNode node1 = getNode(vertex1);
		LabeledNode node2 = getNode(vertex2);
		if (isDirected)
			node2.getNeighbours().add(node1);
		node1.getNeighbours().add(node2);
	}
	
	private LabeledNode getNode(String label) {
		for (LabeledNode node: vertices)
			if (node.getLabel().equalsIgnoreCase(label))
				return node;
		return null;
	}
	
	public boolean isVertexExists(String label) {
		for (LabeledNode node : vertices)
			if (node.getLabel().equalsIgnoreCase(label))
				return true;
		return false;
	}

	public List<LabeledNode> getVertices() {
		return vertices;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (LabeledNode node : vertices) {
			builder.append("\n" + node.getLabel() + ": ");
			Node temp = node.getNeighbours().getHead();
			while (temp != null) {
				LabeledNode n = (LabeledNode) temp.data;
				builder.append(n.getLabel() + " --> ");
				temp = temp.next;
			}
		}
		return builder.toString();
	}

}