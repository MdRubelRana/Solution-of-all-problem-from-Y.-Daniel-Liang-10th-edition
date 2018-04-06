


/** 
 * Chapter 02 Problem 2.6 (Sum the Digits in an Integer).
 * 
 * Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer. 
 * For example, if an integer is 932, the sum of all its digits is 14.
 *
 * Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit.
 *  For instance, 932 % 10 = 2 and 932 / 10 = 93.
 */

import java.util.Scanner;

public class SumTheDigitsAnInteger {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

		System.out.println("Enter a number between 0 and 1000:");
		int number = input.nextInt();

		int sum = 0;
		while (number > 0 && number < 1000) {
			sum = sum + (number % 10);
			number = number / 10;

		}
		System.out.println("The sum of the digits is " + sum);
    }
}