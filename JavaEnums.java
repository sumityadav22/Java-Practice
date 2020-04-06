/*
Enum in a Switch Statement
Enums are often used in switch statements to check for corresponding values	
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
    switch(myVar) 
    {
      case LOW:
        System.out.println("Low level");
        break;
      case MEDIUM:
         System.out.println("Medium level");
        break;
      case HIGH:
        System.out.println("High level");
        break;
    }
  }
}
