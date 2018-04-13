



/**
 * 
 * Chapter 03 Problem 3.01 (Algebra: solve quadratic equations).
 * 
 * The two roots of a quadratic equation ax^2 + bx + c = 0 can be obtained using the following formula:
 *                  __________                          __________
 *      r1 = -b + v(b^2 - 4ac) / 2a   and   r2 = -b - v(b^2 - 4ac) / 2a
 *
 * b^2 - 4ac is called the discriminant of the quadratic equation. 
 * If it is positive, the equation has two real roots. If it is zero, the equation has one root. 
 * If it is negative,the equation has no real roots.
 *
 * Write a program that prompts the user to enter values for a, b, and c 
 * and displays the result based on the discriminant. If the discriminant is positive, 
 * display two roots. If the discriminant is 0, display one root. Otherwise, 
 * display “The equation has no real roots”.
 *
 * Note that you can use Math.pow(x, 0.5) to compute vx. Here are some
 * sample runs.
 *
 * Enter a, b, c: 1.0 3 1 (enter)
 * The equation has two roots -0.381966 and -2.61803
 *     
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class SolveQuadraticEquations {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000000");

		System.out.println("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		double discriminant = (double) Math.pow(b, 2) - (4 * a * c);

		double root1;
		double root2;

		if (discriminant > 0) {
			root1 = (-b - (double) Math.sqrt(discriminant)) / (2 * a);
			root2 = (-b + (double) Math.sqrt(discriminant)) / (2 * a);
			System.out.println("The equation has two roots " + df.format(root2) + " and " + df.format(root1));
		} else if (discriminant == 0) {

			root1 = -b / (2 * a);
			System.out.println("The equation has one root " + df.format(root1));

		} else {
			System.out.println("The equation has no real roots.");
		}
	}
}