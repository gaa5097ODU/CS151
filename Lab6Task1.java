/******************************************************************************************
 * Assignment: Lab 6 Task 1
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description:  This program prompts the user to enter a password and displays Valid 
 * Password if the rules are followed, or Invalid Password otherwise. The main method 
 * will call the passwordCheck() method to check the following password rules:
 * 
 *     Rule 1) A password must have at least eight characters.
 *     Rule 2) A password must contain only letters and digits.
 *     Rule 3) A password must contain at least two digits.
 *     
 * Upon doing these checks, the passwordCheck() method returns an invalid boolean either 
 * set to true or false. Based off the returned boolean value, the program outputs the 
 * corresponding message to the screen.
 *
 ******************************************************************************************/
import java.util.Scanner;

public class Lab6Task1 {

	public static void main(String[] args) {
	
		// Declare variable to store user input:
		String userPassword;
		
		// Declare Scanner to read user input:
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter password:
		System.out.print("Enter a string for password: ");
		
		// Read user's password:
		userPassword = input.nextLine();
		
		// Close Scanner:
		input.close();
		
		// Call method to check if it is a valid password:
		boolean invalid = passwordCheck(userPassword);
		
		/// Check invalid flag and output message:
		if(!invalid) // if invalid flag is false, password is valid
			System.out.println("Valid Password");
		
		else // if invalid flag is true, password is invalid
			System.out.println("Invalid Password");
		

	}
	
	public static boolean passwordCheck(String pswd) {
		
		int pswdLength = pswd.length(); // calculates the length of the password
		int digitCounter = 0; // variable for counter of digits
		boolean invalidFlag = false; // invalid flag initialized to false
		
		// RULE 1: Password must have at least 8 characters:
		if(pswdLength < 8)
			invalidFlag = true; // invalid if less than 8 characters
		

		for(int i = 0; i < pswdLength; i++)
		{
			// RULE 2: A password must contain only letters and digits
			if(!Character.isDigit(pswd.charAt(i)) && !Character.isAlphabetic(pswd.charAt(i)))
				invalidFlag = true; // invalid if other than digit or letter
			
			// count digits:
			if(Character.isDigit(pswd.charAt(i)))
				digitCounter++;
			
		}
		
		// RULE 3: A password must contain at least two digits.
		if(digitCounter < 2)
			invalidFlag = true; //invalid if less than 2 digits
		
		// return value of invalid flag:
		return invalidFlag;
		
	}
	
}
