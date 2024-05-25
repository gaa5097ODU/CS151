/*************************************************************************************************************
 * Assignment: Lab 10 Task 1 (MyDate class)
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This class contains:
 * 
 * 			The data fields year, month, and day that represent a date
 * 
 * 			A no argument constructor that creates a MyDate object for the current date.
 * 			
 * 			A constructor that constructs a MyDate object with a specified elapsed time since 
 * 			midnight, January 1, 1970, in milliseconds.
 * 
 * 			A constructor that constructs a MyDate object with the specified year, month, and day.
 * 			
 * 			Three getter methods for the data fields year, month, and day, respectively.
 * 
 * 			A method named setDate(long elapsedTime) that sets a new date for the object using the 
 *          elapsed time.
 * 
 ************************************************************************************************************/
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
	
	// Declare the private fields for the class:
	   private int year;
	   private int month;
	   private int day;
	   
	// Non-par constructor:
	   MyDate()
	   {
		   GregorianCalendar date = new GregorianCalendar();
		   year = date.get(Calendar.YEAR);
		   month = date.get(Calendar.MONTH);
		   day = date.get(Calendar.DAY_OF_MONTH);
	   }
	   
	 // Constructor with elapsed time since since midnight, January 1, 1970 as parameter:
	   MyDate(long elapsedTime)
	   {
		   this.setDate(elapsedTime);
	   }
	   
	 // Constructor with specified year, month, and day.
	   MyDate(int year, int month, int day)
	   {
		   this.year = year;
		   this.month = month;
		   this.day = day;
	   }
	   
	   // setDate() method:
	   public void setDate(long elapsedTime)
	   {
		   GregorianCalendar date = new GregorianCalendar();
		   date.setTimeInMillis(elapsedTime);
		   year = date.get(Calendar.YEAR);
		   month = date.get(Calendar.MONTH);
		   day = date.get(Calendar.DAY_OF_MONTH);
	   }
	   
	   // Setter method for year:
	   public void setYear(int year)
	   {
		   this.year = year;
	   }
	   
	   // Getter method for year:
	   public int getYear()
	   {
		   return year;
	   }
	   
	   // Setter method for day:
	   public void setDay(int day)
	   {
		   this.day = day;
	   }
	   
	   // Getter method for day:
	   public int getDay()
	   {
		   return day;
	   }
	   
	   // Setter method for month:
	   public void setMonth(int month)
	   {
		   this.month = month;
	   }
	   
	   // Getter method for month:
	   public int getMonth()
	   {
		   return month;
	   }

}
