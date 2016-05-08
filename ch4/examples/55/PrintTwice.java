/*
 * pharus wrote this @ Fri  6 May 11:29:22 BST 2016
 *
 * Example from page 55
 * */
public class PrintTwice {

	public static void printTwice(String s) {
		System.out.println(s);
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		printTwice("Don't make me say this twice!");
	}
}
