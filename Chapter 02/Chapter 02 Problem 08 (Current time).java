

/**
 * Chapter 02 Problem 2.8 (Current time).
 * 
 * Listing 2.7, ShowCurrentTime.java, gives a program that displays the current time in GMT. 
 * Revise the program so that it prompts the user to enter the time zone offset to GMT and
 *  displays the time in the specified time zone.
 *  
 */

import java.util.Scanner;

public class CurrentTime {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		System.out.println("Enter the time zone offset to GMT: ");
		int offset = input.nextInt();

		long totalMilliseconds = System.currentTimeMillis(); // Total milliseconds since midnight, Jan 1, 1970

		long totalSeconds = totalMilliseconds / 1000; // Total seconds since midnight, Jan 1, 1970

		long currentSecond = (int) (totalSeconds % 60); // Current second in the minute in the hour

		long totalMinutes = totalSeconds / 60; // Total minutes

		long currentMinute = (int) (totalMinutes % 60); // Current minute in the hour

		long totalHours = totalMinutes / 60; // Total hours

		totalHours += offset;

		long currentHour = (int) (totalHours % 24); // Current hour

		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
	}
}