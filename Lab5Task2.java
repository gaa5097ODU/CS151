/*******************************************************************************
 * Assignment: Lab 5 Task 2
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This program prompts the user to input an integer and then 
 * outputs both the individual digits of the number and the sum of the digits.
 * 
 ******************************************************************************/
import java.util.Scanner;

public class Lab5Task2 {

	public static void main(String[] args) {
		
		// Declare and initialize variable for the sum:
		String userNumber;
		int sumOfDigits = 0;
		
		// Declare Scanner object to read user input:
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for input and check for valid input
		do 
		{
			System.out.print("Enter an integer: ");
			userNumber = input.nextLine();
			
		}
		while(userNumber.length() == 0); // if user does not enter anything
		
		// Close the Scanner object:
		input.close();

		// Use for loop to output the number digit by digit and calculate
		// the sum of the digits
		System.out.print("\nThe digits of " + userNumber +  " are: ");
		for(int i = 0; i < userNumber.length(); i++)
		{
			
			if(Character.isDigit(userNumber.charAt(i))) // check if current i'th entry is a digit
			{
				// output i'th digit of the number:
				System.out.print(userNumber.charAt(i) + " ");
				
				// add it to the sum of the digits
				sumOfDigits = sumOfDigits + Character.getNumericValue(userNumber.charAt(i));
			}
			
		}
		
		// Output the sum of the digits:
		System.out.println("\nThe sum of the digits = " + sumOfDigits);
		
	}

}
