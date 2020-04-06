/*
	A HashMap, store items in "key/value" pairs

	Example:
	Create a HashMap object called capitalCities that will store String keys and String values

	import java.util.HashMap; // import the HashMap class
	HashMap<String, String> capitalCities = new HashMap<String, String>();
*/

import java.util.HashMap;
class JavaHashMap
{
	public static void main(String[] args) 
	{
		/*
			Add Items
			The HashMap class has many useful methods. For example, to add items to it, use the put() method
		*/
		HashMap<String, String> capitalCities = new HashMap<String, String>();
	    // Add keys and values (Country, City) or can (Key, Value)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("India", "Mumbai");
	    System.out.println(capitalCities);

	    /*
			Access an Item
			To access a value in the HashMap, use the get() method and refer to its key
	    */
		System.out.print("Accessing city of England ->");
	    System.out.println(capitalCities.get("England"));

	    /*
			Remove an Item
			To remove an item, use the remove() method and refer to the key
	    */
		capitalCities.remove("England");
	    System.out.println("After Removing England: "+capitalCities);
	    // To remove all items, use the clear() method
	    // capitalCities.clear();

	    /*
			HashMap Size
			To find out how many items there are, use the size method
	    */
		System.out.println("Size "+capitalCities.size());
	}
}