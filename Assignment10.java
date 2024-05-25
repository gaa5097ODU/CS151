/**************************************************************************************************
 * Assignment: Assignment 10
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This program prompts the user to enter the length in feet and inches and outputs 
 *              the equivalent length in inches and in centimeters. If the user enters a negative 
 *              number or a non-digit number, the program throws and handle an appropriate 
 *              exception and prompts the user to enter another set of numbers.
 *              
***************************************************************************************************/

import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.IllegalArgumentException;

public class Assignment10 {

	public static void main(String[] args) {
		
		// Declare constants for unit conversions:
		final int INCHES_PER_FOOT = 12;
		final double CENTIMETERS_PER_INCH = 2.54;
		
		// Declare the variables:
		int feet, inches, totalInches;
		double centimeters;
		
		// Declare Scanner object:
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			try {
				
				// Prompt user to enter feet and store value
				System.out.print("Enter the feet: ");
				feet = input.nextInt();
				
				// Throw exception if feet is negative
				if(feet < 0)
				{
					throw new IllegalArgumentException("Feet must be a non-negative number!");
				}
				
				// Prompt user to enter inches and store value
				System.out.print("\nEnter the inches: ");
				inches = input.nextInt();
				
				// Throw exception if inches is negative
				if(inches < 0)
				{
					throw new IllegalArgumentException("Inches must be non-negative number!");
				}
				
			
				// Close the Scanner
				input.close();
				
				// Show user inputted values:
				System.out.println("\nThe numbers you entered are " + feet + " for feet and " 
									+ inches + " for inches. ");
				
				// Calculate total number of inches
				totalInches = INCHES_PER_FOOT * feet + inches;
				
				// Calculate centimeters:
				centimeters = CENTIMETERS_PER_INCH * totalInches;
				
				// Print results to the screen:
				System.out.println("\nThe total number of inches = " + totalInches);
				System.out.printf("The number of centimeters = %.2f", centimeters);
				
				break; // break out of while loop if results have been provided
				
			}
			// Catch stack to handle non-digit inputs exception
			catch(InputMismatchException ex) {
				
				System.out.println(" ");
	            System.out.print(ex + ": Feet and Inches must be non-negative integers!");
	            System.out.println("\n");
	            input.nextLine(); // clear input
				
			}
			// Catch stack to handle negative number entries exception 
			catch (IllegalArgumentException e) {
				
				 System.out.println(" ");
	             System.out.println(e);
	             System.out.println(" ");
	       
	        }
			
	    } // end of while loop
			
	}

}


