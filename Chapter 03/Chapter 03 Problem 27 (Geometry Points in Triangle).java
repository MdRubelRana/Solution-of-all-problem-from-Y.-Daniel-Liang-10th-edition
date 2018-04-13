



/**
 * Chapter 03 Problem 3.27 (Geometry: points in triangle?).
 * 
 * Suppose a right triangle is placed in a plane as shown below. 
 * The right-angle point is placed at (0, 0), and the other two points are placed at (200, 0), and (0, 100). 
 * Write a program that prompts the user to enter a point with x- and y-coordinates and
 * determines whether the point is inside the triangle.
 * 
 */

import java.util.Scanner;

public class PointsInTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a point's x- and y-coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		double point = -0.5 * x + 100;

		if (x >= 0 && y >= 0 && y <= point) {
			System.out.println("The point is in the triangle");
		} else {
			System.out.println("The point is NOT in the triangle");
		}
	}
}