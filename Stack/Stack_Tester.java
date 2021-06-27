package io.stack;

public class Stack_Tester {

	public static void main(String[] args) {
		Stack st = new Stack(5);

		if (st.push(1))
			System.out.println("The element is pushed to the stack");
		else
			System.out.println("Stack is full!!");

		if (st.push(2))
			System.out.println("The element is pushed to the stack");
		else
			System.out.println("Stack is full!!");

		if (st.push(3))
			System.out.println("The element is pushed to the stack");
		else
			System.out.println("Stack is full!!");

		if (st.push(4))
			System.out.println("The element is pushed to the stack");
		else
			System.out.println("Stack is full!!");

		if (st.push(5))
			System.out.println("The element is pushed to the stack");
		else
			System.out.println("Stack is full!!");

		if (st.push(6))
			System.out.println("The element is pushed to the stack");
		else
			System.out.println("Stack is full!!");

		System.out.println("\nThe top most element is: "+ st.peek());
		
		st.display();
		
		System.out.println("\n");
		int poppedElement = st.pop();
		
		if(poppedElement == Integer.MIN_VALUE)
			System.out.println("Stack is Empty");
		else
			System.out.println("The popped out element is "+ poppedElement+ "\n");
		
		poppedElement = st.pop();
		if(poppedElement == Integer.MIN_VALUE)
			System.out.println("Stack is Empty");
		else
			System.out.println("The popped out element is "+ poppedElement+ "\n");
		
		poppedElement = st.pop();
		if(poppedElement == Integer.MIN_VALUE)
			System.out.println("Stack is Empty");
		else
			System.out.println("The popped out element is "+ poppedElement+ "\n");
		
		poppedElement = st.pop();
		if(poppedElement == Integer.MIN_VALUE)
			System.out.println("Stack is Empty");
		else
			System.out.println("The popped out element is "+ poppedElement+ "\n");
		
		poppedElement = st.pop();
		if(poppedElement == Integer.MIN_VALUE)
			System.out.println("Stack is Empty");
		else
			System.out.println("The popped out element is "+ poppedElement+ "\n");
		
		poppedElement = st.pop();
		if(poppedElement == Integer.MIN_VALUE)
			System.out.println("Stack is Empty");
		else
			System.out.println("The popped out element is "+ poppedElement+ "\n");
	}

}
