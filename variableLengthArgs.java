class variableLengthArgs
{
	public static void main(String[] args) 
	{
		System.out.println("Average of numbers is: "+ average(43,56,76,8));
	}
	// Here ... means it can take n number of integers as a argument
	public static int average(int...numbers)
	{
		int total = 0;
		for (int x:numbers) 
		{
			// total = total+x;
			total +=x;
		}
		return total/numbers.length;
	}
}