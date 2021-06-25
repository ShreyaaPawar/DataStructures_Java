package io.linkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		
		//create an object of linked list class
		LinkedList list = new LinkedList();
		
//		System.out.println("adding elements at the end: ");
		list.addAtEnd("Milan");
		list.addAtEnd("Venice");
		list.addAtEnd("Paris");
		
//		System.out.println("adding elements at the beginning: ");
		list.addAtBeginning("US");
		list.addAtBeginning("Munich");
		
		System.out.println("Displaying the elements: ");
		list.display();
		
		System.out.println("\nChecking whether Munich is there or not in list: ");
		if(list.find("Munich") !=  null)
			System.out.println("Node found");
		else
			System.out.println("Node not found");
		
		System.out.println("\nAdding Pargue After US: ");
		list.insert("Pargue", "US");
		list.display();
		
		System.out.println("\nDeleting US from the list: ");
		list.delete("US");
		list.display();

	}

}
