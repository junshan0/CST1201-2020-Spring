import java.util.*;

public class Ch02Q17 {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		double sugar = 1.5;
		double butter = 1.;
		double flour = 2.75;
		double recipeNumOfCookies= 48;
		int userNumOfCookies;
		
		double sugarExpected;
		double butterExpected;
		double flourExpected;
		
		System.out.print("How many cookies do you like? ");
		userNumOfCookies = scanner.nextInt();
		
		sugarExpected = (userNumOfCookies / recipeNumOfCookies) * sugar;
		butterExpected = (userNumOfCookies / recipeNumOfCookies) * butter;
		flourExpected = (userNumOfCookies / recipeNumOfCookies) * flour;
		
		System.out.println(
				"For " + userNumOfCookies + " cookies, you need " 
						+ sugarExpected + " cups of sugar, "
						+ butterExpected + " cups of butter, and " 
						+ flourExpected + " cups of flour.");

	}

}
