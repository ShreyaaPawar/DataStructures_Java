package io.queue;

public class Queue_Tester {

	public static void main(String[] args) {
		
		Queue queue = new Queue(5);
		
		if(queue.enqueue("Joe"))
			System.out.println("The element is enqueued to the queue\n");
		else
			System.out.println("Queue is full!!");
		if(queue.enqueue("Emma"))
			System.out.println("The element is enqueued to the queue\n");
		else
			System.out.println("Queue is full!!");
		if(queue.enqueue("Jack"))
			System.out.println("The element is enqueued to the queue\n");
		else
			System.out.println("Queue is full!!");
		if(queue.enqueue("Mia"))
			System.out.println("The element is enqueued to the queue\n");
		else
			System.out.println("Queue is full!!");
		if(queue.enqueue("Luke"))
			System.out.println("The element is enqueued to the queue\n");
		else
			System.out.println("Queue is full!!");
		if(queue.enqueue("Eva"))
			System.out.println("The element is enqueued to the queue\n");
		else
			System.out.println("Queue is full!!");
		
		queue.display();
		
		System.out.println("\n");
		
		String dequeElement = queue.dequeue();
		if(dequeElement == "empty")
			System.out.println("Queue is empty!!");
		else
			System.out.println("The dequeued element is "+ dequeElement+ "\n");
		dequeElement = queue.dequeue();
		if(dequeElement == "empty")
			System.out.println("Queue is empty!!");
		else
			System.out.println("The dequeued element is "+ dequeElement+ "\n");
		dequeElement = queue.dequeue();
		if(dequeElement == "empty")
			System.out.println("Queue is empty!!");
		else
			System.out.println("The dequeued element is "+ dequeElement+ "\n");
		dequeElement = queue.dequeue();
		if(dequeElement == "empty")
			System.out.println("Queue is empty!!");
		else
			System.out.println("The dequeued element is "+ dequeElement+ "\n");
		dequeElement = queue.dequeue();
		if(dequeElement == "empty")
			System.out.println("Queue is empty!!");
		else
			System.out.println("The dequeued element is "+ dequeElement+ "\n");
		dequeElement = queue.dequeue();
		if(dequeElement == "empty")
			System.out.println("Queue is empty!!");
		else
			System.out.println("The dequeued element is "+ dequeElement+ "\n");
		
		if(queue.enqueue("Watson"))
			System.out.println("\nThe element is enqueued to the queue");
		else
			System.out.println("Queue is full!!");
		
		if(queue.enqueue("Brad"))
			System.out.println("\nThe element is enqueued to the queue");
		else
			System.out.println("Queue is full!!");
		
		queue.display();
	}

}
