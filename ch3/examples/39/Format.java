/*
 * pharus wrote this @ Thu  5 May 22:10:48 BST 2016
 *
 * Example from page 39
 * */
import java.util.Scanner;

public class Format {
	public static void main(String[] args) {
		final double CM_PER_INCH = 2.54;
		int inch;
		double cm;
		Scanner in = new Scanner(System.in);


		System.out.print("How many inches? ");
		inch = in.nextInt();

		cm = inch * CM_PER_INCH;
		System.out.printf("%d in = %.3f cm\n", inch, cm);

	}
}
