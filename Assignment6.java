/********************************************************************************************
 * Assignment: Assignment 6
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: The following program performs the following tasks:
 * 
 * 		* Invokes arrayInitializer() method to read the names of the months and the daily 
 *        high temperatures from the temperature.txt file and store them in two arrays
 *        that have been declared in the main() method. 
 *        
 *      * Invokes arrayPrinter() method to output both arrays to the screen, showing 
 *        the month and corresponding temperatures.
 *        
 *      * Invokes minTempFinder() method to find and output the month with the lowest 
 *        temperature recorded.
 * 
 ******************************************************************************************/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Assignment6 {

		public static void main(String[] args) {
		
		
			/// Declare/create arrays:
			final int ARRAY_SIZE = 12;
			String[] monthArray = new String[ARRAY_SIZE]; // array to hold month names
			int[] temperatureArray = new int[ARRAY_SIZE]; // array to hold temperatures
			
			// Invoke method to read data from file:
			arrayInitializer(ARRAY_SIZE, temperatureArray, monthArray);
			
			// Invoke method to print the arrays to screen:
			arrayPrinter(ARRAY_SIZE, temperatureArray, monthArray);
			
			// Invoke method to find/print minimum temperature info:
			minTempFinder(ARRAY_SIZE, temperatureArray, monthArray);
			

		}
	
		/*******************************************************************************
		 *  
		 *  arrayInitializer(): When called, this method read the data from the 
		 *  temperature.txt file and initialize the Temperature and Months arrays
		 *  that are passed to it.
		 *  
		 ******************************************************************************/
		public static void arrayInitializer(int size, int[] temperature, String[] months)
		{
			String fileName = "temperature.txt";
			Scanner inData = null;
			
			try {
				
				inData = new Scanner(new File(fileName));
			}
			catch(FileNotFoundException e) {
				e.printStackTrace();
				System.out.println("Error opening the file!");
				System.exit(1);
			}
			
			while(inData.hasNextLine())
			{
				for(int i = 0; i < size; i++)
				{
					months[i] = inData.next(); // read month string
					temperature[i] = inData.nextInt(); // read temperature
					
				}
					
			}
			
			// Close file Scanner:
			inData.close();	
			
		}
		
		/*******************************************************************************
		 *  
		 *  arrayPrinter(): When called, this method will print values from the
		 *  arrays where the data from the file has been stored.
		 *  
		 ******************************************************************************/
		public static void arrayPrinter(int arraySize, int[] tempList, String[] monthList)
		{
		
			for(int i = 0; i < arraySize; i++)
				System.out.printf("%-16s%-4s\n", monthList[i], tempList[i]);
			
		}
		
		/*******************************************************************************
		 *  
		 *  minTempFinder(): When called, this method will find and print the lowest 
		 *  temperature in the data-set along with the month associated to it.
		 *  
		 ******************************************************************************/
		public static void minTempFinder(int sizeArr, int[] tempArr, String[] monthArr)
		{
			// Declare/initialize dummy variables to find lowest temperature information:
			int lowestTemp = 200;
			String lowestTempMonth = "N/A";
			
			// Process array through for loop to find the lowest temperature:
			for(int i = 0; i < sizeArr; i++)
			{
				if(tempArr[i] < lowestTemp)
				{
					lowestTemp = tempArr[i]; //update lowest temp value
					lowestTempMonth = monthArr[i]; // update lowest temp month
				}
			}
			
			// Output Lowest temperature info to the screen:
			System.out.println("The month with the lowest temperature " + lowestTempMonth +
					" with " + lowestTemp + " degrees.");

			
		}
	

} 
