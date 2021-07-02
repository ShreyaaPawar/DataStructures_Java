package io.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		// List is an interface and ArrayList is a class implementing the List interface
		List<String> food = new ArrayList<>();

		// adding the elements
		food.add("Pizza");
		food.add("Noodles");
		food.add("Burger");
		food.add("Sandwich");

		// modifying an element at a specific index position
		food.set(3, "Pasta");

		// removing an element at a specific index position
		food.remove("Noodles");

		// checking whether the element is present or not
		System.out.println("Checking whether pizza is present in the food list or not: ");
		System.out.println(food.contains("Pizza") + "\n");

		// displaying an elements in a list format
		System.out.println(food);
		System.out.println();

		// checking whether the list is empty or not
		if (food.isEmpty())
			System.out.println("The food list is empty");
		else
			System.out.println("The food list is not empty");

		System.out.println("\n" + "The size of an array list is: " + food.size());

		// creating new food list
		List<String> newFood = new ArrayList<>();
		newFood.add("Manchurian");
		newFood.add("Kimchi");
		newFood.add("Sushi");

		// merging newFood list in food list
		food.addAll(newFood);

		// displaying all the elements using for-each loop
		System.out.println("\nDisplaying all the elements: ");
		for (String foods : food) {
			System.out.println(foods);
		}

		// converting list to an array
		Object[] array = food.toArray();

		// checking whether the newFood list is empty or not
		newFood.clear();
		if (newFood.isEmpty())
			System.out.println("\nIt's empty!!");

	}

}