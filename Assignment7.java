/*******************************************************************************************
 * Assignment: Assignment 7
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This program prompts the user to enter the number of students in the class.
 *              Then, for each student, the program prompts the user to enter the student's 
 *              name and the number of comments they have posted on the forum (in the range 
 *              of 0 to 100). Once input is collected from the user, the program stores the 
 *              data in two separate arrays: one for student names and another for the number 
 *              of comments. Then, the program sorts and prints a list from the most active 
 *              participant to the least active (from the highest number of comments to the 
 *              lowest) in descending order.
 *              
********************************************************************************************/
import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
	
		// Declare variable to store user input for size of arrays:
		int classSize;
		
		// Declare Scanner object for user input:
		Scanner input = new Scanner(System.in);
		
		// Use do-while loop to take input for class size. Re-prompt for
		// input if user makes an entry less than or equal to 0:
		do
		{
			System.out.print("How many students are in the class? ");
			
			// Read input into the variable:
			classSize = input.nextInt();
			
		}
		while(classSize <= 0);
		
		// Create array to store student names:
		String [] studentNames = new String[classSize];
		
		// Create array to store number of comments:
		int [] commentsNumber = new int[classSize];
		
		// Invoke method to initialize the arrays:
		arraysInit(commentsNumber, studentNames, classSize, input);
		
		// Close the Scanner object:
		input.close();
		
		// Invoke method to sort the array:
		arraysSorter(commentsNumber, studentNames, classSize);
		
		// Invoke method to print arrays:
		arraysPrinter(studentNames, commentsNumber, classSize);
		
		
	}
	
	/*************************************************************************************
	 * arraysInit(): When invoked, this method will prompt the user to enter the name
	 * 				 for each student and the number of comments associated to each.
	 * 				 Then the method will store these entered values in the name[] and
	 * 			     and comm[] arrays appropriately.
	 * 
	 ************************************************************************************/
		public static void arraysInit(int [] comm, String [] name, int size, Scanner read)
		{
			for(int i = 0; i < size; i++)
			{
				// Prompt for and read in student name
				System.out.print("Enter the students name: ");
				name[i] = read.next();
				
				// Prompt for and read in number of comments. Do so via do-while
				// loop to ensure appropriate input is captured:
				do
				{
					System.out.print("Enter the number of comments (0-100): ");
					comm[i] = read.nextInt();
				}
				while(comm[i] < 0 || comm[i] > 100);

			}
			
		 }
		
	/*************************************************************************************
	 * arraysSorter(): When invoked, this method will sort the entries in the name[] and
	 * 				   comment[] arrays from highest to lowest number of comments.
	 * 
	 ************************************************************************************/	
		 public static void arraysSorter(int [] comment, String [] name, int size)
		 {
			// process data through for loop
			for(int i = 0; i < size - 1; i++)
			{
				// Declare and initialize variables to hold information of student
				// with max number of comments. Initialize them to the current ith 
				// object being processed:
				int currMaxIndex = i; // index in array 
				int tempCount = comment[i]; // max number of comments
				String tempName = name[i]; // name of the student with max comments
				
				// Process the rest of the data using nested for loop to find maximum
				// number of comments:
				for(int j = i + 1; j < size; j++)
				{
					if(tempCount < comment[j]) // if max comments on remaining data
					{
						// Update information corresponding to student with max number
						// of comments
						tempName = name[j]; 
						tempCount = comment[j]; 
						currMaxIndex = j;

					}
					
				}
				
				// Case in which the current maximum index is not the ith item in for loop
				if(currMaxIndex != i)
				{
					name[currMaxIndex] = name[i];
					name[i] = tempName;
					
					comment[currMaxIndex] = comment[i];
					comment[i] = tempCount;
					
				}
	
				
			}
			
		 }
		
	/*************************************************************************************
	 * arraysPrinter(): When invoked, this method will print the contents of the name[]
	 *                  and counts[] arrays to the screen.
	 * 
	 ************************************************************************************/	
		 public static void arraysPrinter(String [] name, int [] counts, int size)
		 {
			 System.out.println(" ");
			 System.out.println("Student Participation Report (Most to Least Active):");
			 System.out.printf("%-24s %-24s \n", "Students Name", "Comments");
			 
			 // Use for loop to print arrays to screen
			 for(int i = 0; i < size; i++)
				 System.out.printf("%-24s %-24s \n", name[i], counts[i]);
			 
		 }
		 
		
}

