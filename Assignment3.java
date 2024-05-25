/******************************************************************************
 * Assignment: Assignment 3
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This program  lculates the water usage charge for a household 
 * based on the number of gallons used. The program will calculate the water 
 * usage charge as follows:
 *    The first 1000 gallons are free.
 *    For usage above 1000 gallons, a charge of $0.02 per gallon is applied.
 *    
******************************************************************************/

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		
		// Declare the variables
		int numberOfGallons;
		double waterCost;
		
		// Declare Scanner object to read user input
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter number of gallons of water:
		System.out.print("Enter the total water usage in gallons: ");
		
		// Read user input into the corresponding variable:
		numberOfGallons = input.nextInt();
		
		// Ensure user enters valid number for gallons of water
		// Keep asking until user makes valid inout
		while(numberOfGallons < 0)
		{
		   System.out.println("\nERROR: Number of Water gallons cannot be negative!");
		   System.out.print("Enter the total water usage in gallons: ");
		   numberOfGallons = input.nextInt();
		}
		
		// Close the Scanner:
		input.close();
		
		// Selection structure to calculate the cost:
		if(numberOfGallons <= 1000) // Free first 1000 gallons
		{
			waterCost = 0.0;
		}
		else // above 1000 gallons case
		{
			waterCost = (numberOfGallons - 1000) * 0.02;
		}
		
		// Output results the user:
		System.out.println("The water usage charge is $ " + waterCost);

	}

}
