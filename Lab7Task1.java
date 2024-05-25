/****************************************************************************************************
 * Assignment: Lab 7 Task 1
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description:  This program allows the user to enter the last names of five candidates in 
 * 				 a local election and the votes received by each candidate. The program then 
 * 				 outputs each candidate’s name, the votes received by that candidate, and the 
 *               percentage of the total votes received by the candidate. The main method in 
 *               this program calls the arrayInputTaker() method to initialize the lastName[]
 *               and numbeOfVotes[] arrays. The program also calls the getTotalVotes() method
 *               to get the total votes for the election and finally calls the printResults()
 *               method to initialize the percentOfVotes[] array and print the results of 
 *               election to the screen.
 * 
 ***************************************************************************************************/
import java.util.Scanner;

public class Lab7Task1 {

	public static void main(String[] args) {
		
		// Declare constant to store size of arrays
		final int NUMBER_OF_CANDIDATES = 5;
		
		// Declare Arrays
		String[] lastName = new String[NUMBER_OF_CANDIDATES];
		int[] numberOfVotes = new int[NUMBER_OF_CANDIDATES];
		double[] percentOfVotes = new double[NUMBER_OF_CANDIDATES];
		
		// Declare variable to store total of votes:
		int totalVotes;
		
		// Call method to read user input into arrays:
		arrayInputTaker(lastName, numberOfVotes, NUMBER_OF_CANDIDATES);
		
		// Get total votes:
		totalVotes = getTotalVotes(numberOfVotes);
		
		// Print results:
		printResults(lastName, numberOfVotes, percentOfVotes, totalVotes);
			
		
	}
	
	/***********************************************************************************************
	 *  
	 *  arrayInputTaker(): When called, this method reads the data inputed by the
	 *  				   user into the name[] and votes[] arrays.
	 *  
	 **********************************************************************************************/

		public static void arrayInputTaker(String name[], int votes[], int candidates)
		{
			// Declare Scanner object for user input:
			   Scanner input = new Scanner(System.in);
			   
		    // Prompt user for input and read into arrays:
				for(int i = 0; i < candidates; i++)
				{
					System.out.print("Enter Candidate " + (i + 1) + "'s last name and votes received: ");
					name[i] = input.next();
					votes[i] = input.nextInt();
				}
			
			// close Scanner
			   input.close();
		}
	
	/**********************************************************************************************
	 *  
	 *  getTotalVotes(): When called, the method processes the data from the
	 *  		         votes[] array and then calculates and returns the total
	 *  				 number of votes store in the votes[] array.
	 *  
	 **********************************************************************************************/
		public static int getTotalVotes(int votes[])
		{
			// declare local variables for calculations:
			int total = 0;
			int size = votes.length;
			
			// user for loop to calculate total votes
			for(int i = 0; i < size; i++)
			{
				total = total + votes[i];
			}
			
			return total;
		}
	
	/**********************************************************************************************
	 *  
	 *  getTotalVotes(): When called, the method processes the data from the votes[] and names[] 
	 *                   arrays; and uses the value of total to calculate and store percentages
	 *                   of votes into the percents[] array. The method will then print the data
	 *                   from the names[], votes[], and percents[] arrays to the screen. As the 
	 *                   data from the arrays is processed, the method will also find the candidate 
	 *                   with the highest number of votes and output the results to the screen. If 
	 *                   no such candidate exists, the method will print a message saying that 
	 *                   there is no winner to the screen.
	 *  
	 *********************************************************************************************/
		public static void printResults(String names[], int votes[], double percents[], int total)
		{
			// declare local variables for calculations:
			int size = votes.length;
			int maxVotes = 0; // initializing to number of votes of first candidate
			String winner = "No Winner"; // initializing to first candidate's name
			boolean winnerFound = false;
			
			System.out.println(" ");
			System.out.printf("%-20s%-18s%-16s\n", "Candidate", "Votes Received", "% of Total Votes");
			for(int i = 0; i < size; i++)
			{
				// Calculate % of votes:
				percents[i] = (double)(votes[i])/(double)(total) * 100;
				
				// Check for winner as data is processed:
				if(votes[i] >= maxVotes)
				{
					if(votes[i] == maxVotes) // tie case
						winnerFound = false; 
					
					else // winner
					{
						maxVotes = votes[i];
						winner = names[i];
						winnerFound = true;
					}
	
				}

				// Output the data:
				System.out.printf("\n%-20s %-18d %-16.2f\n", names[i], votes[i], percents[i]);
			
				
			}
			
			// Output total:
			System.out.printf("\n%-20s %-18d \n", "Total", total);
			
			if(!winnerFound) // there was no winner (ties)
				System.out.println("\nThere was a tie and hence no winner in this election.");
			else //winner found
				System.out.println("\nThe winner of the election is " + winner + ".");
			
		}

}
