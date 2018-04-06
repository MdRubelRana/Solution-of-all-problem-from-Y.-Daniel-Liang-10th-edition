
/**
 * Chapter 02 Problem 2.3 (Convert Feet into Meters). 
 * 
 * Write a program that reads a number in feet, converts it to meters, and displays the result. 
 * One foot is 0.305 meter.
 * 
 */

import java.util.Scanner;


public class FeetIntoMeters {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        double meters = feet * 0.305d;

        System.out.println(feet + " feet is " + meters + " meters.");
    }
}