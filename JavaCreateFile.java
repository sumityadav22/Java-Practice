import java.io.File;
import java.io.IOException;

class JavaCreateFile
{
	public static void main(String[] args) 
	{
		try
		{
			File fileObj = new File("something.txt");
			if(fileObj.createNewFile())
			{
				System.out.println("File is created !!"+ fileObj.getName());
			}
			else
			{
				System.out.println(" File already exists");	
			}
		}
		catch(Exception e)
		{
			System.out.println("An error occurred");
			/*
				printStackTrace() helps the programmer to understand where the actual problem occurred. 
				It helps to trace the exception. it is printStackTrace() method of Throwable class inherited by every exception class. 
				This method prints the same message of e object and also the line number where the exception occurred.
			*/
			e.printStackTrace();
		}
	}
}