package mypackage;
import java.util.Scanner;

public class Hwk7Q2 {
	
	public static void main(String args[])
	{
		String[] arr = {
			"AL","AK","AZ","AR","CA","CO","CT","DE","FL","GA",
			"HI","ID","IL","IN","IA","KS","KY","LA","ME","MD",
			"MA","MI","MN","MS","MO","MT","NE","NV","NH","NJ",
			"NM","NY","NC","ND","OH","OK","OR","PA","RI","SC",
			"SD","TN","TX","UT","VT","VA","WA","WV","WI","WY"
		};
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the State you want to search : ");
		String input = keyboard.nextLine();
		
		boolean flag = false;
		for(int i=0;i<arr.length;i++) {
			if(input.equalsIgnoreCase(arr[i])) {
				// Note that you don't need to use curly brace here.
				// However it is always a good habit to have curly braces for if statements				
				flag = true;
				// You can also add a break to break out of the loop after flag is set
				// This will save you some loop execution time
			}
		}
		
		if (flag) {
			// It is also possible to put the output inside the previous loop
			// So once there is a match, you print put the message and exit, instead of using a flag
			// In our course, we are trying to break up input/output with logic.
			// That's why I use a separate if statement for output
			System.out.println("It is a valid state abbreviation");
		} else {
			System.out.println("It is not a valid state abbreviation");			
		}
	}
}
