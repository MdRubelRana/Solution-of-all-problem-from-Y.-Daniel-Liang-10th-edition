


/**
 * Chapter 03 Problem 3.34  (Geometry: point on line segment).
 * 
 * Programming Exercise 3.32 shows how to test whether a point is on an unbounded line. 
 * Revise Programming Exercise 3.32 to test whether a point is on a line segment. 
 * Write a program that prompts the user to enter the three points for p0, p1, and p2 and 
 * displays whether p2 is on the line segment from p0 to p1.
 * 
 */

import java.util.Scanner;

public class PointOnLineSegment {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three points for p0, p1, and p2: ");
		double p0x = input.nextDouble();
		double p0y = input.nextDouble();
		double p1x = input.nextDouble();
		double p1y = input.nextDouble();
		double p2x = input.nextDouble();
		double p2y = input.nextDouble();

		double maxX;
		double minX;
		if (p0x <= p1x) {
			maxX = p1x;
			minX = p0x;
		} else {
			maxX = p0x;
			minX = p1x;
		}

		double pointCheck = (p1x - p0x) * (p2y - p0y) - (p2x - p0x) * (p1y - p0y);

		if (pointCheck == 0 && p2x <= maxX && p2x >= minX) {
			System.out.println("(" + p2x + ", " + p2y + ") is on the line segment from (" + p0x + ", " + p0y + ") to ("
					+ p1x + ", " + p1y + ")");
		} else {
			System.out.println("(" + p2x + ", " + p2y + ") is not on the line segment from (" + p0x + ", " + p0y
					+ ") to (" + p1x + ", " + p1y + ")");
		}
	}
}
