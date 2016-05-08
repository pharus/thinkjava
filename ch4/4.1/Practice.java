/*
 * pharus solved this @ Fri  6 May 15:07:52 BST 2016
 *
 * */

/**
 * 1.
 *   No, I wug.
 *   You wugga wug.
 *   I wug.
 * 
 * 2. main - zoop - baffle - ping
 *
 * 3. The program wouldn't end, but probably Stack overflow error
 * */
public class Practice {
	
	public static void zoop() {
		baffle();
		System.out.print("You wugga ");
		baffle();
	}

	public static void main(String[] args) {
		System.out.print("No, I ");
		zoop();
		System.out.print("I ");
		baffle();
	}

	public static void baffle() {
		System.out.print("wug");
		ping();
	}

	public static void ping() {
		System.out.println(".");
	}
}

