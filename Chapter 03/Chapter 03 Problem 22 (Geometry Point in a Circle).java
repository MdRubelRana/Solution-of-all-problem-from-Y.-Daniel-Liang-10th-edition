


/**
 * Chapter 03 Problem 3.22 (Geometry: point in a circle?).
 * 
 * Write a program that prompts the user to enter a point (x, y) and 
 * checks whether the point is within the circle centered at (0, 0) with radius 10.
 * For example, (4, 5) is inside the circle and (9, 9) is outside the circle, as shown in Figure 3.7a.
 * 
 * (Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10.
 * The formula for computing the distance is
 *        _________________________
 *      v(x2 - x1)^2 + (y2 - y1)^2.
 *
 * Test your program to cover all cases.)
 * 
 */


import java.util.Scanner;

public class PointInCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		double point = Math.sqrt(Math.pow(x - 0, 2) + Math.pow(y - 0, 2));

		if (point <= 10) {
			System.out.println("Point (" + x + ", " + y + ") is in the circle.");
		} else {
			System.out.println("Point (" + x + ", " + y + ") is NOT in the circle.");
		}
	}
}