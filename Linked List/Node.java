package io.linkedList;

public class Node {

	//Node is subdivided into two sections i.e. data and link of the next node.
	
	private String data;
	private Node next;
	
	public Node(String data) {
		this.data = data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getData() {
		return this.data;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return this.next;
	}
	
}
