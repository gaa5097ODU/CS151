/****************************************************************************************************
 * Assignment: Lab 7 Task 3
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This program allows the user to enter students’ names followed by their test 
 *              scores and output the following information:
 *              
 *                1) Class average
 *                2) Names of all the students whose test scores are below the class average, 
 *                   with an appropriate message.
 *                   
 *                3) Highest test score and the names of all the students having the highest score.
 *              
 *              NOTE: The user should be asked beforehand how many students they want to enter.
 * 
 ***************************************************************************************************/
import java.util.Scanner;

public class Lab7Task3 {

	public static void main(String[] args) {
		
		// Declare variable for user input
		int studentNumb;
		double highestScore, classAverage;
		
		// Declare Scanner object for user input:
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter the number of students:
		System.out.print("Enter the number of students: ");
		studentNumb = input.nextInt(); // read input
		System.out.println(" ");
		
		
		// Declare/build arrays based off user input:
		String[] studentName = new String[studentNumb];
		double[] studentScore = new double[studentNumb];
		
		// Call method to initialize arrays based off user input:
		arrayInit(studentName, studentScore, studentNumb, input);
		
		// Close Scanner:
		input.close();

		// Call method that calculates highest score and print it to the screen
		highestScore = getHighestScore(studentScore);
		System.out.println("\nHighest score: " + highestScore);
		
		// Call method that calculates class average and print it to the screen:
		classAverage = getClassAverage(studentScore);
		System.out.println("Class average: " + classAverage);
		
		// Call method to print students below average
		System.out.println(" ");
		printBelowAverage(studentName, studentScore, studentNumb, classAverage);
		
		// Call method to print student with highest score:
		System.out.println(" ");
		printHighScoreStudent(studentName, studentScore, studentNumb, highestScore);
		

	}
	
	/***********************************************************************************************
	 *  
	 *  arrayInit(): When called, this method will prompt user to enter the name and score for each
	 *  			 each student. As the user makes these inputs, the method will read this inputed
	 *  			 data into the name[] and score[] arrays.
	 *  
	 **********************************************************************************************/
		public static void arrayInit(String name[], double score[], int size, Scanner sc)
		{
			// use for-loop to ask user to enter name/scores for students and store
			// data into the corresponding arrays:
			for(int i = 0; i < size; i++)
			{
				System.out.print("Enter student "+ (i + 1) + "'s last name and score: ");
				name[i] = sc.next();
				score[i] = sc.nextDouble();
			}
			
		}
	
	/***********************************************************************************************
	 *  
	 *  getHighestScore: When called, this method will use a for loop to process score[] array and
	 *  			     find/return the highest score in the array.
	 *  
	 **********************************************************************************************/
		public static double getHighestScore(double score[])
		{
			// declare local variable for highestScore
			double highScore = 0;
			
			// use for loop to process scores and find highest score
			for(int i = 0; i < score.length; i++)
			{
				if(score[i] > highScore)
					highScore = score[i];
			}
			
			// return highest score
			return highScore;
		}
		
	/***********************************************************************************************
	 *  
	 *  getClassAverage(): When called, this method will use a for-loop to process the data in the
	 *  				   score[] array, find the sum of scores, and then use the sum to 
	 *  				   calculate/return the average of scores.
	 *  
	 **********************************************************************************************/
		public static double getClassAverage(double score[])
		{
			double average; // local variable to store average
			double sum = 0; // variable to hold sum of scores
			int sampleSize = score.length; // variable to store sample size
			
			// use for loop to find sum of scores:
			for(int i = 0; i < sampleSize; i++)
			{
				sum = sum + score[i];
			}
			
			// find average:
			average = sum / sampleSize;
			
			// return resulting average:
			return average;
			
			
		}
	
	/***********************************************************************************************
	 *  
	 *  printBelowAverage(): When called, this method will use a for loop to process data in the 
	 *  					 scores[] and name[] arrays to check and print to the screen the name
	 *  					 of the students with score lower than avg. 
	 *  
	 **********************************************************************************************/
		public static void printBelowAverage(String name[], double scores[], int size, double avg)
		{
			
			// use for loop to print student names with score below average:
			System.out.print("Students below average: ");
			for(int i = 0; i < size; i++)
			{
				if(scores[i] < avg)
					System.out.print(name[i] + " ");
			}
			
		}
	
	/***********************************************************************************************
	 *  
	 *  printHighScoreStudent(): When called, this method will use a for loop to process data in the 
	 *  					 scores[] and name[] arrays to check and print to the screen the name
	 *  					 of the student(s) with score equal to highestScore.
	 *  
	 **********************************************************************************************/
		public static void printHighScoreStudent(String name[], double scores[], int size, double highestScore)
		{
			
			// use for loop to find student with highest Score:
			System.out.print("Students with the highest score: ");
			for(int i = 0; i < size; i++)
			{
				if(scores[i] == highestScore)
					System.out.print(name[i] + " ");
			}
			
		}
	
}
