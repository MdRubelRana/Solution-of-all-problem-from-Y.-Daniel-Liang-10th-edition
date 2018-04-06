
/**
 * Chapter 02 Problem 2.14  (Health application: Computing BMI).
 * 
 * Body Mass Index (BMI) is a measure of  health on weight. 
 * It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters.
 *  Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI. 
 *Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 */

import java.util.Scanner;

public class ComputingBMI {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

		System.out.println("Enetr weight in pounds: ");
		double weight_pounds = input.nextDouble();

		System.out.println("Enter height in inches: ");
		double height_inches = input.nextDouble();

		double weight = weight_pounds * 0.45359237;
		double height = height_inches * 0.0254;

		double BMI = (weight / (height * height));
		System.out.println("BMI is: " + BMI);
    }
}