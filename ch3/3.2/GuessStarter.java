/*
 * pharus solved this @ Thu  5 May 23:03:41 BST 2016
 *
 * Guess my number game
 * */
import java.util.Random;
import java.util.Scanner;

public class GuessStarter {

	public static void main(String[] args) {
		// pick a random number
		Random random = new Random();
		int guess, number = random.nextInt(100) + 1;

		Scanner in = new Scanner(System.in);

		System.out.println("I'm thinking of a number between 1 and 100");
		System.out.println("Can you guess it?([1-100])");
		System.out.print("Type a number: ");
		guess = in.nextInt();	
		System.out.println("Your guess is: " + guess);
		System.out.println("The number I was thinking of is: " + number);
		System.out.println("You were off by: " + (number - guess));

	}
}

