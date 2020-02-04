import java.util.*;


public class Ch02Q12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String cityName;
		
		//User's favorite city
		System.out.print("Which is your favourite city? ");
		cityName = scanner.nextLine();
		
		System.out.println("The number of characters in " + cityName + " is " + cityName.length());
		System.out.println(cityName + " in upper case is " + cityName.toUpperCase());
		System.out.println(cityName + " in lower case is " + cityName.toLowerCase());
		System.out.println("The first character in " + cityName + " is " + cityName.charAt(0));
		
	}

}
