

/**
 * Chapter 02 Problem 2.5 (Financial application: Calculate Tips). 
 * 
 * Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total. 
 * For example, if the user enters 10 for subtotal and 15% for gratuity rate, 
 * the program displays $1.5 as gratuity and $11.5 as total.
 * 
 */

import java.util.Scanner;

public class CalculateTips {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the subtotal and a gratuity rate: ");
		int subtotal = input.nextInt();
		int gratuity_rate = input.nextInt();

		double gratuity = (subtotal * gratuity_rate * 1.0) / 100; // Converting int in double multiply by 1.0 (double)
		double total = subtotal + gratuity;
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
	}
}