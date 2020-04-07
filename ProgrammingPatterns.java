package mypackage;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math; 

public class ProgrammingPatterns {

	/**
	 * This is a demonstration of programming patterns
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	/**
	 * Receiving a user input, valid it is valid, loop until a valid input is received
	 * @param 
	 * @param 
	 * @return 
	 */
	public static int receivingValidUserInput() {
		// Initialize keyboard
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt the user for input
		System.out.print("What is your name? ");
		
		// Initialize the variable -- This is optional depending on your need
		int value = -1;
		do {
			// Get user input
			value = keyboard.nextInt();			
		} while (value < 1 || value > 100); // The validation criteria 
		
		return value;
	}
	
	/**
	 * Pattern for swapping variables
	 * @param 
	 * @param 
	 * @return 
	 */
	public static void swapVariable() {
		String cat="Jerry", mouse="Tom";
		
		String t=cat; // Now t="Jerry"
		cat=mouse;    // Now cat="Tom"
		mouse=t;      // Now mouse="Jerry"
	}
	
	/**
	 * Find spaces in a string
	 * This method can easily be modified to find any characters (or group of characters) in string.
	 * It can also be modified to find substring within a string, 
	 *   but make sure use equals() method instead of == 
	 * @param 
	 * @param 
	 * @return 
	 */
	public static int findSpaceInString() {
		String sentence = "May the force be with you!";
		int count = 0;
		
		for (int i=0; i<sentence.length(); i++) {
		    if (sentence.charAt(i)==' ')
		        count++;
		}
		
		return count;
	}

	/**
	 * Test if a string is palindrome
	 * @param 
	 * @param 
	 * @return 
	 */
	public static boolean isPalindrome() {
		String palindrome = "racecar";
		
		// Always remember to initialize variables before entering loops
		boolean isPalindrome = true;
		for(int i=0; i<palindrome.length(); ++i) {
			// A common issue with looping through string or array is the last element/char
			// Always do boundary check (i=0 and i=length-1)
		    if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - 1 - i))
		    	isPalindrome = false; // In fact you can return false right here
		}
		
		return isPalindrome;
	}

	/**
	 * Method 1 of getting user input array
	 * @param 
	 * @param 
	 * @return 
	 */
	public static void getUserInputArrayMethod1() {
		int arraySize;
		String[] names;
		
		// Initialize keyboard
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt the user for input
		System.out.print("What is the size of the array? ");
		
		// Get user input of array size
		do {
			arraySize = keyboard.nextInt();			
		} while (arraySize>1); // The validation criteria 
		// Then create the array based on the size
		names = new String[arraySize];
		
		// Use a for loop to get all elements of names
		for(int i=0; i<arraySize;i++) {
			continue; // Use a do...while loop to get valid names names[i]
		}
	}

	/**
	 * Method 2 of getting user input array
	 * @param 
	 * @param 
	 * @return 
	 */
	public static void getUserInputArrayMethod2() {
		// Define a MAX_ARRAY_SIZE that is practically the upper limit of possible array size
		final int MAX_ARRAY_SIZE = 10000;
		// Define the array with MAX_ARRAY_SIZE. 
		// Rightadays memory is not expensive so we can afford to waste some memory space 
		int[] myArray = new int[MAX_ARRAY_SIZE];
		// And use a variable to store the real size of array
		int arraySize = 0;
		
		// Initialize keyboard
		Scanner keyboard = new Scanner(System.in);
		// Get user input
		int userInput = -1;
		do {
			System.out.print("Please input positive numbers (-1 to exit): ");
			userInput = keyboard.nextInt();			
			if (userInput != -1) {
				// If meeting the validation criteria, keep on adding values 
				myArray[arraySize-1] = userInput;
				arraySize ++;
			} else {
				// Else stop taking more values by using break to exist loop
				break;
			}
		} while (true); 
	}

	/**
	 * Get last element of an array
	 * @param 
	 * @param 
	 * @return 
	 */
	public static int getLastElementOfArray() {
		int[] arr = {2, 3, 5, 8};
		return arr[arr.length - 1];
	}

	/**
	 * Get previous element of an array element
	 * @param 
	 * @param 
	 * @return 
	 */
	public static int getPreviousElementOfArrayElement(int elementIndex) {
		int[] arr = {2, 3, 5, 8};
		return arr[elementIndex - 1];
	}

	/**
	 * Sequential search of an array
	 * @param 
	 * @param 
	 * @return 
	 */
	public static int searchSequentially() {
		String[] names = {"Tom", "Jerry", "Mickey", "Minnie", "Mickey"};
		
		/*
		 * Method 1: straightforward loop
		 */
		/*
		int count=0;
		do {
			if (names[count].equals("Mickey")) {
				return count;
			}
			count++;
		} while (count<names.length); // The validation criteria 
		return -1;
		*/
		
		/*
		 * Method 2: Loop with a position indicator instead of straightforward count
		 * By adding a position variable, we have more flexibility on what can be returned
		 */
		/*
		int position=-1;
		int count=0;
		do {
			if (names[count].equals("Mickey")) {
				position=count;
				break; 
				// If we have a break here, we are getting the first occurrence.
				// If we don't have break here, we will get the last occurrence.
				// We can also add a counter here to get the 2nd, 3rd, ... occurrence.
			}
			count++;
		} while (count<names.length); // The validation criteria 
		return position;
		*/
		
		/*
		 * Use combination of conditions
		 * This example is used to show you how conditions can be combined
		 * In general you should avoid complex logics, not only in this course but also in your future job
		 */
		/*
		int count=0;
		do {
			count++;
		} while ((!names[count].equals("Mickey")) && count<names.length); // The validation criteria 
		return (count<names.length)?count:-1;
		*/

		/*
		 * Use a reversed loop to get the last occurrence
		*/
		int count=names.length-1; // Starting from the last element
		do {
			if (names[count].equals("Mickey")) {
				return count;
			}
			count--;        // count--, moving forward
		} while (count>=0); // The validation criteria 
		return -1;
	}

	/**
	 * Running total of an array
	 * @param 
	 * @param 
	 * @return 
	 */
	public static int getArrayRunningTotal() {
		int[] arr = {2, 3, 4, 5, 7};
		// Another common mistake in array handling is initializing 
		// Always remember to initialize independent variables, such as running total
		// Java will automatically initialize numerical variables to 0 
		//   but it is a good habit to initialize explicitly 
		int runningTotal = 0;
		for (int i=0; i<arr.length; i++) {
			runningTotal += arr[i];
		}
		return runningTotal;
	}

	/**
	 * Nested loop of an array
	 * Note that this is NOT the mathematical definition of correlation. 
	 * It is just an example of intra-array calculation.
	 * @param 
	 * @param 
	 * @return 
	 */
	public static int matchElementToAllOtherElements() {
		int[] arr = {2, 3, 4, 5, 7};
		int corr = 0;
		// In order to calculate between each element in an array 
		//   and all other elements in the same array,
		//   we use a 2 level nested loop.
		// Outer level is for each element 
		for (int i=0; i<arr.length; i++) {
			// Then inner level is for all elements in the array
			// If you don't want to match the same element to outer loop, 
			//   use && i!=j to skip
			for (int j=0; j<arr.length && i!=j; j++) {
				corr = arr[i] - arr[j];
			}
		}
		return corr;
	}

	/**
	 * Divide an array into subarrays
	 * Each subarray is an array by itself, within a range of the original array.
	 * Same operation that we applied to the original array can be applied to the subarray
	 * For example, binary search
	 * @param 
	 * @param 
	 * @return 
	 */
	public static void divideAndConquerOfArray() {
		// Please refer to the binary search code in textbook
	}

	/**
	 * Merge 2 sorted arrays
	 * This code does not take boundary check into consideration, 
	 *   please make it work by adding boundary check
	 * @param 
	 * @param 
	 * @return 
	 */
	public static void mergeTwoArrays() {
		int[] arr1 = {1, 2, 4, 8};
		int[] arr2 = {3, 5, 8};
		int pointer = 0; // arr2's pointer
		
		for (int i=0; i<arr1.length; i++) {
			if (arr1[i]<=arr2[pointer]) { 
				// If current arr1 element is smaller, print and move to next arr1 element 
				System.out.println(arr1[i]);
			} else {
				// If current arr2 element is smaller, 
				//   print out all arr2 elements that is smaller than current arr1 element
				while (arr2[pointer] < arr1[i+1]) {
					System.out.println(arr2[pointer]);
					pointer ++; // should add boundary check
				}
			}
		}
	}

}


