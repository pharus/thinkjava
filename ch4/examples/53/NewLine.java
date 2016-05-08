/*
 * pharus wrote this @ Fri  6 May 11:27:02 BST 2016
 *
 * Example from page 53 
 * */
public class NewLine {
	
	public static void newLine() {
		System.out.println();
	}

	public static void threeLine() {
		newLine();
		newLine();
		newLine();
	}

	public static void main(String[] args) {
		System.out.println("First line.");
		threeLine();
		System.out.println("Second line.");
	}
}

