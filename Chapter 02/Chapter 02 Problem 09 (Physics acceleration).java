
/**
 * Chapter 02 Problem 2.9 (Physics: acceleration).
 * 
 * Average acceleration is defined as the change of velocity divided by the time taken to make the change,
 *  as shown in the following formula:
 *
 *      a = ( v1 - v0 ) / t
 *
 * Write a program that prompts the user to enter the starting velocity v0 in meters/second,
 * the ending velocity v1 in meters/second, and the time span t in seconds, 
 * and displays the average acceleration.
 * 
 */

import java.util.Scanner;

public class PhysicsAcceleration {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);

		System.out.print("Enter v0: ");
		double v0 = input.nextDouble();

		System.out.print("Enter v1: ");
		double v1 = input.nextDouble();

		System.out.print("Enter t: ");
		double t = input.nextDouble();

		double acceleration = (v1 - v0) / t;

		System.out.println("The average acceleration is: " + acceleration);
	}
}