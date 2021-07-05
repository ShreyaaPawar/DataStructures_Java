package io.collections.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		/**
		 * Set is an Interface and TreeSet is a class implementing it.
		 * It uses a tree based data structures to store the elements. Elements are returned based on natural ordering.
		 * for eg., if it's string the output will be in alphabetical order.
		 * It depends to compareTo() class for ordering and detecting the duplicate elements.
		**/
		
		Set<String> courses = new TreeSet<>();
		
		//adding the elements
		courses.add("Java");
		courses.add("Python");
		courses.add("C++");
		courses.add("C");
		courses.add("Python");
		courses.add("C");
		
		System.out.println("Displaying the unique elements in sorted order: ");
		System.out.println(courses+ "\n");
		
		//checking whether java is present in set or not
		System.out.println(courses.contains("Java")?"Yes":"No");
		
		//removing C from the set
		courses.remove("C");
		
		//displaying all the elements using Iterator
		Iterator<String> item = courses.iterator();
		
		System.out.println("\nElements are: ");
		while(item.hasNext()) {
			System.out.println(item.next());
		}
		
		courses.clear();
		
		System.out.println("\nIs set empty?");
		System.out.println(courses.isEmpty()?"Yes":"No");
	}

}
