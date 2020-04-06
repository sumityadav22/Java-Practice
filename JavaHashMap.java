/*
	Loop Through a HashMap
	Loop through the items of a HashMap with a for-each loop
	Note: Use the keySet() method if you only want the 'keys', and use the values() method if you only want the 'values'
*/
import java.util.HashMap;
class JavaHashMap
{
	public static void main(String[] args) 
	{
		HashMap<String, String> capitalCities = new HashMap<String, String>();
	    // Add keys and values (Country, City) or can (Key, Value)
		
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("India", "Mumbai");
	    System.out.println("Without using for loop");
	    System.out.println(capitalCities);
	    System.out.println();
	    System.out.println("By using for loop and keySet() method");
	    // By using keySet() method
	    for (String i : capitalCities.keySet()) //Note: capitalCities is the object that we have made
	    {
          System.out.println(i);
        }
        System.out.println();
        System.out.println("By using for loop and values() method");
	    // By using values() method
	    for (String i : capitalCities.values()) //Note: capitalCities is the object that we have made
	    {
	      System.out.println(i);
	    }
	}
}