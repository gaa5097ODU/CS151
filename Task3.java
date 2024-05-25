/****************************************************************************************************
 * Assignment: Lab 8 Task 3
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description:  This program prompts the user to enter two sorted lists and displays 
 *               the merged list. 
 *               
 ***************************************************************************************************/
import java.util.Scanner;

public class Task3 {

		public static void main(String[] args) {
		
			// Declare Scanner object for user input:
			Scanner input = new Scanner(System.in);
			
			// Declare variables to hold size of arrays:
			int size1, size2;
			
			// Prompt user to enter size and elements of list1
			System.out.print("Enter list1 size and contents: ");
			size1 = input.nextInt();
			
			// Declare list1 array:
			int [] list1 = new int[size1];
			
			// Invoke method to read data into list1
			arrayInit(list1, size1, input);
			
			// Prompt user to enter size and elements of list2:
			System.out.print("Enter list2 size and contents: ");
			size2 = input.nextInt();
			
			// Declare list1 array:
			int [] list2 = new int[size2];
			
			// Invoke method to read data into list2
			arrayInit(list2, size2, input);
			
			// Close scanner object:
			input.close();
			
			// Invoke method to print list1
			System.out.print("list1 is ");
			arrayPrinter(list1, size1);
			
			// Invoke method to print list2
			System.out.print("\nlist2 is ");
			arrayPrinter(list2, size2);
			
			// Invoke method to create results:
			int [] mergedArr = merge(list1, list2);
			
			// Invoke method to print mergedArr:
			System.out.print("\nThe merged list is ");
			arrayPrinter(mergedArr, mergedArr.length);

		}

		
		/****************************************************************************************
		 * arrayInit(): When invoked, this array will initialize entries of the array[] being
		 *              passed into it with entries captured with the passed scanner object
		 * 
		 **************************************************************************************/
			public static void arrayInit(int[] array, int size, Scanner inData)
			{
				for(int i = 0; i < size; i++)
				{
					array[i] = inData.nextInt();
				}
			}
		
		/***************************************************************************************
		 * arrayPrinter(): When invoked, this method prints the elements of the passed array
		 * 
		 **************************************************************************************/
			public static void arrayPrinter(int[] array, int size)
			{
				for(int i = 0; i < size; i++)
					System.out.print(array[i] + " ");
			}
		
		/***************************************************************************************
		 * merge(): When invoked, the method takes at most list1.length + list2.length 
		 *          comparisons and merges the two arrays list1 and list2 into a single 
		 *          sorted array that will be returned to the place where the method was
		 *          invoked from.
		 * 
		 **************************************************************************************/
			public static int[] merge(int[] list1, int[] list2)
			{
				// Create array to store the results from the merge:
				int [] result = new int[list1.length + list2.length];
				
				// Create iterators (1 for each array) 
				int[] itr = new int[3];
				
				// While both original arrays have elements that haven't been added:
				while(itr[0] < list1.length && itr[1] < list2.length)
				{
					if(list1[itr[0]] < list2[itr[1]])
						result[itr[2]++] = list1[itr[0]++];
					else
						result[itr[2]++] = list2[itr[1]++];
				}
				
				// copy elements from the remaining array into the merged results array:
				while(itr[0] < list1.length)
					result[itr[2]++] = list1[itr[0]++];
				
				while(itr[1] < list2.length)
					result[itr[2]++] = list2[itr[1]++];
				
				// return array
				return result;
				
			}

}
