/*******************************************************************************
 * Assignment: Lab 4 Task 3
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This program prompts the user to input a positive integer. It 
 * should then output a message indicating whether the number is a prime number. 
 * (Note: 2 is the only even number that is prime. An odd integer is prime if 
 * it is not divisible by any odd integer less than or equal to the square root 
 * of the number.)
 * 
 ******************************************************************************/
import java.util.Scanner;
import java.lang.Math;

public class Lab4Task3 {

	public static void main(String[] args) {
		
		// Declare variables:
		int userInteger;
		boolean isPrime = true;
		
		// Declare Scanner object for user input
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the number
		System.out.print("Enter a positive integer greater than 1: ");
		userInteger = input.nextInt();
		
		// Handle invalid inputs. Re-prompt user to enter integer greater 
		// than or equal to 1:
		while(userInteger <= 1)
		{
			System.out.println("INVALID INPUT!");
			System.out.print("Enter a positive integer greater than 1: ");
			userInteger = input.nextInt();
			
		}
		
		// Close the Scanner
		input.close();
		
		if(userInteger % 2 == 0) // even number case
		{
			if(userInteger != 2) // if number is not 2, not prime
				isPrime = false;
			
			// if number is 2, isPrime = true (which it already is)
			
		}
		else // odd number case
		{
			int integerDivisor = 3;
			int sqrtNumb = (int)(Math.sqrt(userInteger) + 1);
			
			while(integerDivisor <= sqrtNumb)
			{
				
				if(userInteger % integerDivisor == 0)
				{
					isPrime = false;
					break;
				}
				else
					integerDivisor = integerDivisor + 2; // move to next odd number
				
			} // end of while loop
			
		} // end of else statement
		
		/// OUTPUT RESULTS:
		System.out.println("\nThe number you entered is: " + userInteger);
		
		if(isPrime)
			System.out.println("It is a prime number");
		else
			System.out.println("It is not a prime number");
		
		
	}

}
