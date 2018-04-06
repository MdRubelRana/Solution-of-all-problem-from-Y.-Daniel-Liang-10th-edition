
/**
 * 
 * Chapter 02 Problem 2.21  (Financial application: calculate future investment value).
 * 
 * Write a program that reads in investment amount, annual interest rate, and number of years,
 * and displays the future investment value using the following formula:
 *
 *      futureInvestmentValue = investmentAmount x (1 + monthlyInterestRate)^numberOfYears*12
 *
 * For example, if you enter amount 1000, annual interest rate 3.25%, and number of
 * years 1, the future investment value is 1032.98.
 * 
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateFutureInvestmentValue {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("Enter investment amount: ");
		double investment_amount = input.nextDouble();

		System.out.println("Enter annual interest rate in percentage: ");
		double annual_rate = input.nextDouble();

		double monthly_rate = (annual_rate) / (12 * 100);

		System.out.println("Enter number of year: ");
		int year = input.nextInt();

		double value = investment_amount * (Math.pow((1 + monthly_rate), (year * 12)));
		System.out.println("Accumulated value is $" + df.format(value));
	}

}
