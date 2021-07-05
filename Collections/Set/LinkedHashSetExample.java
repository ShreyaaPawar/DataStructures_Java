package io.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		/**
		 * Set is an interface and LinkedHashSet is a class implementing it.
		 * LinkedHashSet uses the combination of both LinkedList and HashSet to store the elements.
		 * It depends on equals() and hashCode() to detect the duplicate elements and null values are allowed.
		 * The elements are returned in order of its insertion.
		 * **/
		
		Set<String> hobbies = new LinkedHashSet<>();
		
		//adding the elements
		hobbies.add("Playing");
		hobbies.add("Yoga");
		hobbies.add("Drawing");
		hobbies.add("Yoga");
		hobbies.add("Taking courses");
		hobbies.add("Playing");
		
		System.out.println("Displaying the unique elements in it's order of insertion: ");
		System.out.println(hobbies);
		
		//checking whether Yoga is present in set or not
		if (hobbies.contains("Yoga"))
			System.out.println("\nPresent");
		else
			System.out.println("\nAbsent");
		
		hobbies.remove("Taking courses");
		
		//displaying elements using iterator
		Iterator<String> item = hobbies.iterator();
		
		System.out.println("\nElements are:");
		while(item.hasNext()) {
			System.out.println(item.next());
		}
		
		//clearing all the elements from the set
		hobbies.clear();
		
		System.out.println("\nIs set empty? ");
		System.out.println(hobbies.isEmpty()?"Yes":"No");
	}

}
