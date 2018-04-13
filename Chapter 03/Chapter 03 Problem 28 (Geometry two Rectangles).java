



/**
 * Chapter 03 Problem 3.28  (Geometry: two rectangles).
 * 
 * Write a program that prompts the user to enter the center x-, y-coordinates, width, and height of two rectangles and 
 * determines whether the second rectangle is inside the first or overlaps with the first,
 * as show in Figure 3.9. Test your program to cover all cases.
 * 
 */


import java.util.Scanner;

public class TwoRectangles {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		double cx1 = input.nextDouble();
		double cy1 = input.nextDouble();
		double w1 = input.nextDouble();
		double h1 = input.nextDouble();

		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		double cx2 = input.nextDouble();
		double cy2 = input.nextDouble();
		double w2 = input.nextDouble();
		double h2 = input.nextDouble();

		double right1 = cx1 + w1 / 2.0;
		double left1 = cx1 - w1 / 2.0;
		double top1 = cy1 + h1 / 2.0;
		double bottom1 = cy1 - h1 / 2.0;
		double right2 = cx2 + w2 / 2.0;
		double left2 = cx2 - w2 / 2.0;
		double top2 = cy2 + h2 / 2.0;
		double bottom2 = cy2 - h2 / 2.0;

		if (right2 <= right1 && left2 >= left1 && top2 <= top1 && bottom2 >= bottom1) {
			System.out.println("r2 is inside r1.");
		} else if (right2 <= left1 || left2 > right1 || bottom2 >= top1 || top2 <= bottom1) {
			System.out.println("r2 does not overlap r1");
		} else {
			System.out.println("r2 overlaps r1");
		}
	}
}
