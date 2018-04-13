


/**
 * Chapter 03 Problem 3.30 (Current time).
 * 
 * Revise Programming Exercise 2.8 to display the hour using a 12-hour clock.
 * 
 */

import java.util.Scanner;

public class CurrentTime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the time zone offset to GMT: ");
		int offset = input.nextInt();

		long totalMilliseconds = System.currentTimeMillis(); // the total milliseconds since midnight, Jan 1, 1970

		long totalSeconds = totalMilliseconds / 1000; // the total seconds since midnight, Jan 1, 1970

		long currentSecond = (int) (totalSeconds % 60); // the current second in the minute in the hour

		long totalMinutes = totalSeconds / 60; // the total minutes

		long currentMinute = (int) (totalMinutes % 60); // the current minute in the hour

		long totalHours = totalMinutes / 60; // the total hours

		totalHours += offset;

		// Compute the current hour

		long currentHour = (int) (totalHours % 24);
		String period = currentHour >= 12 ? "PM" : "AM";
		currentHour = (int) (totalHours % 12);

		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " " + period);
	}
}