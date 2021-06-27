package io.stack;

public class Stack {

	private int top; //represents the index position of top most element in the stack
	private int maxSize; //represents the maximum number of elements that can be stored in a stack
	private int[] arr;
	
	public Stack(int maxSize) {
		this.top = -1; //top is -1 whenever the stack is created
		this.maxSize = maxSize;
		arr = new int[maxSize];
	}
	
	//checking whether the stack is full or not
	public boolean isFull() {
		if(top >= maxSize-1)
			return true;
		else
			return false;
	}
	
	//adding an element on the top of stack
	public boolean push(int data) {
		if(isFull()) 
			return false;
		else {
			arr[++top] = data;
			return true;
		}
	}
	
	//returning the top most element of the stack
	public int peek() {
		if(top < 0)
			return Integer.MIN_VALUE; //Integer.MIN_VALUE gives a minimum possible integer value to indicate that stack is empty
		else
			return arr[top];
	}
	
	//displaying all the elements of the stack from top to bottom 
	public void display() {
		System.out.println("\nDisplaying all the elements from the stack: ");
		
		for(int index = top; index >= 0; index--) {
			System.out.print(arr[index] + " ");
		}
	}
	
	//checking whether stack is empty or not
	public boolean isEmpty() {
		if(top < 0)
			return true;
		else
			return false;
	}
	
	//removing the top most element from the stack
	public int pop() {
		if(isEmpty())
			return Integer.MIN_VALUE;
		else
			return arr[top--];
	}
}
