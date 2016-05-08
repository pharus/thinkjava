/*
 * pharus solved this @ Thu  5 May 21:11:30 BST 2016
 *
 * Simple program
 * */
public class Time {
	public static void main(String args[]) {
		int hour = 21, minute = 11, second = 30;
		int smid = (60 * hour + minute)*60 + second;
	   	int tmid = 60*60*24 - smid;
		double per = smid * 100.0 / (60*60*24);

		System.out.println("Time since midnight: " + smid + " second");
		System.out.println("Time to midnight: " + tmid + " second");
		System.out.println("Percentage passed: " + per + "%");
	}
}
