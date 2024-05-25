/**********************************************************************************************************
 * Assignment: CS 151 Lab Final Exam (House.java)
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This class contains the following attributes for a given house object:
 * 
 * 			    * Private integer fields for: MLS number, year, bedrooms, bathrooms, lot size, and price
 * 
 * 				* A default constructor to initialize the House object
 * 				
 *              * Public setter and getter methods for each of the private fields
 * 
 **********************************************************************************************************/
public class House {
	
	// Declare private members:
	private int mlsNumber;
	private int year;
	private int bedrooms;
	private int bathrooms;
	private int lotSize;
	private int price;
	
	// Default constructor for the class:
	House()
	{
		
	}
	
	// Setter for MlS number:
	public void setMLSNumber(int mlsNumber)
	{
		this.mlsNumber = mlsNumber;
	}
	
	// Getter method for MLS number:
	public int getMLSNumber()
	{
		return mlsNumber;
	}
	
	// Setter method for year:
	public void setYear(int year)
	{
		this.year = year;
	}
	
	// Getter method method for year:
	public int getYear()
	{
		return year;
	}
	
	// Setter method for bedroom numbers:
	public void setBedrooms(int bedrooms)
	{
		this.bedrooms = bedrooms;
	}
	
	// Getter method for bedroom numbers:
	public int getBedrooms()
	{
		return bedrooms;
	}
	
	// Setter method for bathroom numbers:
	public void setBathroom(int bathrooms)
	{
		this.bathrooms = bathrooms;
	}
	
	// Getter method for bathrooms:
	public int getBathrooms()
	{
		return bathrooms;
	}
	
	// Setter method for lot size:
	public void setLotSize(int lotSize)
	{
		this.lotSize = lotSize;
	}
	
	// Getter method for lot size:
	public int getLotSize()
	{
		return lotSize;
	}
	
	// Setter method for price:
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	// Getter method for price:
	public int getPrice()
	{
		return price;
	}
	
}
