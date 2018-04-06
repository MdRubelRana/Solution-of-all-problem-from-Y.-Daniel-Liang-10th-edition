
/**
 * Chapter 02 Problem 2.23 (Cost of Driving). 
 * 
 * Write a program that prompts the user to enter the distance to drive, the fuel efficiency of the car in miles per gallon,
 * and the price per gallon, and displays the cost of the trip.
 */


import java.util.Scanner;

public class CostOfDriving {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the driving distance:");
		double distance = input.nextDouble();

		System.out.println("Enter miles per gallon:");
		double miles_gallon = input.nextDouble();

		System.out.println("Enter price per gallon:");
		double price_gallon = input.nextDouble();

		double cost = ((distance / miles_gallon) * price_gallon);
		System.out.println("The cost of driving is $" + cost);
	}
}