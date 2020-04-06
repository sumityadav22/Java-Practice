/*
An interface is a completely "abstract class" that is used to group related methods with empty bodies.
*/


interface Animal
{
	public void Eat(); // interface method (does not have a body)
	public void Sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal
{
	public void Eat()
	{
		System.out.println("Eating");
	}
	public void Sleep()
	{
		System.out.println("Sleeping");
	}
} 




class Index
{
	public static void main(String[] args) 
	{
		Pig pigObj = new Pig(); // Create a object for pig class
		pigObj.Eat();
		pigObj.Sleep();
	}
}