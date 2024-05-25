/*******************************************************************************************
 * Assignment: Assignment 8
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This program will create an array of CoffeeOrder class objects and read
 *              data about the coffee orders, including the type of coffee, quantity, 
 *              price per cup, and temperature (iced or hot) from the coffe_input.txt 
 *              input file and store it in the array. Then, the program will print the
 *              data from the array to the screen by invoking methods that will get the
 *              values of the private members of the class. In addition, the program will
 *              also calcuate total sales and print this to the screen as well.
 *                            
********************************************************************************************/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TestOrder {

	public static void main(String[] args) {
		
		// Create objects to open the file
		String filename = "coffe_input.txt";
		Scanner inData = null;
		
		
		try { // open file if no errors found
			
			inData = new Scanner(new File(filename));
			
		}
		catch(FileNotFoundException e) { // handle file not found exception
			e.getStackTrace();
			System.out.println("Error Opening the File!");
			System.exit(0);
		}
		
		// Declare constant for the array size:
		final int ARRAY_SIZE = 8;
		
		// Create array of objects to store the data:
		CoffeeOrder[] coffeeOrderArray = new CoffeeOrder[ARRAY_SIZE];
		
		// Initialize array by using default constructor:
		for(int i = 0; i < ARRAY_SIZE; i++)
		{
			coffeeOrderArray[i] = new CoffeeOrder();
		}
		
		// Create variable for total price:
		double total = 0;
		
		// Read in the data from the file:
		while(inData.hasNext())
		{
			for(int i = 0; i < ARRAY_SIZE; i++)
			{
				// Invoke class member public methods to read data:
				coffeeOrderArray[i].setCoffeeType(inData.next()); // set type
				coffeeOrderArray[i].setQuantity(inData.nextInt()); // set quantity
				coffeeOrderArray[i].setPrice(inData.nextDouble()); // set price
				coffeeOrderArray[i].setTemp(inData.next()); // set temperature
				
				// Update the total:
				total = total + coffeeOrderArray[i].getQuantity() * coffeeOrderArray[i].getPrice();
				
			}
			
		}
	
		// Close Scanner object:
		inData.close();
		
		// Print the data:
		System.out.printf("%-16s %-10s %-14s %-14s\n", "Coffee Type", "Quantity", "Price/Cup", "Temperature");
		
		for(int i = 0; i < ARRAY_SIZE; i++)
		{
			
			System.out.printf("%-16s %-10s $%-14.2f %-14s\n", 
					coffeeOrderArray[i].getType(),
					coffeeOrderArray[i].getQuantity(),
					coffeeOrderArray[i].getPrice(),
					coffeeOrderArray[i].getTemp());
	
		}
		
		// Output total sales:
		System.out.printf("Total Sales: $%.2f", total);
		

	}

}
