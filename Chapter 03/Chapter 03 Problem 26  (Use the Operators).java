


/**
 * Chapter 03 Problem 3.26  (Use the &&, || and ^ operators).
 * 
 * Write a program that prompts the user to enter an integer and determines whether it is divisible by 5 and 6,
 *  whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both.
 *  
 */

import java.util.Scanner;

public class UseOperators {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		boolean bOr = false;
		boolean bAnd = false;
		boolean bXor = false;

		if (number % 5 == 0 || number % 6 == 0)
			bOr = true;
		if (number % 5 == 0 && number % 6 == 0)
			bAnd = true;
		if (number % 5 == 0 ^ number % 6 == 0)
			bXor = true;

		System.out.println("Is 10 divisible by 5 and 6? " + bAnd);
		System.out.println("Is 10 divisible by 5 or 6? " + bOr);
		System.out.println("Is 10 divisible by 5 or 6, but not both? " + bXor);
	}
}