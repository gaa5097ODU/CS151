/******************************************************************************
 * Assignment: Assignment 5
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This program will prompt the user to enter a non-negative 
 * integer and call two methods, EvenDigitSum() and OddDigitSum(), to 
 * calculate and return the sum of the even digits and the sum of the odd
 * digits. The main method will print these resulting values to the screen.
 *    
******************************************************************************/

import java.util.Scanner;

public class Assignment5 {

	/// MAIN METHOD:
	public static void main(String[] args) {
		
		// Declare Scanner object for user input:
		Scanner input = new Scanner(System.in);
		
		// Declare variables to store user input:
		int userInteger;
		
		// Output program banner:
		System.out.println("************************************************");
		System.out.println("*  Summing Even and Odd Digits of an Integer   *");
		System.out.println("************************************************");
		System.out.println(" ");
		
		// Prompt user for input. Use do-while loop to keep asking for input
		// if user enters negative number:	
		do
		{
			System.out.print("Enter a non-negative integer: ");
			userInteger = input.nextInt();
			
		}
		while(userInteger < 0);
		
		// Close the Scanner object:
		input.close();
		
		// Output sum of even digits:
		System.out.println("Sum of even digits: " + EvenDigitSum(userInteger));
		
		// Output sum of odd digits:
		System.out.println("Sum of odd digits: " + OddDigitSum(userInteger));

	}
	
	/// EvenDigitSum(): Method to return sum of even digits:
	public static int EvenDigitSum(int userNumb) {
		
		int evenSum = 0; // variable to hold sum of even digits
		int d; // variable to temporarily hold extracted digits
		
		while(userNumb > 0) // use while loop to process userNumb digit by digit
		{
			d = userNumb % 10; // extract digit
			
			if(d % 2 == 0) // check if current digit is even
				evenSum = evenSum + d; // add it to sum if even
			
			userNumb = userNumb / 10; // remove current digit from userNumb
		}
		
		return evenSum; // return final value of even sum 
		
	}
	
	/// OddDigitSum(): Method that returns sum of odd digits:
	public static int OddDigitSum(int userNumb) {
		
		int oddSum = 0; // variable to hold the sum of odd integers
		int d; // variable to temporarily hold extracted digits
		
		while(userNumb > 0) // use while loop to process userNumb digit by digit
		{
			d = userNumb % 10; // extract digit
			
			if(d % 2 != 0) // check if current digit is not even
				oddSum = oddSum + d; // if it's not even, add it to odd sum
			
			userNumb = userNumb / 10; // remove current digit from userNumb
		}
		
		return oddSum; // return final value of odd sum
		
	}
	
	
}
