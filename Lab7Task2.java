/****************************************************************************************************
 * Assignment: Lab 7 Task 2
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description:  This program  accepts a sequence of characters and calls a method  isPalindrome()
 *               that returns true if method phrase is a palindrome or false if it's not. Based
 *               off the value returned by this method, the program outputs a message to the user
 *               indicating whether the phrase is a palindrome or not. Then asks the user whether
 *               he/she wants to continue or not.
 * 
 ***************************************************************************************************/
import java.util.*;

public class Lab7Task2 {

	public static void main(String[] args) {
		
		// Declare/initialize constant for array size
		final int MAX_CHARACTERS = 80;
		
		// Declare/initialize objects for user input
		char userDecision;
		Scanner input;
		
		// Use do-while loop to execute program until user does not want to continue:
		do
		{

			input = new Scanner(System.in); // initialize scanner object
			
			// prompt the user to enter phrase
			System.out.print("Enter a phrase to be checked if it is a palindrome: ");
			String word = input.nextLine(); // read input
			
			// Check if invalid input is made (longer than 80 characters)
			if(word.length() > MAX_CHARACTERS)
			{
			   System.out.println("Word is too long! Your phrase should be less than 80 characters.");
			}	
			
			// Process valid input:
			else
			{
				if(isPalindrome(word)) // isPalindrome() method returns true
				{
					System.out.println("The phrase is a palindrome.");
					System.out.println(" ");
				}
				else // isPalindrome() method returns false
				{
					System.out.println("The phrase is not a palindrome.");
					System.out.println(" ");
				}
					
			}
			
			// Ask user if he/she wants to continue:
			System.out.print("Continue testing palindrome ? ");
			userDecision = input.next().toLowerCase().charAt(0);
			System.out.println(" ");
			
		}
		while(userDecision == 'y');
		
		// close the Scanner object:
		input.close();
		

	}
	
	/***********************************************************************************************
	 *  
	 *  isPalindrome(): When called, this method removes spaces, changes phrase to lower case and
	 *  		       returns a boolean value that indicates whether the phrase is a palindrome
	 *  			   (true) or not (false).
	 *  
	 **********************************************************************************************/
		public static boolean isPalindrome(String phrase)
		{
			// Remove spaces and convert all letters to lowecase
			phrase = phrase.replaceAll(" ", "").toLowerCase();
			
			// process phrase character by character:
			for(int i = 0; i < phrase.length() / 2; i++)
			{
				// check if palindrome conditions are not met:
				if(phrase.charAt(i) != phrase.charAt(phrase.length() - 1 - i))
				{
					return false;
				}
			}
			
			// return true if palindrome conditions were met
			return true;
			
		}

}
