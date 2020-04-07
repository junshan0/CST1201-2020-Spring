package mypackage;

import java.util.Scanner;

public class Hwk7Q1 {
	/**
	 * Fibonacci Number
	 * @param n The numbers of Fibonacci numbers we want to see
	 * @return An int array which has first n Fibonacci numbers
	 */
	public static int[] fib(int n) {
		int[] arr = new int[n];
		
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<n;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		
		return arr;
	}
	
	public static void main(String args[]) {
		// Please note how we split the code into three secions: input, logic, and output

		// Get user input
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Please enter the number of Fib numbers you want to see: ");
		int n = keyboard.nextInt();

		// The function returns an array object with Fib numbers inside
		int[] arr = fib(n);

		// Print out result
		for (int i=0; i<n; i++) {
			System.out.println( arr[i] ); 
		}
	}
}
