/*******************************************************************************
 * Assignment: Lab 2 Task 2
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This program will prompt the user to enter four test scores:
 * score1, score2, score3, and score4. Then the program will calculate the
 * average of these 4 scores and output the resulting average to the screen.
 * 
 ******************************************************************************/

// Import required packages:
import java.util.Scanner;
import java.lang.Math;

public class Lab2Task2 {

	public static void main(String[] args) {
		
	 // Declare the variables:
		double score1, score2, score3, score4;
		
	 // Declare scanner object:
		Scanner input = new Scanner(System.in);
		
	 // Prompt user to enter test scores:
		System.out.print("Enter four test scores: ");
		
	 // Store user inputted scores into the corresponding variables
		score1 = input.nextDouble();
		score2 = input.nextDouble();
		score3 = input.nextDouble();
		score4 = input.nextDouble();
		
	// Calculate the scores average:
		double average = (score1 + score2 + score3 + score4)/4;
		
	// Output average:
		System.out.println("Average: "+ average);
		
	}

}
