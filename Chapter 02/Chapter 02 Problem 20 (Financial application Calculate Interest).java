
/**
 * 
 * Chapter 02 Problem 2.20 (Financial application: calculate interest).
 * 
 * If you know the balance and the annual percentage interest rate, 
 * you can compute the interest on the next monthly payment  using the following formula:
 *
 *      interest = balance * (annualInterestRate / 1200)
 *
 * Write a program that reads the balance and the annual percentage interest rate and
 * displays the interest for the next month.
 * 
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateInterest {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00000");

		System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
		double balance = input.nextDouble();
		double annualInterestRate = input.nextDouble();

		double interest = balance * (annualInterestRate / 1200);

		System.out.println("The interest is " + df.format(interest));
	}
}