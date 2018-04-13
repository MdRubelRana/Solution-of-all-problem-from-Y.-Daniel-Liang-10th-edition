

/**
 * 
 * Chapter 03 Problem 3.05  (Find future dates).
 * 
 * Write a program that prompts the user to enter an integer for today’s day of the week 
 * (Sunday is 0, Monday is 1, …, and Saturday is 6). 
 * Also prompt the user to enter the number of days after today for a future day and display the future day of the week. 
 * Here is a sample run:
 * 
 * 		Enter today's day: 1
 * 		Enter the number of days elapsed since today: 3
 * 		Today is Monday and the future day is Thursday
 * 
 */

import java.util.Scanner;

public class FutureDates {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);

		System.out.print("Enter today's day: ");
		int today = input.nextInt();
		System.out.print("Enter number of days elapsed since today: ");
		int elapsed = input.nextInt();
		int futureDay = (today + elapsed) % 7;

		String weekday = "";
		String futureWeekday = "";
		switch (today) {
		case 0:
			weekday = "Sunday";
			break;
		case 1:
			weekday = "Monday";
			break;
		case 2:
			weekday = "Tuesday";
			break;
		case 3:
			weekday = "Wednesday";
			break;
		case 4:
			weekday = "Thursday";
			break;
		case 5:
			weekday = "Friday";
			break;
		case 6:
			weekday = "Saturday";
			break;
		default:
			System.out.println("Error: invalid status");
			System.exit(1);
		}
		switch (futureDay) {
		case 0:
			futureWeekday = "Sunday";
			break;
		case 1:
			futureWeekday = "Monday";
			break;
		case 2:
			futureWeekday = "Tuesday";
			break;
		case 3:
			futureWeekday = "Wednesday";
			break;
		case 4:
			futureWeekday = "Thursday";
			break;
		case 5:
			futureWeekday = "Friday";
			break;
		case 6:
			futureWeekday = "Saturday";
			break;
		default:
			System.out.println("Error: invalid status");
			System.exit(1);
		}
		System.out.println("Today is " + weekday + " and the future day is " + futureWeekday);
	}
}