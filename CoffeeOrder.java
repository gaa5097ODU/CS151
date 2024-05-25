/*******************************************************************************************
 * Assignment: Assignment 8 (CoffeeOrder Class)
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This class encapsulate details about a coffee order. The class contains the
 *              following:
 *              
 *              A String data field for the type of coffee (e.g., Espresso, Cappuccino).
 *              An int data field for the quantity of coffee ordered.
 *              A double data field for the price per cup.
 *              A String data field to indicate whether the coffee is iced or hot.
 *              A default constructor
 *              A mutator method to set the values for each private field
 *              A getter method that for each private field to return their values.
 *                            
********************************************************************************************/
public class CoffeeOrder {
	
	// Declare private fields for the class
	private String coffeeType;
    private int quantity;
    private double pricePerCup;
    private String tempIndicator;
   
    // Default Constructor for the class:
    CoffeeOrder()
    {
    	
    }
    
    // Mutator to set value for coffeeType field:
    public void setCoffeeType(String coffeeType)
    {
    	this.coffeeType = coffeeType;
    }
    
    // Mutator to set value for quantity:
    public void setQuantity(int quantity)
    {
    	this.quantity = quantity;
    	
    }
    
    // Mutator to set value for price per cup:
    public void setPrice(double pricePerCup)
    {
    	this.pricePerCup = pricePerCup;
    }
    
    // Mutator to set value for tempIndicator:
    public void setTemp(String tempIndicator)
    {
    	this.tempIndicator = tempIndicator;
    }
    
    // Getter method to get the coffee type:
    public String getType()
    {
    	return coffeeType;
    }
    
    // Getter method to get the quantity:
    public int getQuantity()
    {
    	return quantity;
    }
    
    // Getter method to get price:
    public double getPrice()
    {
    	return pricePerCup;
    }
    
    // Getter method to get temperature
    public String getTemp()
    {
    	return tempIndicator;
    }
    

}
