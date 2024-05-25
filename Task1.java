/***************************************************************************************
 * Assignment: Lab Midterm Task 1
 * Name: Gustavo Andia
 * Course: CS 151
 * 
 * Description: This program will prompt the user to enter a quantity of items
 * 				being purchased. The program will then display the amount of the
 * 				discount (if any) and the resulting total prices of the purchase.
 * 
 * 				If user buys less than 10 items, no discount
 * 				If user buys 10 to 19 items, 20% discount is applied
 * 				If user buys 20 to 49 items, 30% discount is applied
 * 				If user buys 50 to 99 items, 40% discount is applied
 * 				If user buys more than 100 items, 50% discount is applied
 * 
 * 				Each item retails for $99 per unit.
 * 				
 * 
 ***************************************************************************************/
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		
		// Declare a constant for retail Price;
		final double RETAIL_PRICE = 99.00;
		
		// Declare variables
		int quantity; // for user inputed quantity 
		int percentDisc; // to store the % discount for results
		double totalAmount; // to store final purchase amount 
		double discount; // to store the $ of the discount
		
		
		// Declare Scanner object:
		Scanner input = new Scanner(System.in);
		
		
		// Use do-while loop to ensure user enter valid quantity:
		do
		{
			// Prompt user for input:
			System.out.print("How many packages were purchased? ");
			quantity = input.nextInt();
			
		}
		while(quantity < 0); // no negative quantity is permitted
		
		// close Scanner object
		input.close();
		
		// Use conditional statements to calculate total Amount:
		if(quantity < 10)
		{
			discount = 0;
			percentDisc = 0;
			totalAmount = RETAIL_PRICE * quantity;
		}
		else if(quantity >= 10 && quantity <= 19) // 20% discount case
		{
			discount = 0.2 * (RETAIL_PRICE * quantity);
			percentDisc = 20;
			totalAmount = RETAIL_PRICE * quantity - discount;
		}
		else if(quantity >= 20 && quantity <= 49) // 30% discount case
		{
			discount = 0.3 * (RETAIL_PRICE * quantity);
			percentDisc = 30;
			totalAmount = RETAIL_PRICE * quantity - discount;
		}
		else if(quantity >= 50 && quantity <= 99) // 40% discount case
		{
			discount = 0.4 * (RETAIL_PRICE * quantity);
			percentDisc = 40;
			totalAmount = RETAIL_PRICE * quantity - discount;
		}
		else // 50% discount case
		{
			discount = 0.5 * (RETAIL_PRICE * quantity);
			percentDisc = 50;
			totalAmount = RETAIL_PRICE * quantity -  discount;
		}
		
		// output only if there is a discount:
		if(discount != 0)
		{
			System.out.println("This purchase qualifies for a " + percentDisc + "% discount.");
			System.out.println("The total amount of the discount is $" + (int)(discount));
		}
		
		// Output total (made an int to match formatting)
		System.out.println("The total amount of the purchase is $" + (int)(totalAmount));
		

	}

}
