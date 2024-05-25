/*******************************************************************************************
 * Assignment: Assignment 9 (Employee Class)
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This class holds data about an employee in the software company.
 *              
 *              The class has the following public data fields (you can add more members):
 *              First name
 *              Last name
 *              Department
 *              Job title
 *              Email address
 *              
 *              The class has the following private data fields:
 *              Date of birth
 *              Employee ID
 *              
 *              The class has a default constructor, and getter/setter methods for the
 *              private fields.
 *              
********************************************************************************************/
public class Employee {
	
	// Public fields for the class:
		public String firstName;
		public String lastName;
		public String department;
		public String jobTitle;
		public String emailAddress;
		
	// Private fields for the class:
		private String dateOfBirth;
		private int employeeID;
	
	// Default constructor for the class:
	   Employee()
	   {
		   
	   }
	
	// Mutator method for dateOfBirth:
	   public void dobSetter(String dateOfBirth)
	   {
		   this.dateOfBirth = dateOfBirth;
	   }
	   
	 // Getter method for dateOfBirth:
	   public String getDOB()
	   {
		   return dateOfBirth;
	   }
	 
	 // Mutator method for employeeID:
	   public void idSetter(int employeeID)
	   {
		   this.employeeID = employeeID;
	   }
	  
	 // Getter method for employeeID
	   public int getID()
	   {
		   return employeeID;
	   }
	   

}
