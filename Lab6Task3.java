/******************************************************************************************
 * Assignment: Lab 6 Task 3
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description:  This program  reads three sides for a triangle and uses the isValid 
 * method to test if the input is valid and uses the area method to obtain the area. 
 * The program displays the area if the input is valid. Otherwise, it displays that 
 * the input is invalid. 
 * 
 ******************************************************************************************/
import java.util.Scanner;
import java.lang.Math;

public class Lab6Task3 {

	public static void main(String[] args) {
		
		// Declare variables for user input:
		double side_1, side_2, side_3;
		boolean isValid;
		
		// Declare Scanner object to read user input:
		Scanner input = new Scanner (System.in);
		
		// Prompt user to make inputs for sides of triangle.
		// Re-prompt for input if user makes a negative input:
		do
		{
			System.out.print("Enter three sides in double: ");
			side_1 = input.nextDouble();
			side_2 = input.nextDouble();
			side_3 = input.nextDouble();
			
		}while(side_1 < 0 || side_2 < 0 || side_3 < 0); // ensures no negative entries
		
		// close scanner:
		input.close();
		
		// Call method to get value for isValid flag:
		isValid = isValid(side_1, side_2, side_3);
		
		// If input is valid, print area by invoking are() method
		if(isValid)
			System.out.println("The area of the triangle is " + area(side_1, side_2, side_3));
		
		// if input is invalid, output error to screen
		else
			System.out.println("The input is invalid");
		
	}
	
	// METHOD 1: isValid() method checks if the sum of every two sides is 
	// greater than the third side:
	public static boolean isValid(double side1, double side2, double side3)
	{
		boolean valid = false;
		
		// check if the sum of every two sides is greater than third side
		if(side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2)
			valid = true; // change to true if condition is met
		
		return valid; // return valid flag
		
	}
	
	// METHOD 2: area() method is used to calculate and return the area of a triangle.
	public static double area(double side1, double side2, double side3) {
		
		// declare local variables to store values being used to calculate
		// area:
		double area;
		double s;
		
		// Calculate s parameter:
		s = (side1 + side2 + side3) / 2.0;
		
		// calculate and store area:
		area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		return area; // return area
		
	}

}
