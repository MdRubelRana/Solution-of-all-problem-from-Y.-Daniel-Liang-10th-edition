
/**
 * Chapter 01 Problem 1.2 (Display five messages).
 * 
 *  Write a program that displays "Welcome to Java" five times.
 * 
 */

public class DisplayFiveMessages {
	public static void main(String[] args) {

		/****** Please use one way for this problem *******/

		/***** Just Using Print statement ******/
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");

		/****** Using for loop ******/
		for (int i = 0; i < 5; i++) {
			System.out.println("Welcome to Java.");
		}

	}
}