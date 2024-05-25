/*******************************************************************************
 * Assignment: Lab 4 Task 2
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: The population of town A is less than the population of town B. 
 * However, the population of town A is growing faster than the population of 
 * town B. This program prompts the user to enter the population and growth 
 * rate of each town. The program outputs after how many years the population 
 * of town A will be greater than or equal to the population of town B and the 
 * populations of both the towns at that time. 
 * 
 ******************************************************************************/

import java.util.Scanner;

public class Lab4Task2 {

	public static void main(String[] args) {
		
		// Declare the variables:
		int townApop, townBpop;
		int years = 0;
		double townArate, townBrate;
		
		// Declare Scanner for user input:
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input:
		
		System.out.print("Enter the current population of town A: ");
		townApop = input.nextInt();
		
		System.out.print("\nEnter the current population of town B: ");
		townBpop = input.nextInt();
		
		System.out.print("\nEnter the growth rate of town A: ");
		townArate = input.nextDouble();
		
		System.out.print("\nEnter the growth rate of town B: ");
		townBrate = input.nextDouble();
		
		// close the Scanner:
		input.close();
		
		// Use while loop to calculate growth until population of town A
		// is greater than population of town B
		while(townApop < townBpop)
		{
			// population growth for town A
			townApop = (int)(townApop * (1 + townArate / 100.0));
			
			// population growth for town B
			townBpop = (int)(townBpop * (1 + townBrate / 100.0));
			
			// Increase years by 1
			years++;
			
		}
		
		// Output the results:
		System.out.println("\nAfter " + years + " year(s) the population of town A will be "
				+ "greater than or equal to the population of town B.");
		
		System.out.println("After " + years + " population of town A is " + townApop);
		System.out.println("After " + years + " population of town B is " + townBpop);
		

	}

}
