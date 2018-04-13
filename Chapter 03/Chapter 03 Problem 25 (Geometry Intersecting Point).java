


/**
 * Chapter 03 Problem 3.25  (Geometry: intersecting point).
 * 
 * Two points on line 1 are given as (x1, y1) and (x2, y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a–b.
 * The intersecting point of the two lines can be found by solving the following linear equation:
 *
 *      (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
 *      (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
 *
 * This linear equation can be solved using Cramer’s rule. (see Programming Exercise 3.3). 
 * If the equation has no solutions, the two lines are parallel. (Figure 3.8c).
 * Write a program that prompts the user to enter four points and displays the intersecting point.
 *
 *      Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 5 -1.0 4.0 2.0 -1.0 -2.0 (enter)
 *      The intersecting point is at (2.88889, 1.1111)
 *
 *      Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 7 6.0 4.0 2.0 -1.0 -2.0 (enter)
 *      The two lines are parallel
 *      
 */

import java.util.Scanner;

public class IntersectingPoint {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();

		double a = y1 - y2;
		double b = x1 - x2;
		double c = y3 - y4;
		double d = x3 - x4;
		double e = (a * x1) - (b * y1);
		double f = (c * x3) - (d * y3);
		double determinant = (a * d) - (b * c);

		if (determinant == 0) {
			System.out.println("The lines are parallel.");
		} else {
			double x = (e * d - b * f) / determinant;
			double y = -((a * f) - (e * c)) / determinant;

			x = Math.round(x * 100000) / 100000.0;
			y = Math.round(y * 100000) / 100000.0;

			System.out.println("The intersecting point is at (" + x + ", " + y + ")");
		}
	}
}
