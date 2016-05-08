/*
 * pharus solved this @ Fri  6 May 15:20:54 BST 2016
 *
 * Simple program
 * */
public class Date {

	public static void printAmerican
			(String day, String month, int date, int year) {
		System.out.println("American format:");
		System.out.println(day + ", " + month + " " + date + ", " + year);
	}

	public static void printEuropean
			(String day, String month, int date, int year) {
		System.out.println("European format:");
		System.out.println(day + " " + date + " " + month + ", " + year);
	}
	
	public static void main(String[] args) {
		String day = "Friday", month = "May";
		int  date = 6, year = 2016;

		printAmerican(day, month, date, year);
		printEuropean(day, month, date, year);
	}
}
