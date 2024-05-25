/******************************************************************************
 * Assignment: Assignment 4 Task 1
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This  program should prompt the user to enter the number of 
 * products they want to purchase. For each product, prompts the user to enter 
 * the price. If the user buys more than 5 products, a 10% discount is applied 
 * to the total price. The program calculates and outputs the total price 
 * before and after any discount.
 *    
******************************************************************************/
import java.util.Scanner;

public class Assignment4Task1 {

	public static void main(String[] args) {
		
		// Declare variables:
		final double discountRate = 0.10;
		int productsNumber;
		double userPrice;
		double priceBeforeDiscount = 0;
		double priceAfterDiscount;
		
		// Declare Scanner for user input 
		Scanner input = new Scanner(System.in);
		

		// Use do-while loop for Input validation 
		// (ensuring user does not enter negative numbers:
		do
		{
			// Prompt the user to enter the number of products:
			System.out.print("Enter the number of products: ");
			
			// Read user's number of products into its variable
			productsNumber = input.nextInt();
			
			// space
			System.out.println(" ");
			
			
		}
		while(productsNumber < 0);
		
		
		// Use for loop structure to prompt user to enter price for each item purchased:
		for(int i = 1; i <= productsNumber; i++)
		{
			System.out.print("Enter the price of product " + i + ":");
			userPrice = input.nextDouble();
			// space
			System.out.println(" ");
			
			// Calculate price before discount
			priceBeforeDiscount = priceBeforeDiscount + userPrice;
			
		}
		
		// Output the total price before discount:
		System.out.println("Total price before discount is $" + priceBeforeDiscount);
		System.out.println(" ");
		
		if(productsNumber > 5) /// Case in which more than 5 products are purchased
		{
			// Calculate discount:
			priceAfterDiscount = priceBeforeDiscount - priceBeforeDiscount*discountRate;
			
			// Output final total after 10% discount
			System.out.println("Total price after 10% discount is $" + priceAfterDiscount);
			
		}
		else /// Case in which less than 5 items were purchased
		{
			/// Output final price with no discount
			System.out.println("You bought " + productsNumber + " products. No discount applies"
					+ " and the total price is $" + priceBeforeDiscount);
		}
		
		// Close the Scanner:
		input.close();
		
		
	}

}