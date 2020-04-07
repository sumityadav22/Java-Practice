/*
	Exception handling is the process of responding to exceptions when a computer program runs

	finally: The finally statement lets you execute code, after try...catch, regardless of the result
*/


class JavaExceptions
{
	public static void main(String[] args) 
	{
		// We use try block to catch the error
		try 
		{
	      int[] myNumbers = {1, 2, 3};
	      System.out.println(myNumbers[10]);
	    }
	    // we use catch to execute some code to handle it
	    catch (Exception e) 
	    {
	      System.out.println("Something went wrong.");
	    }
	    finally
	    {
			System.out.println("The 'try catch' is finished.");
		}
	}
}