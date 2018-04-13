



/**
 * Chapter 03 Problem 3.12  (Palindrome number).
 * 
 * Write a program that prompts the user to enter a three-digit integer and determines whether it is a palindrome number.
 * A number is palindrome if it reads the same from right to left and from left to right.
 * 
 */

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a three-digit integer: ");
		int number = input.nextInt();
		if (number / 100 == number % 10) {
			System.out.println(number + " is a palindrome.");
		} else {
			System.out.println(number + " is not a palindrome.");
		}
	}
}