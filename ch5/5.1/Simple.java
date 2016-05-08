/*
 * pharus solved this @ Fri  6 May 21:08:01 BST 2016
 *
 * Exercise 5.1
 * */
import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x;

		System.out.print("Type an integer: ");
		x = in.nextInt();

		if (x > 0 && x < 10)
			System.out.println("positive single digit number.");
	}
}
