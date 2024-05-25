/******************************************************************************************
 * Assignment: Lab 6 Task 2
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description:  This program prompts the user to enter three numbers and invokes the 
 * displaySortedNumbers() method to display them in increasing order.
 * 
 ******************************************************************************************/

import java.util.Scanner;

public class Lab6Task2 {

	public static void main(String[] args) {
		
		// Declare variables for user input:
		double userNumb1, userNumb2, userNumb3;
		
		// Declare Scanner object to read user input:
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter three numbers:
		System.out.print("Enter three values: ");
		
		// Read in values:
		userNumb1 = input.nextDouble();
		userNumb2 = input.nextDouble();
		userNumb3 = input.nextDouble();
		
		// close scanner object
		input.close();
		
		// Call displaySortedNumbers method:
		displaySortedNumbers(userNumb1, userNumb2, userNumb3);
		
	}
	
	// displaySortedNumbers() Method: Method to display sorted numbers to the screen:
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		
		// declare variables for the order of the numbers:
		double first, second, third;
		
		// num1 is the smallest
		if(num1 <= num2 && num1 <= num3)
		{
			first = num1; // num1 is the smallest (first)
			
			if(num2 <= num3) // num2 is the second smallest within case
			{
				second = num2;
				third = num3;
			}
			else // num3 is second smallest within case
			{
				second = num3;
				third = num2;
			}
				
		}
		
		// num2 is the smallest
		else if(num2 <= num1 && num2 <= num3)
		{
			first = num2; //num2 is the smallest (first)
			
			if(num1 <= num3) //num1 is second smallest within case
			{
				second = num1;
				third = num3;
			}
			else //numb3 is the second smallest within case
			{
				second = num3;
				third = num1;
			}
			
		}
		
		// num3 is the smallest
		else //if(num3 <= num1 && num3 <= num2)
		{
			first = num3; // num3 is the first (smallest)
			
			if(num1 <= num2) // if num1 is smaller within the case
			{
				second = num1;
				third = num2;
			}
			else // if num2 is smaller within the case
			{
				second = num2;
				third = num1;
			}
			
		}
		
	   // output results:
	   System.out.println("The sorted numbers are " + first + " " + second + " " + third);
			
	}
		
}
