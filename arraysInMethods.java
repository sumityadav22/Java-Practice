class arraysInMethods{
	public static void main(String[] args) 
	{
		int array_var[] = {1,2,3,4,5,6,7};

		my_Method(array_var);
		for (int y:array_var) 
		{
			System.out.println(y);
		}
	}

	// here we are passing a array variable instead of a normal variable
	public static void my_Method(int x[])
	{
		System.out.println("Old arrays are 1,2,3,4,5,6,7");
		System.out.println("New arrays are after adding 5 to each value");
		for (int counter =0;counter<x.length;counter++) 
		{
			// x[counter] = x[counter]+5;
			x[counter]+=5;
		}
	}
}
