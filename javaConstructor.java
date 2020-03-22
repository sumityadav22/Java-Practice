public class javaConstructor
{

	// Creation of a Constructor
	javaConstructor()
	{
		int num1 = 16;
		int num2 = 10;
		int sum = num1+num2;
		System.out.println("Sum of the given numbers is: "+ sum);
	}

	public static void main(String[] args) 
	{
		/* Creating the object of Constructor
		Note: A Constructor gets called automatically whenever the object is created */
		javaConstructor obj = new javaConstructor();
	}
}