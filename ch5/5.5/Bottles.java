/*
 * pharus solved this @ Qui Mai 19 21:59:49 WEST 2016
 *
 * Exercise 5.5
 * */
public class Bottles {

	public static void printBottles(int bottles) {

		if (bottles > 0) {
			System.out.println(bottles + " bottles of beer on the wall,");
			System.out.println(bottles + " bottles of beer,");
			System.out.println("ya’ take one down, ya’ pass it around,");	   
			printBottles(bottles - 1);
		} else {
			System.out.println("No bottles of beer on the wall,");
			System.out.println("no bottles of beer,");
			System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
			System.out.println("’cause there are no more bottles of beer on the wall!");
		}
	}

	public static void main(String[] args) {
		printBottles(99);
	}
}
