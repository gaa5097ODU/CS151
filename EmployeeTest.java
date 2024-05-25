/*******************************************************************************************
 * Assignment: Assignment 9
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This program will create an array of Employee class objects and read
 *              data about the Employee from the "input.txt" file into the corresponding
 *              fields of the class object either by doing it directly (for public fields)
 *              or invoking the class' mutator methods (for the private fields). Then,
 *              the program will print the data to the screen by doing it directly (for
 *              public fields) or by invoking class getter methods (for private fields).
 *                            
********************************************************************************************/
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class EmployeeTest {

	public static void main(String[] args) {
		
		// Declare objects for file attributes:
		   String fileName = "input.txt";
		   Scanner inData = null;
		   
		// Read in file:
		   try {
			   inData = new Scanner(new File(fileName));
		   }
		   catch(FileNotFoundException e) {
			   e.getStackTrace();
			   System.out.println("Failure to open the file!");
			   System.exit(0);
		   }
		
		// Declare variable for size of array:
		   final int ARRAY_SIZE = 7;
		   
		// Declare array of Employee objects:
		   Employee[] employeeList = new Employee[ARRAY_SIZE];
		
		// Initialize array by using default constructor:
		   for(int i = 0; i < ARRAY_SIZE; i++)
		   {
			   employeeList[i] = new Employee();
		   }
		   
		// Read the data from the file:
		   while(inData.hasNext())
		   {
			   for(int i = 0; i < ARRAY_SIZE; i++)
			   {
				   employeeList[i].firstName = inData.next();
				   employeeList[i].lastName = inData.next();
				   employeeList[i].department = inData.next();
				   employeeList[i].jobTitle = inData.next();
				   employeeList[i].emailAddress = inData.next();
				   employeeList[i].dobSetter(inData.next());
				   employeeList[i].idSetter(inData.nextInt());
			   }
		   }
		   
		// Close Scanner object
		   inData.close();
		   
		// Print the data to the console:
		   System.out.println("***************************");
		   System.out.println("*    Dominion Software    *");
		   System.out.println("***************************");
		     
		   System.out.printf("\n %-15s %-15s %-15s %-20s %-15s %-10s", "Name", "Department", 
				   "Job Title", "Email", "Date of birth", "ID");
		   
		   System.out.printf("\n %-15s %-15s %-15s %-20s %-15s %-10s", 
				   "============", "==========", "=========", "=====", "=============", "==");
		   for(int i = 0; i < ARRAY_SIZE; i++)
		   {
			   System.out.printf("\n %-15s %-15s %-15s %-20s %-15s %-10s", 
					   employeeList[i].firstName + " " + employeeList[i].lastName,
					   employeeList[i].department, employeeList[i].jobTitle,
					   employeeList[i].emailAddress, employeeList[i].getDOB(),
					   employeeList[i].getID());
		   }
		
	}

}
