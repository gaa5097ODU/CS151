/*******************************************************************************
 * Assignment: Lab 3 Task 1
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This program will prompt the user to enter his/her letter grade
 * and output a message to the screen based off the letter grade. Messages will
 * be the following:
 * 
 *   case user enters A, program will output "Excellent!"
 *   
 *   case user enters B, program will output "Very Good"
 *   
 *   case user enters C, program will output "Passing"
 *   
 *   case user enters D or F, program will output "Not Good. Go Study."
 *   
 *   case user makes any other input, program will output message indicating
 *   that the user input is not possible.
 *  
 * 
 ******************************************************************************/


import java.util.Scanner;

public class Lab3Task1 {

	public static void main(String[] args) {
		
		// Declare variables:
		char userLetterGrade;
		
		// Declare Scanner object for user input:
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter letter grade:
		System.out.print("Enter your letter grade: ");
		
		// Read user input into declared variable:
		userLetterGrade = input.nextLine().charAt(0);
		
		// close the scanner:
		input.close();
		
		// Run conditional statements to determine message to output:
		switch(userLetterGrade) {
		
			case 'A':
				System.out.println("Excellent!"); // message is user entered A
				break;
			
			case 'B':
				System.out.println("Very Good"); // message if user entered B
				break;
			
			case 'C':
				System.out.println("Passing"); // message if user entered C
				break;
			
			case 'D':
			case 'F':
				System.out.println("Not Good. Go Study."); // message if user entered D or F
				break;
			
			default:
				System.out.println("That is not a possible grade."); // message for invalid entry
				
		}


	}
		
}
