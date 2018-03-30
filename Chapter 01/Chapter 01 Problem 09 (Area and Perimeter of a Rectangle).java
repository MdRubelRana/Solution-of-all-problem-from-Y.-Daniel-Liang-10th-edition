
/**
 * Chapter 01 Problem 1.9 (Area and Perimeter of a Rectangle).
 * 
 * Write a program that displays the Area and
 * Perimeter of a Rectangle with the Width of 4.5 and Height of 7.9 using the following formula:
 *
 *      area = width * height.
 *      perimeter = 2 * (width + height).
 */

public class AreaAndPerimeterOfRectangle {
	public static void main(String[] args) {

		double width = 4.5;
		double height = 7.9;

		double area = width * height;
		double perimeter = 2 * (width + height);

		System.out.println("Area = " + area);
		System.out.println("Perimeter = " + perimeter);
	}
}