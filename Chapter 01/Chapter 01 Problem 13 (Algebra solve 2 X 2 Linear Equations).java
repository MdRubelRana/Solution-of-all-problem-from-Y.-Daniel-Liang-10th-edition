
/**
 * Chapter 01 Problem 1.13 (Algebra: solve 2 X 2 Linear Equations).
 * You can use Cramer’s rule to solve the following 2 X 2 system of linear equation:
 *
 *      ax + by = e
 *      cx + dy = f
 *      
 *      x = (ed - bf) / (ad - bc)
 *      y = (af - ec) / (ad - bc)
 *
 * Write a program that solves the following equation and displays the value for x and y:
 *
 *      3.4x + 50.2y = 44.5
 *      2.1x + .55y = 5.9
 */

public class AlgebraLinearEquations {
	public static void main(String[] args) {

		System.out.println("Solving for x and y where:");
		System.out.println("3.4x + 50.2y = 44.5 and 2.1x + .55y = 5.9\n");

		double x = (44.5 * .55 - 50.2 * 5.9) / (3.4 * .55 - 50.2 * 2.1);
		double y = (3.4 * 5.9 - 44.5 * 2.1) / (3.4 * .55 - 50.2 * 2.1);

		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}