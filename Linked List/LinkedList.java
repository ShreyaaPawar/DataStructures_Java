package io.linkedList;

public class LinkedList {

	//Head refers to the beginning of the linked list
	//Tail refers to the end of the linked list 
	
	private Node head;
	private Node tail;
	
	public Node getHead() {
		return this.head;
	}
	
	public Node getTail() {
		return this.tail;
	}
	
	//Method to add the element at the end
	public void addAtEnd(String data) {
		Node node = new Node(data);
		
		//check whether the list is empty or not
		if(this.head==null) {
			this.head = this.tail = node;
		}
		else {
			this.tail.setNext(node);
			this.tail = node;
		}
	}
	
	//Method to add the element at the beginning
	public void addAtBeginning(String data) {
		Node node = new Node(data);
		
		if(this.head == null) {
			this.head = this.tail = node;
		}
		else {
			node.setNext(this.head);
			this.head = node;
		}
	}
	
	//Method to display the elements of the list
	public void display() {
		Node temp = this.head;
		
		while(temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
	
	//Method for searching an element in the list
	public Node find(String data) {
		Node temp = this.head;
		
		while(temp != null) {
			if(temp.getData().equals(data))
				return temp;
			else
				temp = temp.getNext();
		}
		
		return null;
	}
	
	//Method to insert an element after another element
	public void insert(String data, String dataBefore) {
		Node node = new Node(data);
		
		if(this.head == null) {
			this.head = this.tail = node;
		}
		else {
			Node nodeBefore = this.find(dataBefore);
			
			if(nodeBefore != null) {
				node.setNext(nodeBefore.getNext());
				nodeBefore.setNext(node);
				
				if(nodeBefore == this.tail) {
					this.tail = node;
				}	
			}
			
			else {
				System.out.println("Node not found");
			}
		}
	}
	
	//Method to delete an element from the list
	public void delete(String data) {
		if(this.head == null) {
			System.out.println("List is empty");
		}
		else {
			Node node = this.find(data);
			
			if(node == null) {
				System.out.println("Node not found");
			}
			else if(this.head == node) {
				this.head = this.head.getNext();
				node.setNext(null);
				
				if(this.tail == node) {
					tail = null;
				}
			}
			else {
				Node nodeBefore = null;
				Node temp = this.head;
				
				while(temp != null) {
					if(temp.getNext() == node) {
						nodeBefore = temp;
						break;
					}
					temp = temp.getNext();
				}
				
				nodeBefore.setNext(node.getNext());
				
				if(this.tail == node) 
					this.tail = nodeBefore;
				node.setNext(null);
			}
			
		}
	}
	
	
}
