/*******************************************************************************
 * Assignment: Lab 5 Task 1
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This program uses a for loop structure to add and print 
 * all the numbers divisible by 7 between 1 and 100.
 * 
 ******************************************************************************/
public class Lab5Task1 {

	public static void main(String[] args) {
		
		// Declare and initialize variable to store the sum of numbers
		// divisible by 7:
		int numbSum = 0;
		
		System.out.println("The numbers divisible by 7 between 1 and 100:");
		
		// Execute for-loop structure to account for numbers divisible by 7 (noted by i)
		for(int i = 1; i <= 100; i++)
		{
			if(i % 7 == 0) // check if divisible by 7
			{
				System.out.print(i + " "); // print if it is divisible by 7
				numbSum = numbSum + i; // add it to the sum
			}
				
		}
		
		/// Output the sum to the screen
		System.out.println("\nThe sum of the numbers divisible by 7 between 1 and 100: " + numbSum);

	}

}
