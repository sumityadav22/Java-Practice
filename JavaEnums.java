/*
Loop Through an Enum
The enum type has a values() method, which returns an array of all enum constants
*/
public class JavaEnums 
{
  enum Level 
  {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) 
  {
  	for (Level myVar : Level.values()) 
  	{
      System.out.println(myVar);
    }
  }
}
