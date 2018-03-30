
/**
 * Chapter 01 Problem 1.12  (Average speed in kilometers).
 * 
 * Assume a runner runs 24 miles in 1 hour, 40 minutes and 35 seconds. 
 * Write a program that displays the average speed in kilometers per hour. 
 * (Note that 1 mile is 1.6 kilometers.)
 */
public class AverageSpeedKilometers {
    public static void main(String[] args) {
    	
        double MPH = 24.0 * (60 * 60) / ((60 * 60) + (40 * 60) + 35);
        double KMPH = MPH * 1.6;

        System.out.println("Kilometers per hour (KMPH) = " + KMPH);
    }
}