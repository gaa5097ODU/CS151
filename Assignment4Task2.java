/******************************************************************************
 * Assignment: Assignment 4 Task 2
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This  program reads the product details from products.txt file. 
 * Each line in the file will contain 2 numbers: the price of a product and 
 * its quantity. If the user buys more than 5 products, with a total price 
 * greater than $ 500, a 10% discount is applied to the total price. 
 * The program calculates and outputs the total price before and after 
 * any discount.
 *    
******************************************************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment4Task2 {

	public static void main(String[] args) {
		
		// Declare objects to read the data file
		String FileName = "products.txt";
		Scanner inData = null;
		
		try // read data
		{
			inData = new Scanner(new File(FileName));
		}
		catch(FileNotFoundException e) // handle case of errors reading data
		{
			e.printStackTrace();
			System.out.println("Error opening the file"); // print error to screen
			System.exit(1); // exit program
		}
		
		// Declare variables to read in the data
		final double discountRate = 0.10;
		double price, priceAfterDiscount, priceBeforeDiscount = 0;
		int quantity, totalItems = 0;
		
		// Use while loop to read the data from the file and calculate total price
		// before discount:
		while(inData.hasNext())
		{
			// Read price from file (row 1)
			price = inData.nextDouble();
			
			// Read quantity from file (row 2)
			quantity = inData.nextInt();
			
			// Update total items:
			totalItems = totalItems + quantity;
					
			// Update total price before discount
			priceBeforeDiscount = priceBeforeDiscount + price*quantity;
			
		}
		
		// Output total price before discount:
		System.out.println("Total price before discount is $" + priceBeforeDiscount);
		System.out.println(" ");
		
		// Apply discount if more than 5 items with total price of more than $500
		if(totalItems > 5 && priceBeforeDiscount > 500)
		{
			// Calculate price after discount
			priceAfterDiscount = priceBeforeDiscount - priceBeforeDiscount*discountRate;
			
			// Output to the screen
			System.out.println("Total price after 10% discount is $" + priceAfterDiscount);
			
		}
		/// If not meet criteria for discount:
		else
		{
			/// Output final price with no discount
			System.out.println("You bought " + totalItems + " products and had"
					+ " a total price of $" + priceBeforeDiscount + ". No discount applies"
					+ " and the total price is $" + priceBeforeDiscount);
		}
		
		// close Scanner
		inData.close();
		
		
	}

}
