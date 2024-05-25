/****************************************************************************************************
 * Assignment: Lab 9 Task 1 (Task1AccountTest)
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description:  This program creates an Account object with an account ID of 1122, a balance of 
 * 				 $20,000, and an annual interest rate of 4.5%. Then the program uses the withdraw 
 * 				 method to withdraw $2,500, then uses the the deposit method to deposit $3,000, 
 * 				 and then prints the balance, the monthly interest, and the date when this account 
 *               was created; by invoking the accessor methods.
 * 
 ***************************************************************************************************/
public class Task1AccountTest {

	public static void main(String[] args) {
		
		// Create Account object with id = 1122, balance = $20,000,
		// and annual interest rate 4.5%
		Account Acct = new Account(1122, 20000, 4.5);
		
		// Withdraw $2,500:
		Acct.withdraw(2500);
		
		// Deposit $3,000:
		Acct.deposit(3000);
		
		// Print data:
		System.out.println("Balance is " + Acct.getBalance()); // print balance
		System.out.println("Monthly interest is: " + Acct.getMonthlyInterest()); // print monthly interest
		System.out.println("This account was created at " + Acct.getDateCreated()); // print date created

	}

}
