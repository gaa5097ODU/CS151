/****************************************************************************************************
 * Assignment: Lab 10 Task 2 (Task2Test)
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description:  This program converts a number entered in Roman numerals to decimal. To do this,
 *               the program will create a Roman class object that will invoke methods to set,
 *               convert, and return values of private fields to be outputted to the screen.
 * 
 ***************************************************************************************************/

import java.util.Scanner;

public class Task2Test {

	public static void main(String[] args) {
		
		// Declare Scanner object:
		Scanner input = new Scanner(System.in);
		
		
		// Prompt user to enter Roman number:
		System.out.print("Enter a roman number: ");
		
		// Create Roman object:
		Roman romanObject = new Roman(input.next());
		
		// Close the Scanner
		input.close();
		
		// Print decimal conversion:
		System.out.println("The equivalent of the Roman numeral " + romanObject.getRoman() + 
				           " is " + romanObject.getDecimal());
		

	}

}
