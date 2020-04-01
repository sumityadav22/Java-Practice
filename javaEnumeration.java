/*
The Enum in Java is a data type which contains a fixed set of constants.
The Java enum constants are static and final implicitly.
Enums are used to create our own data type like classes.
The enum data type (also known as Enumerated Data Type).
Anytime we want to do this we use public enum instead of public class
*/


public class javaEnumeration 
{ 
    enum Color 
    { 
        RED, GREEN, BLUE; 
    } 
  
    // Driver method 
    public static void main(String[] args) 
    { 
        Color c1 = Color.All(); 
        System.out.println(c1); 
    } 
}