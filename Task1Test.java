/****************************************************************************************************
 * Assignment: Lab 10 Task 1 (Task1Test)
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description:  This program creates two MyDate objects (using new MyDate() and new 
 *               MyDate(34355555133101L)) and displays their year, month, and day. The
 *               program will then use the getter functions to print the year, month,
 *               and day for each of the objects.
 * 
 ***************************************************************************************************/
public class Task1Test {

	public static void main(String[] args) {
		
		// Declare the two MyDate objects:
		MyDate dateObject1 = new MyDate();
		MyDate dateObject2 = new MyDate(34355555133101L);
		
		// Print the data for object 1 to the screen:
		System.out.println("year: " + dateObject1.getYear());
		System.out.println("month: " + dateObject1.getMonth());
		System.out.println("day: " + dateObject1.getDay());
		
		// Print the data for object 2 to the screen:
		System.out.println("year: " + dateObject2.getYear());
		System.out.println("month: " + dateObject2.getMonth());
		System.out.println("day: " + dateObject2.getDay());
		
	}

}
