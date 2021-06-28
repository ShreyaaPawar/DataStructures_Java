package io.queue;

public class Queue {

	//front represents the index position of the first element in the queue
	//rear represents the index position of the last element in the queue
	//maxSize represents the maximum number of elements that can be stored in the queue
	//Since we are storing the names of people in the queue, data type of an array is String
	
	private int front, rear, maxSize;
	private String arr[];
	
	public Queue(int maxSize) {
		//top is initialized as 0 and rear is initialized as -1 when a queue is created
		this.front = 0;
		this.rear = -1;
		this.maxSize = maxSize;
		arr = new String[maxSize];
	}
	
	//check whether the queue is full or not
	public boolean isFull() {
		if(rear == maxSize-1)
			return true;
		else
			return false;
	}
	
	//adding an element to the end of the queue
	public boolean enqueue(String data) {
		if(isFull())
			return false;
		else {
			arr[++rear] = data;
			return true;
		}
	}
	
	//displaying all the elements of the queue from front to rear
	public void display() {
		System.out.println("\nDisplaying the elements of the queue: ");
//		for(int index=front; index<=rear; index++)
//			System.out.print(arr[index]+" ");
		
		for(String data: arr)
			System.out.print(data+" ");
	}
	
	//checking whether the queue is empty or not
	public boolean isEmpty() {
		if (front > rear)
			return true;
		else
			return false;
	}
	
	//removing an element from the front of the queue
	public String dequeue() {
		if (isEmpty()) {
			front = 0;
			rear = -1;
			return "empty";
		}
		else {
			String data = arr[front];
			arr[front++] = null;
			return data;
		}
	}
	
	
}
