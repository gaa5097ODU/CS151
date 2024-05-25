/**********************************************************************************************************
 * Assignment: CS 151 Lab Final Exam (TestHouse.java)
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This program declares an array of House class objects and then implements locally defined
 *              methods that utilize the getter/setter class member methods to read the data from the input
 *              file "input.txt" into their associated private fields within the array. Then the program
 *              prints invokes a method to print all the data in the array to the screen, print the data
 *              from the array corresponding to houses with at least 4 bedrooms, and print the data from the
 *              array corresponding to the cheapest house with at least 4 bedrooms.
 * 
 **********************************************************************************************************/
import java.io.*;
import java.util.*;

public class TestHouse {

	public static void main(String[] args) {
		
		// Declare objects to read/open the file:
		String fileName = "input.txt"; // string for file name
		Scanner inFile = null; // null scanner until it filled
		
		// Process opening of the file through try and catch:
		try {
			inFile = new Scanner(new File(fileName)); // open the file
		}
		catch(FileNotFoundException ex) { // use catch to handle exceptions resulting from opening the file
			
			ex.printStackTrace(); // print trace for error
			System.out.println("There was an error opening the file!"); // print error message to screen
			System.exit(1); // terminate the program
		}
		
		// Once file is read in ...
		
		// Declare array of House objects:
		House [] houseArr = new House[10]; // size 10 as this is how many lines of data we have in the file
		
		// Invoke method to initialize array with default constructor from class:
		arrayInit(houseArr);
		
		// Invoke method to read data from the file into the array:
		readFileData(houseArr, inFile);
		
		// Close the Scanner as it is no longer needed:
		inFile.close();
		
		// Invoke method to print the data from the array:
		printArray(houseArr);
		
		// Invoke the method that finds and prints the list of houses with at least 4 bedrooms:
		atLeastFourBedroomFinder(houseArr);

		// Invoke the method that finds and prints the cheapest house with at least 4 bedrooms:
		cheaptestFourBedroomFinder(houseArr);
		
	}
	
	// Method to initialize array with class' default constructor:
	public static void arrayInit(House [] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = new House(); // Invoke default constructor to initialize entry
		}
	}
	
	// Method to read data from the file into the array of objects:
	public static void readFileData(House [] arr, Scanner inData)
	{
		while(inData.hasNext()) // use while loop to read file line by line
		{
			for(int i = 0; i < arr.length; i++)
			{
				arr[i].setMLSNumber(inData.nextInt()); // read MLS #
				arr[i].setYear(inData.nextInt()); // read year
				arr[i].setBedrooms(inData.nextInt()); // read # bedrooms
				arr[i].setBathroom(inData.nextInt()); // read # bathrooms
				arr[i].setLotSize(inData.nextInt()); // read lot size
				arr[i].setPrice(inData.nextInt()); // read in price
				
			}
		}
	}
	
	// Method to print array to the screen:
	public static void printArray(House [] arr)
	{
		
		// Print header:
		System.out.printf("\n%-10s %-10s %-10s %-10s %-10s %-10s", "MLS", "Year", "#Bedrooms", "#Bathrooms", "Lot Size", "Price");
		System.out.printf("\n%-10s %-10s %-10s %-10s %-10s %-10s", "===", "====", "=========", "==========", "========", "=====");
		
		// Print data from array:
		for(int i = 0; i < arr.length; i++)
		{
			// Use getter methods to print values of private fields:
			System.out.printf("\n%-10s %-10s %-10s %-10s %-10s %-10s",
					arr[i].getMLSNumber(), arr[i].getYear(), arr[i].getBedrooms(), arr[i].getBathrooms(),
					arr[i].getLotSize(), arr[i].getPrice());
						
		}
	
	}
	
	// Method to find and print houses with at least 4 bedrooms:
	public static void atLeastFourBedroomFinder(House [] arr)
	{
		// Print title:
		System.out.println("\n\nList of houses with at least 4 bedrooms:");
		System.out.println("========================================");
		// Print header:
		System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s", "MLS", "Year", "#Bedrooms", "#Bathrooms", "Lot Size", "Price");
		
		// Process the data through a for loop
		for(int i = 0; i < arr.length; i++)
		{
			// If house has at least 4 bedrooms, print the data
			if(arr[i].getBedrooms() >= 4)
			{
				System.out.printf("\n%-10s %-10s %-10s %-10s %-10s %-10s",
						arr[i].getMLSNumber(), arr[i].getYear(), arr[i].getBedrooms(), arr[i].getBathrooms(),
						arr[i].getLotSize(), arr[i].getPrice());
			}
			
			// Otherwise, do nothing
		}
	}
	
	// Method to find and print house with at least for bedrooms that is the cheapest
	public static void cheaptestFourBedroomFinder(House [] arr)
	{

		int minIndex = 0; // declare the 0'th entry as the entry with ... only used to keep track of index
		int minPrice = 70000000; // declare this to be a super large dummy integer to trigger price comparison for min
		
		// Print title:
		System.out.println("\n\nThe cheapest house that has at least 4 bedrooms");
		System.out.println("====================================================");
		// Print header:
		System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s", "MLS", "Year", "#Bedrooms", "#Bathrooms", "Lot Size", "Price");
		
		// Process the data through the array to find entry that satisfies condition
		// of being cheapest AND having at least 4 bedrooms
		for(int i = 1; i < arr.length; i++)
		{
			// Check if house has at least 4 bedrooms to perform the comparison
			if(arr[i].getBedrooms() >= 4)
			{
		
				// Check if a new minimum price is found
				if(arr[i].getPrice() < minPrice)
				{
					minPrice = arr[i].getPrice(); // update minimum price
					minIndex = i; // update index
					
				}
				
				// If no new minimum price is found, update nothing

			}
			
		}
		
		// Print data corresponding to the min price that has at least 4 bedrooms:
		System.out.printf("\n%-10s %-10s %-10s %-10s %-10s %-10s",
				arr[minIndex].getMLSNumber(), arr[minIndex].getYear(), arr[minIndex].getBedrooms(), arr[minIndex].getBathrooms(),
				arr[minIndex].getLotSize(), arr[minIndex].getPrice());
		
	}
	
	//

}
