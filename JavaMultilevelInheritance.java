/*When there is a chain of inheritance, it is known as multilevel inheritance*/
class Animal
{  
	void eat()
	{
		System.out.println("eating...");
	}  
}  
class Dog extends Animal
{  
	void bark()
	{
		System.out.println("barking...");
	}  
}  
class BabyDog extends Dog
{  
	void weep()
	{
		System.out.println("weeping...");
	}  
}  
class JavaMultilevelInheritance
{  
public static void main(String args[])
{  
	BabyDog d = new BabyDog();  
	d.weep();  
	d.bark();  
	d.eat();  
}
}
