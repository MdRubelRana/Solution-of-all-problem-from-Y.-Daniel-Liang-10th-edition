
/**
 * 
 * Chapter 02 Problem 2.15  (Geometry: distance of two points).
 * 
 * Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and
 * displays their distance between them.The formula for computing the distance is
 *        __________________________
 *      root((x2 - x1)^2 + (y2 - y1)^2)
 *
 * Note that you can use Math.pow(a, 0.5) to compute 2a.
 * 
 */

import java.util.Scanner;

public class DistanceOfTwoPoints {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("The distance between the two points is " + distance);
	}
}