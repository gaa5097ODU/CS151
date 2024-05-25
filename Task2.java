/***************************************************************************************
 * Assignment: Lab Midterm Task 2
 * Name: Gustavo Andia
 * Course: CS 151
 * 
 * Description: This program will read substance and boiling point temepratures from
 * 				the "input.txt" file, display them to the screen in the desired format,
 * 				calculate/display the average boiling point temperature in the dataset,
 * 				find/display the highest boiling temperature in the dataset, and 
 * 				find/display the substance that had the max temperature in the
 * 				dataset.
 * 				
 * 
 ***************************************************************************************/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Task2 {

	public static void main(String[] args) {
		
		// Declare Scanner object and String to store file properties:
		String fileName = "input.txt";
		Scanner inData = null;
		
		try { 
			inData = new Scanner(new File(fileName)); // file found, open it
		}
		catch(FileNotFoundException e) { // file not found exception
			e.printStackTrace();
			System.out.println("Error opening the file");
			System.exit(0);
		}
		
		// Declare variables to store data:
		String substance;
		double boilingPoint;
		int sumBoil = 0; // need to find sum for average as items are read
		double avgBoil; // average boiling point
		int sampleSize = 0; // sample size
		double maxTemp = 0; // for finding max temp
		String maxSubs = " "; // for substance corresponding to max temp
		
		// Print title:
		System.out.printf("%-16s %-20s \n", "Substance", "Boiling Point");
		System.out.printf("%-16s %-20s \n", "--------------", "-----------");
		// Read data from file using EOF while loop:
		while(inData.hasNext())
		{
			// Read the data
			substance = inData.next();
			boilingPoint = inData.nextDouble();
			
			// Update the sample size:
			sampleSize++;
			
			// Find max temp:
			if(boilingPoint > maxTemp)
			{
				maxTemp = boilingPoint;
				maxSubs = substance;
			}
			
			// Update the sum (needed for average)
			sumBoil = sumBoil + (int)(boilingPoint);
			
			// Print the data (cast boilingPoint an int):
			System.out.printf("%-16s %-20s \n", substance, (int)(boilingPoint));
			
		}
		
		System.out.println(" ");
		
		// Calculate the average:
		avgBoil = sumBoil / (double)(sampleSize);
		
		// Output average boiling point:
		System.out.printf("The average boiling point is %.2f", avgBoil);
		
		// Output substance with highest boiling point:
		System.out.println("\nThe substance that has the highest "
				+ "boiling point temperature is " + maxSubs);
		
		// Output the the highest boiling point temperature
		System.out.println("The highest boiling point temperature is " + (int)(maxTemp));
		
		// Close file Scanner:
		inData.close();

	}

}
