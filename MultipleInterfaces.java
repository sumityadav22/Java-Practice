/*
To implement multiple interfaces, separate them with a comma
An interface cannot contain a constructor (as it cannot be used to create objects)
*/

interface FirstInterface 
{
  public void myMethod(); // interface method with no body
}

interface SecondInterface 
{
  public void myOtherMethod(); // interface method with no body
}

// implementing more than one interface
class DemoClass implements FirstInterface, SecondInterface 
{
  public void myMethod() 
  {
    System.out.println("Some text..");
  }
  public void myOtherMethod() 
  {
    System.out.println("Some other text...");
  }
}

class MultipleInterfaces 
{
  public static void main(String[] args) 
  {
  	// creating object for DemoClass
    DemoClass myObj = new DemoClass();
    // calling the methods
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}