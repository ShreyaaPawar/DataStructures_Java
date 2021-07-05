package io.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		//Set is an Interface and HashSet is a class implementing it.
		
		/**
		 * HashSet uses hash tables for storing the elements and it's returned out of order 
		 * It depends on equals() and hashCode() method for detecting duplicate elements
		 * null vales are allowed
		**/
		
		Set<String> food = new HashSet<>();
		
		//adding the elements
		food.add("Pasta");
		food.add("Noodles");
		food.add("Sandwich");
		food.add("Noodles");
		food.add("Burger");
		food.add("Pasta");
		
		//displaying the elements in out of order
		System.out.println("Displaying all the unique items in unordered way: ");
		System.out.println(food);
		
		//removing specific element from the set
		food.remove("Sandwich");
		
		System.out.println("\nElements after removing Sandwich: ");
		System.out.println(food);
		
		System.out.println("\nChecking whether Pasta is present in set or not? "+ food.contains("Pasta"));
		
		//displaying the elements using iterator
		Iterator<String> item = food.iterator();
		
		System.out.println("\nElements are: ");
		while(item.hasNext()) {
			System.out.println(item.next());
		}

	}

}
