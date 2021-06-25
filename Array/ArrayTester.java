package io.datastructures.array;

class Array{
	//insertion operation
	public static void insert(char[] ar, int pos, char val) {
		for(int i=ar.length-1; i>=pos; i--) {
			ar[i] = ar[i-1];
		}
		ar[pos] = val;
	}
	
	//deletion operation
	public static void delete(char[] ar, int pos) {
		for(int i=pos; i<ar.length-1; i++) {
			ar[i] = ar[i+1];
		}
		ar[ar.length-1] = '0';
	}
}

public class ArrayTester {

	public static void main(String[] args) {
		char[] arr = new char[5];
		
		arr[0] = 'A';
		arr[1] = 'B';
		arr[2] = 'C';
		arr[3] = 'D';
		arr[4] = 'E';
		
		
		Array.insert(arr, 2, 'J');
		
		System.out.println("After inserting:");
		for(char ele: arr) {
			System.out.print(ele);
		}
		
		Array.delete(arr, 2);
		
		System.out.println("After deletion at index 2:");
		for(char ele: arr) {
			System.out.print(ele+" ");
		}
		

	}

}
