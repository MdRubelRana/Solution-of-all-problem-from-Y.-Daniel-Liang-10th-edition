
/**
 * 
 * Chapter 02 Problem 2.18 (Print a table).
 * 
 * Write a program that displays the following table:
 * 
 * 		a		b		pow(a,b)
 * 		1		2		1.0
 * 		2		3		8.0
 * 		3		4		81.0
 * 		4		5		1024.0	
 * 		5		6		15625.0
 * 
 */

public class PrintTable {
	public static void main(String[] args) {
		System.out.println("a     b     pow(a, b)");
		System.out.println("1     2     " + Math.pow(1, 2));
		System.out.println("2     3     " + Math.pow(2, 3));
		System.out.println("3     4     " + Math.pow(3, 4));
		System.out.println("4     5     " + Math.pow(4, 5));
		System.out.println("5     6     " + Math.pow(5, 6));
	}
}