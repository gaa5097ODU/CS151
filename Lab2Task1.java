/*******************************************************************************
 * Assignment: Lab 2 Task 1
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This program will prompt the user to enter the coordinates for
 * two points (x1, y1) and (x2, y2) and then calculate the distance between these
 * two points using the formula sqrt((x2-x1)^2 + (y2-y1)^2) and output the result
 * to the screen.
 * 
 ******************************************************************************/

// import required packages:
import java.util.Scanner;
import java.lang.Math;

public class Lab2Task1 {

	public static void main(String[] args) {
	  
		// declare Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input:
		System.out.print("Enter x1, y1, x2, y2: ");
		
		// Declare variables and read user input for coordinates of two points:
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		// Calculate sides of triangle and store them in corresponding declared
		// variables:
		double side1 = x2 - x1;
		double side2 = y2 - y1;
		
		// Calculate the distance between two points and store it in a newly
		// declared variable:
		double distance = Math.sqrt( Math.pow(side1, 2) + Math.pow(side2, 2) );
		
		// Output the results for the distance between two points:
		System.out.println("Distance: " + distance);
		

	}

}