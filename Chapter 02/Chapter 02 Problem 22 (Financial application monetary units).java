
/**
 * Chapter 02 Problem 2.22 (Financial application: monetary units).
 * 
 * Rewrite Listing 2.10, ComputeChange.java, to fix the possible loss of accuracy when converting a double value to an int value. 
 * Enter the input as an integer whose last two digits
 * represent the cents. For example, the input 1156 represents 11 dollars and 56 cents.
 * 
 */

import java.util.Scanner;

public class MonetaryUnits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer amount, for example $11.56 would be 1156: ");
		int remainingAmount = input.nextInt();

		double amount = remainingAmount / 100d;

		int numberOfOneDollars = remainingAmount / 100; // Find the number of one dollars
		remainingAmount = remainingAmount % 100;

		int numberOfQuarters = remainingAmount / 25; // Find the number of quarters in the remaining amount
		remainingAmount = remainingAmount % 25;

		int numberOfDimes = remainingAmount / 10; // Find the number of dimes in the remaining amount
		remainingAmount = remainingAmount % 10;

		int numberOfNickels = remainingAmount / 5; // Find the number of nickels in the remaining amount
		remainingAmount = remainingAmount % 5;

		int numberOfPennies = remainingAmount;

		String output = "Your amount $" + amount + " consists of \n" + "\t" + numberOfOneDollars + " dollars\n" + "\t"
				+ numberOfQuarters + " quarters\n" + "\t" + numberOfDimes + " dimes\n" + "\t" + numberOfNickels
				+ " nickels\n" + "\t" + numberOfPennies + " pennies";
		System.out.println(output);
	}
}