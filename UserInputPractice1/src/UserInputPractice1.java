import java.util.Scanner;

public class UserInputPractice1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		String favoriteColor;
		
		
		System.out.println("What is your name?");
		name = in.nextLine();
		
		System.out.println("What is your favorite color?");
		favoriteColor = in.nextLine();
		
		System.out.println("Hi " + name + ", " + favoriteColor + " is a great color!");
		

	}

}