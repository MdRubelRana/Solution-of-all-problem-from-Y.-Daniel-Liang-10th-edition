


/**
 * Chapter 02 Problem 2.11 (Population projection).
 * 
 * Rewrite Exercise 1.11 to prompt the user to enter the number of years and displays the population after the number of years.
 * 
 */

import java.util.Scanner;

public class PopulationProjection {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int starting_pop = 312032486;
		int seconds_year = 365 * 24 * 60 * 60;

		int birthsPerYear = seconds_year / 7;
		int deathsPerYear = seconds_year / 13;
		int immigrantsPerYear = seconds_year / 45;

		System.out.print("Enter the number of years: ");
		int years = input.nextInt();

		int population = starting_pop + years * (birthsPerYear + immigrantsPerYear - deathsPerYear);

		System.out.print("The population in " + years + " years is " + population);
	}
}