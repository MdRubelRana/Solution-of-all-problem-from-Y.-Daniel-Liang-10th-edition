
/**
 * 
 * Chapter 02 Problem 2.16 (Geometry: Area of a Hexagon).
 * 
 * Write a program that prompts the user to enter
 * the side of a hexagon and displays its area. The formula for computing the
 * area of a hexagon is:
 *
 * area = (3 * v3 / 2) * s^2
 *
 * where s is the length of a side. Here is a sample run:
 *
 * Enter the side: 5.5 The area of the hexagon is 78.5918
 *
 * In the output box for Programming Exercise 2.16, change 78.5895 to 78.5918.
 * 
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfHexagon {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0000");

		System.out.print("Enter the side: ");
		double side = input.nextDouble();

		double area = ((3 * Math.sqrt(3)) / 2) * Math.pow(side, 2);

		System.out.println("The area of the hexagon is " + df.format(area));
	}
}