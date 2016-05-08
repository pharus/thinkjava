/*
 * pharus solved this @ Thu  5 May 20:52:34 BST 2016
 *
 * Simple program
 * */
public class Date {
	public static void main(String[] args) {
		String day = "Thursday", month = "May";
		int  date = 5, year = 2016;
		
		System.out.println("American format:");
		System.out.println(day + ", " + month + " " + date + ", " + year);
		System.out.println("European format:");
		System.out.println(day + " " + date + " " + month + ", " + year);
	}
}
