
/**
 * Chapter 02 Problem 2.10 (Science: Calculating Energy).
 * 
 * Write a program that calculates the energy needed to heat water from an initial temperature to a final temperature.
 * Your program should prompt the user to enter the amount of water in kilograms and the initial and
 * final temperatures of the water.
 * The formula to compute the energy is
 *
 *      Q = M * (finalTemperature – initialTemperature) * 4184
 *
 * where M is the weight of water in kilograms, temperatures are in degrees Celsius, and energy Q is measured in joules.
 * 
 */


import java.util.Scanner;


public class CalculatingEnergy {
    public static void main(String[] args) {
    	
        final Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in Kilograms: ");
        double kilograms = input.nextDouble();
        
        System.out.print("Enter the initial temperature: ");
        double temp1 = input.nextDouble();
        
        System.out.print("Enter the final temperature: ");
        double temp2 = input.nextDouble();

        double q = kilograms * (temp2 - temp1) * 4184;

        System.out.println("The energy needed is: " + q);
    }
}