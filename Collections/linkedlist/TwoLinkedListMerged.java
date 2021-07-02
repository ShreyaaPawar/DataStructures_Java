package io.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class TwoLinkedListMerged {
	
	//method to merge the reverse ordered elements of second list into first
	public static List<Object> merge(List<Object> one, List<Object> two){
		
		Iterator<Object> x = ((LinkedList<Object>) two).descendingIterator();
		
		while(x.hasNext()) {
			one.add(x.next());
		}
		
		return one;
	}

	public static void main(String[] args) {
		
		//using Object in generic type, we can store heterogeneous values
		List<Object> listOne = new LinkedList<Object>();
		
		listOne.add("Delhi");
		listOne.add(123);
		listOne.add(false);
		listOne.add(10.3);
		
		List<Object> listTwo = new LinkedList<Object>();
		
		listTwo.add("Korea");
		listTwo.add(285);
		listTwo.add(true);
		listTwo.add(20.5);
		
		List<Object> result = merge(listOne, listTwo);
		
		System.out.println("Displaying all the elements: ");
		for(Object res: result) {
			System.out.print(res+"->");
		}

	}

}
