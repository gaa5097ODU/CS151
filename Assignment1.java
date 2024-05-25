/******************************************************************************
 * Assignment: Assignment 1
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This program  reads in a speed in kilometers per hour (km/h) 
 * and a distance in kilometers, then calculates the equivalent speed in miles 
 * per hour (mph) and the time it takes to travel the given distance at the 
 * entered speed.
 * 
******************************************************************************/

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
		// Declare variables
		double userSpeed, userDistance; // for user input
		double milesSpeed, time; // for calculations
		
		// Declare Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter speed in Km/h:
		System.out.print("Enter the speed in Kilometers per hour: ");
		
		// Store speed value in variable:
		userSpeed = input.nextDouble();
		
		// Prompt user to enter distance in Km:
		System.out.print("Enter the distance in Kilometers: ");
		
		// Store distance value in variable:
		userDistance = input.nextDouble();
		
		// Calculate speed in miles per hour:
		milesSpeed = userSpeed * 0.621371;
		
		// Calculate time to travel given distance:
		time = userDistance / userSpeed;
		
		// Output speed in miles per hour:
		System.out.printf("Speed in miles per hour is %4.2f" , milesSpeed);
		
		// Output time to travel:
		System.out.println("\nThe time to travel " + userDistance + " Kilometers at "
				+ userSpeed + " km/h is " + time + " hours");
		
	}

}
