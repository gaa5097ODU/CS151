/*******************************************************************************
 * Assignment: Lab 2 Task 3
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This program will prompt the user to enter the number of
 * liters of milk produced. Then the program will calculate and output the
 * number of cartons needed for this milk, the production cost, and the 
 * carton profit.
 * 
 ******************************************************************************/

// import required packages
import java.util.Scanner;
import java.lang.Math;

public class Lab2Task3 {

	public static void main(String[] args) {
		
		// Declare and initialize constants:
		final double COST_PER_LITER = 0.38;
		final double PROFIT_PER_CARTON = 0.27;
		final double LITERS_PER_CARTON = 3.78;
		
		// Declare Scanner object for user input
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter total milk produced in the morning
		System.out.print("Enter how much milk was produced in liters: ");
		
		// Declare variable for user input of milk produced and store value
		double TotalMilk = input.nextDouble();
		
		// Declare a variable and store the calculated number of cartons needed:
		int cartonsNeeded = (int) (0.5 + TotalMilk/LITERS_PER_CARTON);
		
		// Declare a variable and store calculated cost of producing milk:
		double productionCost = TotalMilk * COST_PER_LITER;
		
		// Declare a variable and store calculated profit for producing milk:
		double profit = cartonsNeeded * PROFIT_PER_CARTON;
		
		// Output results:
		System.out.println("Milk cartons needed: " + cartonsNeeded);
		System.out.println("Cost of production: " + productionCost);
		System.out.println("Total profit: " + profit);
		
	
	}

}
