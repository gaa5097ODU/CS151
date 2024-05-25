/*******************************************************************************
 * Assignment: Lab 3 Task 1
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Purpose: This prompts the user to enter the number of hours a car is 
 * parked at the airport and outputs the parking fee.
 * 
 *   If user enters a non positive value, program will output error message
 *   and terminate.
 *   
 *   If user enters a value greater than 0 and at most 3, the program will 
 *   calculate a parking fee of $5.00
 *   
 *   If user enters a value greater than 3 and at most 9, the program will
 *   computer parkingFee = 6 * int(hours+1)
 *   
 *   If user enters a value greater than 9 and at most 24, the program will
 *   calculate a parking fee of $60.00
 *   
 *   If user enters any other value greater than 24, the program will tell
 *   the user to reach out to customer service.
 * 
 ******************************************************************************/
import java.util.Scanner;

public class Lab3Task2 {

	public static void main(String[] args) {
		
		// Declare variables:
		double hours;
		double parkingFee = 0; // initialize to avoid error if never assign value
		
		// Declare Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter number of hours car is parker:
		System.out.print("Enter the number of hours the car is parked: ");
		
		// Read user input into variable hours
		hours = input.nextDouble();
		
		//close Scanner object:
		input.close();

		// Use if-else statements to calculate parkingFee:
		if(hours <= 0) // if hours is negative or 0, output error and terminate program
		{
			System.out.print("ERROR! Number of hours must be greater than 0!");
			System.exit(0); //terminate
		}
		
		else if(hours <= 3) // if hours is at most 3 case
			parkingFee = 5;
		
		else if(hours > 3 && hours <= 9) // if hours is more than three and at most 9
			parkingFee = 6 * (int)(hours+1);
		
		else if(hours > 9 && hours <= 24) // if hours is greater than 9 and at most 24
			parkingFee = 60;
		
		else // more than 24 hours, tell user to reach out to customer service and terminate program
		{
			System.out.print("Your car has been parked more than 24 hours.");
			System.out.print("\nPlease reach out to customer service!");
			System.exit(0); // 
		}
		
		/// Print results if program has not been terminated earlier
		System.out.printf("Please pay: $%.2f", parkingFee);
		
	}

}
