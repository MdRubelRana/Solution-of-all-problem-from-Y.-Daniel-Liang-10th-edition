
/**
 * 
 * Chapter 02 Problem 2.19  (Geometry: Area of a Triangle).
 * 
 * Write a program that prompts the user to enter
 * three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
 * The formula for computing the area of a triangle is
 *
 *      s = (side1 + side2 + side3)/2;
 *               __________________________________
 *      area = root((s - side1)(s - side2)(s - side3))
 *
 * Here is a sample run:
 *
 *      Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4 (enter)
 *      The area of the triangle is 33.6
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");

		System.out.print("Enter three points for a triangle: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();

		double area = Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2d);

		System.out.print("The area of the triangle is " + df.format(area));
	}
}