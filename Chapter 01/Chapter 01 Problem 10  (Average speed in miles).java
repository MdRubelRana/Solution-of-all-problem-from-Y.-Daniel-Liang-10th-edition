
/**
 * Chapter 01 Problem 1.10  (Average speed in miles).
 * Assume a runner runs 14 kilometers in 45 minutes and 30
 * seconds. Write a program that displays the average speed in miles per hour. (Note
 * that 1 mile is 1.6 kilometers.)
 */

public class AverageSpeedMiles {
    public static void main(String[] args) {
    	
    	double second = (45 * 60) + 30;  // 45 minutes and 30 second transfer in second
		double speed = (14 * 3600) / second;  // Calculate speed in KMH
		double average_speed = speed / 1.6;  // Calculate speed in Miles

		System.out.println("Average speed in miles : " + average_speed);
    }
}