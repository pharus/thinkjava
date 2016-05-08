/*
 * pharus solved this @ Fri  6 May 21:46:26 BST 2016
 *
 * Exercise 5.4
 * */
public class Fermat {

	public static void checkFormat(int a, int b, int c, int n) {
		
		if (Math.pow(a, n) + Math.pow(b, n)  == Math.pow(c, n) && n > 2) {
			System.out.println("Holy smokes, Fermat was wrong!");
		} else {
			System.out.println("No, that doesn't work");
		}
	}

	public static void main(String[] args) {

		checkFormat(3, 4, 5, 3);
	}
}
