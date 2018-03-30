
/**
 * Chapter 01 Problem 1.8 (Area and Perimeter of a Circle).
 * 
 * Write a program that displays the Area and Perimeter of a Circle that has a Radius of 5.5 using the following formula:
 *
 *		area = radius * radius * pi.
 *      perimeter = 2 * radius * pi.   
 */
public class AreaAndPerimeterOfCircle {
    public static void main(String[] args) {
    	
    	double radius = 5.5;
    	double area = radius * radius * 3.14159 ;
    	double perimeter = 2 * radius *3.14159 ;
    	
    	System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}