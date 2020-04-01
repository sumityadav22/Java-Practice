/*
The final keyword in java is used to restrict the user. The java final keyword can be used in many context.
Final can be:

> variable
> method
> class
*/

class javaFinal
{
	public static void main(String[] args) 
	{
		Test testObject = new Test(10);
		for (int i =0;i<5;i++ ) 
		{
			testObject.add();
			System.out.println(testObject);
		}
	}
}


class Test
{
	private int sum;
	// writing final means you can't modify that no matters what
	private final int NUMBER;

	// Contructor
	public Test(int x)
	{
		NUMBER = x;
	}
	public void add(){
		sum += NUMBER;
	}
	public String toString()
	{
		return String.format("sum = %d\n",sum);
	}
}