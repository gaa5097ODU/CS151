/***************************************************************************************
* Assignment: Lab 3 Task 3
* Name: Gustavo Andia
* Course: CS 151
* Term: Spring 2024
* 
* Purpose: This program prompts the user to enter the lengths of three sides of a
*          triangle (integer numbers) and then outputs a message indicating whether
*          the triangle is a right triangle.

***************************************************************************************/

import java.util.Scanner;
import java.lang.Math;

public class Lsb3Task3 {

	public static void main(String[] args) {
		

      // Declare variables to hold sides of the triangle and store
	  // the calculated sum of squares and individual sides squared.
		 int side_a, side_b, side_c;
		 int square_sumAB, square_sumBC, square_sumAC;
		 int a_squared, b_squared, c_squared;
	
	  // Declare Scanner object to read user input:
		 Scanner input = new Scanner(System.in);

	  // prompt the user to enter three sides of the triangle:
		 System.out.print("Enter the lengths of the sides of a triangle: ");
		 side_a = input.nextInt();
		 side_b = input.nextInt();
		 side_c = input.nextInt();
	
	  // Ensuring user entered valid values for sides of triangle
	  // If not, output error message and terminate program
		 if(side_a <= 0 || side_b <= 0 || side_c <= 0)
		 {
			 System.out.print("ERROR! The sides of a triangle must be positive integers");
			 System.exit(0);
		 }
		 
	  // Close the Scanner 
		 input.close();

	  // calculate all possible sum of squares: a^2 + b^2, b^2 + c^2, a^2 + c^2
	  // We use int casting to convert double returned by pow() to int. Since 
	  // we are dealing with integers, it is ok to truncate decimal part.
		 square_sumAB = (int)(Math.pow(side_a, 2) + Math.pow(side_b, 2));
		 square_sumBC = (int)(Math.pow(side_b, 2) + Math.pow(side_c, 2));
		 square_sumAC = (int)(Math.pow(side_a, 2) + Math.pow(side_c, 2));

	  // calculate each side squared for comparison to corresponding sums of squares
	  // We use int casting to convert double returned by pow() to int. Since 
	  // we are dealing with integers, it is ok to truncate decimal part.
		 a_squared = (int) Math.pow(side_a, 2);
		 b_squared = (int) Math.pow(side_b, 2);
		 c_squared = (int) Math.pow(side_c, 2);

	  // Use if-else statements to output the correct message to the user:
		 if(square_sumAB == c_squared || square_sumAC == b_squared || square_sumBC == a_squared)
		   System.out.println("This is a right triangle"); //if it satisfies right triangle condition.

		 else // if it does NOT satisfy right angle condition:
		   System.out.println("This is NOT a right triangle");
	
	}

}
