package mypackage;

import java.util.Scanner;

public class Hwk7Q3 {
	static void selectionSort( String[] array ) { 
		for ( int i=0; i < array.length-1; i++ ) {
			int min = i;
			// Search for the minimum value
			for ( int j=i+1; j < array.length; j++ )
				if ( array[j].compareTo( array[min] ) < 0 ) 
					min = j;  
			// Variable swapping
			String temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
	}
	
	static int binarySearch(String[] arr, String x) { 
		int l = 0, r = arr.length - 1; 
		while (l <= r) { 
			int m = l + (r - l) / 2; 
			int res = x.compareToIgnoreCase(arr[m]); 
			// Check if x is present at mid 
			if (res == 0) 
				return m;
			else if (res > 0) 
				l = m + 1; 
			else
				r = m - 1; 
		}
		return -1; 
	}        

	public static void main(String args[]) {
		String[] arr = {
			"NM","NY","NC","ND","OH","OK","OR","PA","RI","SC",
			"HI","ID","IL","IN","IA","KS","KY","LA","ME","MD",
			"MA","MI","MN","MS","MO","MT","NE","NV","NH","NJ",
			"AL","AK","AZ","AR","CA","CO","CT","DE","FL","GA",
			"SD","TN","TX","UT","VT","VA","WA","WV","WI","WY"
		};
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the State you want to search : ");
		String input = keyboard.nextLine();
						
		// Note this is a in-place sort. The original array is sorted.
		selectionSort(arr);
		// This is for debugging purpose so that we know the array is sorted properly
		for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]); 
		}

		int loc = binarySearch(arr,input);
		if (loc == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at " + loc);
	}
}
