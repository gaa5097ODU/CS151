/*******************************************************************************
 * Assignment: Lab 5 Task 3
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This program reads the temperatures from the input file and 
 * outputs the following information to the screen:
 * 
 *    The average temperature during the month of January.
 *    The minimum temperature during the month of January.
 *    The day of the month the minimum temperature occurred.
 * 
 ******************************************************************************/

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Lab5Task3 {

	public static void main(String[] args) {
		
		// Declare objects to read data from file
		String fileName = "input.txt"; 
		Scanner inData = null; 
		
		
		try // read from file if there is no issue
		{
			inData = new Scanner(new File(fileName)); 
		}
		catch(FileNotFoundException e) // handle issue if error is encountered reading the file
		{
			e.printStackTrace();
			System.out.println("Error opening the file"); // print error to screen
			System.exit(1); // exit program
		}
		
		// Declare variables to process data from the file
		int sum = 0;
		int temperature, minTemp = 10000;
		double average;
		int dayCounter = 0, minDay = 0;
		
		// Use EOF while loop to process file while entries are read in:
		System.out.printf("%-10s%-4s%-13s\n", "Month", "Day", "Temperature");
		while(inData.hasNext())
		{
			dayCounter++; // increase day counter by 1
			
			temperature = inData.nextInt(); // read in temperature entry
			
			// Output temperature data:
			System.out.printf("%-10s%-4s%-13s\n", "January", dayCounter, temperature);
			
			if(temperature < minTemp) // find lowest temperature
			{
				minTemp = temperature;
				minDay = dayCounter;
			}
				
			sum = sum + temperature; // calculate the sum of temperature
			
		}
		
		// Close the scanner:
		inData.close();
		
		// Calculate the average:
		average = (double)sum/dayCounter;
		
		// Output results:
		System.out.printf("The average temperature in January was: %.2f", average); // average to two decimal places
		System.out.println("\nThe lowest temperature in January was: " + minTemp); // lowest temp
		System.out.println("The lowest temperature was on January " + minDay); // day of lowest temp
		
		
	}

}
