package io.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		
		//List is an interface and Linked list is a class implementing this interface
		List<String> cities = new LinkedList<>();
		
		//adding elements
		cities.add("Prague");
		cities.add("Vienna");
		cities.add("Villan");
		
		//displaying the list
		System.out.println(cities);
		
		//checking the size of a list
		System.out.println("\nThe size of the list is: "+ cities.size());
		
		//replacing the Prague with Munich
		cities.set(0, "Munich");
		
		//checking whether Prague is there in list or not
		System.out.println("\n"+ cities.contains("Munich"));
		
		//getting the element at specific position
		System.out.println("\n"+ cities.get(2));
		
		//Using Iterator to traverse the elements in the list in either direction
		ListIterator<String> names = cities.listIterator();
		
		System.out.println("\nDisplaying the elements in forward direction: ");
		while(names.hasNext()) {
			System.out.println(names.next());
		}
		
		System.out.println("\nDisplaying the elements in reverse direction: ");
		while(names.hasPrevious()) {
			System.out.println(names.previous());
		}
		
		//clearing all the elements from the list
		cities.clear();
		System.out.println("\nIs the list empty? "+ cities.isEmpty());

	}

}
