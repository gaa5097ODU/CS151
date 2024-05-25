/*************************************************************************************************************
 * Assignment: Lab 9 Task 2 (RegularPolygon class)
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description: This class contains:
 * 
 * 			A private int data field named n that defines the number of sides in the 
 * 			polygon with default value 3.
 * 
 * 			A private double data field named side that stores the length of the side with 
 * 			default value 1.
 * 
 * 			A private double data field named x that defines the x-coordinate of the polygon’s 
 * 			center with default value 0.
 * 
 * 			A private double data field named y that defines the y-coordinate of the polygon’s 
 * 			center with default value 0.
 * 
 * 			A no arg constructor that creates a regular polygon with default values.
 * 
 * 			A constructor that creates a regular polygon with the specified number of sides and 
 * 			length of side, centered at (0, 0).
 * 
 * 			A constructor that creates a regular polygon with the specified number of sides, length 
 * 			of side, and x coordinates and y coordinates.
 * 
 * 			Accessor and mutator methods for all data fields.
 * 
 * 			getPerimeter() method that returns the perimeter of the polygon.
 * 
 * 			getArea() method that returns the area of the polygon.
 * 
 ************************************************************************************************************/
import java.lang.Math;

public class RegularPolygon {
	
	// Define the private fields of the class and initialize them to their
	// default values:
	private int n = 3;
	private double side = 1.0;
	private double x = 0;
	private double y = 0;
	
	// no arg constructor:
	RegularPolygon()
	{
		
	}
	
	// constructor that creates a regular polygon with the specified number 
	// of sides and length of side, centered at (0, 0).
	RegularPolygon(int n, double side)
	{
		this.n = n; // initialize n
		this.side = side; // initialize side
		// x and y already have default values of 0
	}
	
	// constructor that creates a regular polygon with the specified number of sides, 
	// length of side, and x-coordinates and y-coordinates.
	RegularPolygon(int n, double side, double x, double y)
	{
		this.n = n; // initialize n
		this.side = side; //initialize side
		this.x = x; // initialize x
		this.y = y; // initialize y
	}
	
	// Mutator for n:
	public void setN(int n)
	{
		this.n = n;
	}
	
	// Mutator for side
	public void setSide(double side)
	{
		this.side = side;
	}
	
	// Mutator for x:
	public void setX(double x)
	{
		this.x = x;
	}
	
	// Mutator for y:
	public void setY(double y)
	{
		this.y = y;
	}
	
	// Accessor for n:
	public int getN()
	{
		return n;
	}
	
	// Acccessor for side
	public double getSide()
	{
		return side;
	}
	
	// Accessor for x:
	public double getX()
	{
		return x;
	}
	
	// Accessor for y:
	public double getY()
	{
		return y;
	}
	
	// Method that returns the Perimeter of the polygon:
	public double getPerimeter()
	{
		return n * side;
	}
	
	// Method that returns the area of the polygon:
	public double getArea()
	{
		double area = (n * Math.pow(side, 2.0))/(4 * Math.tan(Math.PI / n));
		return area;
	}
	
}
