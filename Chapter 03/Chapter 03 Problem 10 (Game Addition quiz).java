

/**
 * Chapter 03 Problem 3.10 (Game: addition quiz).
 * 
 * Listing 3.3, SubtractionQuiz.java, randomly generates a subtraction question.
 * Revise the program to randomly generate an addition question with two integers less than 100.
 * 
 */

import java.util.Scanner;

public class AdditionQuiz {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);

		System.out.print("What is " + number1 + " + " + number2 + "? ");

		int answer = input.nextInt();

		System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
	}
}