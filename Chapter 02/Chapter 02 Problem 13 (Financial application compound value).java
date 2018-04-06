
/**
 * 
 * Chapter 02 Problem 2.13 (Financial application: compound value).
 * 
 * Suppose you save $100 each month into a savings account with the annual interest rate 5%. 
 * Thus, the monthly interest rate is 0.05/12 = 0.00417. After the first month,
 * the value in the account becomes
 *
 *      100 * (1 + 0.00417) = 100.417
 *
 * After the second month, the value in the account becomes
 *
 *      (100 + 100.417) * (1 + 0.00417) = 201.252
 *
 * After the third month, the value in the account becomes
 *
 *      (100 + 201.252) * (1 + 0.00417) = 302.507
 *
 * and so on.
 *
 * Write a program that prompts the user to enter a monthly saving amount and displays
 * the account value after the sixth month. (In Exercise 4.30, you will use a
 * loop to simplify the code and display the account value for any month.)
 * 
 */

import java.util.Scanner;

public class CompoundValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the monthly saving amount: ");
		double savings = input.nextDouble();

		double total = savings * (1 + 0.00417);
		total = (savings + total) * (1 + 0.00417);
		total = (savings + total) * (1 + 0.00417);
		total = (savings + total) * (1 + 0.00417);
		total = (savings + total) * (1 + 0.00417);
		total = (savings + total) * (1 + 0.00417);

		total *= 100;
		total = (int) (total) / 100.0;

		System.out.println("After the sixth month, the account value is $" + total);
	}
}