



/**
 * 
 * Chapter 03 Problem 3.03 (Algebra: solve 2 X 2 linear equations).
 * 
 * You can use Cramer's rule to solve the following 2 X 2 system of linear equation:
 *
 *      ax + by = e
 *      cx + dy = f
 *      x = (ed - bf) / (ad - bc)
 *      y = (af - ec) / (ad - bc)
 *
 * Write a program that prompts the user to enter a, b, c, d, e, and f and displays the result.
 * If ad - bc is 0, report that “The equation has no solution”.
 *
 *      Enter a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0 (enter)
 *      x is -2.0 and y is 3.0
 *
 *      Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0 (enter)
 *      The equation has no solution
 */


import java.util.Scanner;

public class Solve2x2LinearEquations {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		double denominator = a * d - b * c;

		if (denominator == 0) {
			System.out.println("The equation has no solution.");
		} else {
			double x = (e * d - b * f) / denominator;
			double y = (a * f - e * c) / denominator;
			System.out.println("x is " + x + " and y is " + y);
		}

	}
}