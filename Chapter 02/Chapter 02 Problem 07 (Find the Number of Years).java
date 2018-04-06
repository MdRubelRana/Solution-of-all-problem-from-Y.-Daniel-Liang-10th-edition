

/**
 * Chapter 02 Problem 2.7 (Find the Number of Years).
 *  
 * Write a program that prompts the user to enter the minutes (e.g., 1 billion), 
 * and displays the number of years and days for the minutes.
 * For simplicity, assume a year has 365 days.
 *  
 */



import java.util.Scanner;

public class NumberOfYears {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Calculate 1 year in minutes

		int min = 60 * 24;
		int yr = min * 365;

		System.out.println("Ente the number of minutes: ");
		int minute = input.nextInt();

		// Calculate year and day

		int year = minute / yr;
		int year1 = minute % yr;
		int day = year1 / min;
		System.out.println(minute + " minutes is aproximately " + year + " and " + day + " days.");
	}
}