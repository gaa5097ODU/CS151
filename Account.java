/*************************************************************************************************************
 * Assignment: Lab 9 Task 1 (Account class)
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This class contains:
 * 
 * 		A private int data field named id for the account (default 0).
 * 		A private double data field named balance for the account (default 0).
 * 		A private double data field named annualInterestRate that stores the current interest rate (default 0)
 * 		A private Date data field named dateCreated that stores the date when the account was created.
 *      A no argument constructor that creates a default account.
 *      A constructor that creates an account with the specified id and initial balance.
 *      The accessor and mutator methods for id, balance, and annualInterestRate.
 *      The accessor method for dateCreated.
 *      A method named getMonthlyInterestRate() that returns the monthly interest rate.
 *      A method named getMonthlyInterest() that returns the monthly interest.
 *      A method named withdraw that withdraws a specified amount from the account.
 *      A method named deposit that deposits a specified amount to the account.
 * 
 ************************************************************************************************************/
import java.util.Date;

public class Account {
	
	// Declare the private fields of the class
	private int id = 0;
	private double balance = 0;
	private double  annualInterestRate = 0;
	private Date dateCreated;

	
	// No-arg constructor:
	Account()
	{
		dateCreated = new Date(); // initialize the date field
	}
	
	Account(int id, double balance, double annualInterestRate)
	{
		this(); // call default constructor to set defaults
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	// Mutator for id:
	public void setID(int id)
	{
		this.id = id;
	}
	
	// Mutator for balance
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	// Mutator for annualInterestRate:
	public void setAnnualInterest(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
	}
	
	// Accessor for id:
	public int getID()
	{
		return id;
	}
	
	// Accessor for balance:
	public double getBalance()
	{
		return balance;
	}
	
	// Accessor for annualInterestRate
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	// Accessor for date created:
	public Date getDateCreated()
	{
		return dateCreated;
	}
	// Method that returns the monthly interest rate:
	public double getMonthlyInterestRate()
	{
		/// Calculate and return monthly interest rate
		return annualInterestRate / 12.0;
		
	}
	
	
	// Method to return the monthly interest 
	 public double getMonthlyInterest()
	 {
		 /// Calculate and return monthly interest:
		 return  balance * (getMonthlyInterestRate() / 100.0);
		 
	 }
	 
	 // Method to wothdraw from account 
	 public void withdraw(double amount)
	 {
		 // subtract withdrawn amount from balance
		 balance = balance - amount;
	 }
	 
	 // Method to deposit into the account 
	 public void deposit(double amount)
	 {
		 // add amount being deposited:
		 balance = balance + amount;
	 }
	 
	 
}
