/*
 * pharus wrote this @ Thu  5 May 21:35:51 BST 2016
 *
 * Example from page 35
 * */
import java.util.Scanner;

public class Echo {
	public static void main(String[] args) {
		String line;
		Scanner in = new Scanner(System.in);

		System.out.print("Type something: ");
		line = in.nextLine();
		System.out.println("You said: " + line);

		System.out.print("Type something else: ");
		line = in.nextLine();
		System.out.println("You also said: " + line);
	}
}
