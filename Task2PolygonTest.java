/****************************************************************************************************
 * Assignment: Lab 9 Task 2 (Task2PolygonTest)
 * Name: Gustavo Andia
 * Course: CS 151
 * Term: Spring 2024
 * 
 * Description:  This program creates creates three RegularPolygon objects, created using the 
 * 				 no arg constructor, using RegularPolygon(6, 4), and using 
 * 				 RegularPolygon(10, 4, 5.6, 7.8). For each object, display its perimeter and area.
 * 
 ***************************************************************************************************/
public class Task2PolygonTest {

	public static void main(String[] args) {
		
		// Create three RegularPolygon objects
		RegularPolygon poly1 = new RegularPolygon(); // using no par constructor
		RegularPolygon poly2 = new RegularPolygon(6, 4); // using the second constructor
		RegularPolygon poly3 = new RegularPolygon(10, 4, 5.6, 7.8); // using the third constructor
		
		// Print Permiter/Area for each polygon:
		
		/// Print info for 1st polygon
		System.out.println("Polygon 1 perimeter: " + poly1.getPerimeter());
		System.out.println("Polygon 1 area: " + poly1.getArea());
		
		/// Print info for 2nd polygon 
		System.out.println("Polygon 2 perimeter: " + poly2.getPerimeter());
		System.out.println("Polygon 2 area: " + poly2.getArea());
		
		/// Print info for 3rd polygon
		System.out.println("Polygon 3 perimeter: " + poly3.getPerimeter());
		System.out.println("Polygon 3 area: " + poly3.getArea());
		

	}

}
