/*******************************************************************************
 * Assignment: Lab 4 Task 1
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This program that takes two integers as input. It then outputs 
 * how many times the larger number is divisible by the smaller number. If a 
 * remainder exists, the program will output these numbers are not divisible. 
 * Repeat the program until the user chooses to exit.
 * 
 ******************************************************************************/

import java.util.Scanner;

public class Lab4Task1 {

	public static void main(String[] args) {
		
		// Declare variables for the two numbers to be inputted:
		int number1, number2;
		
		// Declare variable for user decision
		char userDecision = '1';
		
		// Declare Scanner object to read user input
		Scanner input = new Scanner(System.in);
		

		while(userDecision == '1')
		{
			// Prompt user to enter two numbers:
			System.out.print("Please enter two numbers: ");
			
			// Read in the first number:
			number1 = input.nextInt();
			
			// Read in the second number:
			number2 = input.nextInt();
			
			if(number1 % number2 != 0 && number2 % number1 != 0) // case in which remainder is not 0
				System.out.println("These numbers are not divisible");
			
			else // this is case number1 % number2 == 0
			{
				if(number1 >= number2) // if number1 is the larger number
				{
					System.out.println(number2 + " goes into " + number1 + " "
							+ number1/number2 + " times.");
				}
				else // if number 2 is the larger number
				{
					System.out.println(number1 + " goes into " + number2 + " "
							+ number2/number1 + " times.");
				}
			}
			
			// Ask the user if he/she wishes to continue:
			System.out.println("To continue type 1");
			System.out.println("To exit type any other character");
			
			// read user decision and update the value of userDecision:
			userDecision = input.next().charAt(0);
			
		} // end of while loop
		
	
		// Close the Scanner object
		input.close();
		
	}

}
