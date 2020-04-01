/*
Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.
The syntax of Java Inheritance
class Subclass-name extends Superclass-name  
{  
   //methods and fields  
}
*/

// This is the example of Single Level Inheritance

class JavaInheritance extends Food
{
	public static void main(String[] args) 
	{

		// Creating the object of Food class
		Food foodObject = new Food();
		// Calling the eat method which is declared inside the Food class
		foodObject.eat();
	}
}