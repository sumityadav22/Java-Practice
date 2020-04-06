/*
The ArrayList class is a resizable array
Note : elements can be added and removed from an ArrayList

Example
Create an ArrayList object called cars that will store strings

import java.util.ArrayList; // import the ArrayList class
ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
*/
import java.util.ArrayList;


/*
Add Items
The ArrayList class has many useful methods. For example, to add elements to the ArrayList, use the add() method
*/
public class JavaArrayList 
{
  public static void main(String[] args) 
  {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);

    /*
		Access an Item
		To access an element in the ArrayList, use the get() method and refer to the index number
    */
		System.out.println("Accessing the ArrayList: "+cars.get(0));
	/*
		Change an Item
		To modify an element, use the set() method and refer to the index number
    */
		cars.set(0, "Opel");
		System.out.println("Setting the variable: "+cars);
    /*
		Remove an Item
		To remove an element, use the remove() method and refer to the index number
    */
		cars.remove(0);
		System.out.println("Removing the variable: "+cars);
	
	/*
		To remove all the elements in the ArrayList, use the clear() method:
		cars.clear();
	*/

	/*
		ArrayList Size
		To find out how many elements an ArrayList have, use the size method
	*/
		System.out.println("Size is: "+cars.size());

  }
}