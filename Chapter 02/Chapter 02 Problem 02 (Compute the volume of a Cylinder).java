

/**
 * Chapter 02 Problem 2.2 (Compute the volume of a Cylinder).
 * 
 * Write a program that reads in the radius and length of a cylinder and
 * computes the area and volume using the following formulas:
 * 
 * area = radius * radius * pi
 * volume = area * length
 * 
 */


import java.util.Scanner;

public class VolumeOfCylinder {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

		System.out.println("Enter the radius of a Cylinder: ");
		double radius = input.nextDouble();
		
		System.out.println("Enter the length of a Cylinder: ");
		double length = input.nextDouble();

		double area = radius * radius * Math.PI;
		double volume = area * length;

		System.out.println("The Area is: " + area);
		System.out.println("The Volume is: " + volume);
	}
}