/*
An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables)
To create an enum, use the enum keyword
and separate the constants with a comma. Note that they should be in UPPERCASE letters

Example
enum Level {
  LOW,
  MEDIUM,
  HIGH
}

You can access enum constants with the dot syntax:
Level myVar = Level.MEDIUM;
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
    Level myVar = Level.MEDIUM; 
    System.out.println(myVar);
  }
}
