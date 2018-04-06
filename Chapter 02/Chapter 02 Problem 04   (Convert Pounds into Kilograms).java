

/**
 * Chapter 02 Problem 2.4   (Convert Pounds into Kilograms).
 * 
 * Write a program that converts pounds into kilograms.
 * The program prompts the user to enter a number in pounds, converts it to kilograms, and displays the result.
 *  One pound is 0.454 kilograms.
 *  
 */


import java.util.Scanner;

public class PoundsIntoKilograms {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number in pounds: ");
		double pounds = input.nextDouble();

		double kilograms = pounds * 0.454;

		System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
	}
}