/*************************************************************************************************************
 * Assignment: Lab 10 Task 2 (Roman class)
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This class contains:
 * 			
 * 				Two private fields: romanNum and decimalNumber
 * 
 * 				A constructor with given Roman number
 * 
 * 				A setter method for the romanNum field
 * 
 * 				romanToDecimalConverter() method to perform the conversion and set value of
 * 				decimalNumber field
 * 
 * 				A public getter method for the romanNum field
 * 
 * 				A public getter method for the decimalNumber field
 * 
 * 			
 ************************************************************************************************************/
public class Roman {
	
	// Private fields:
	   private String romanNum; // for Roman numeral
	   private int decimalNumber; // for decimal number
	   
	// Constructor with given numeral number:
	   public Roman(String romanNum)
	   {
		   this.romanNum = romanNum;
		   romanToDecimalCoverter(); // set decimalNumber
		   
	   }
	   
	// Setter method for romanNum
	   public void setRoman(String romanNum)
	   {
		   this.romanNum = romanNum; // set romanNum
		   romanToDecimalCoverter(); // set decimalNumber
	   }
	
	// Getter method for romanNum:
	   public String getRoman()
	   {
		   return romanNum;
	   }
	   
	// Getter method for decimalNumber
	   public int getDecimal()
	   {
		   return decimalNumber;
	   }
	   
	// Method to convert from Roman to decimal (decimalNumber setter)
	   public void romanToDecimalCoverter()
	   {
		   int sum = 0; // variable to update the sum of the numbers
		   int length = romanNum.length(); // compute the length of the string that holds the roman numeral.
		   int previous = 1000;
		   
		   // Repeat loop as long as i is less than the length of the roman numeral.
		   // This will calculate the corresponding integer value:
		   for(int i = 0; i < length; i++)
		   {
			   switch(romanNum.charAt(i))
			   {
			   		case 'M':
			   			sum = sum + 1000; //add 1000 to the sum
			   			
			   			if(previous < 1000) //if previous digit was less than 1000.
			   				sum = sum - 2*previous; // re-calculate the sum.
			   			
			   			previous = 1000; // update the previous
			   			
			   			break;
			   			
			   		case 'D':
			   			sum = sum + 500; // add 500 to sum.
			   			
			   			if(previous < 500) // if previous digit was less than 500.
			   				sum = sum - 2*previous; // re-calculate the sum.
			   			
			   			previous = 500; // update the previous
			   			
			   			break;
			   			
			   		case 'C':
			   			sum = sum + 100; // add 100 to the sum
			   			
			   			if(previous < 100) // if previous digit was less than 100.
			   				sum = sum - 2*previous; // re-calculate the sum.
			   			
			   			previous = 100; // update the previous
			   			break;
			   			
			   		case 'L':
			   			sum = sum + 50; // add 50 to the sum
			   			
			   			if(previous < 50) // if previous digit was less than 50.
			   				sum = sum - 2*previous; // re-calculate the sum.
			   			
			   			previous = 50; // update the previous
			   			
			   			break;
			   			
			   		case 'X':
			   			sum = sum + 10; // add 10 to the sum
			   			
			   			if(previous < 10) // if previous digit was less than 10.
			   				sum = sum - 2*previous; // re-calculate the sum.
			   			
			   			previous = 10; // update the previous
			   			
			   			break;
		   
			   		case 'V':
			   			sum = sum + 5; // add 5 to the sum
			   			
			   			if(previous < 5) // if previous digit was less than 5.
			   				sum = sum - 2*previous; // re-calculate the sum.
		   
			   			previous = 5; // update the previous
			   			
			   			break;
			   		
			   		case 'I':
			   			sum = sum + 1; // add 1 to the sum.
			   			previous = 1;
			   			break;

			   } /// end of switch statement
			   
		   } /// End of for-loop processing
		   
		   decimalNumber = sum; /// set the value of the private member to the value of the calculated sum.
	   }

}
