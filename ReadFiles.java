/*
	we use the 'Scanner' class to read the contents of the text file
	here we using 'my_file.txt' file which we had created before.
*/

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
class ReadFiles
{
	public static void main(String[] args) 
	{
		try 
		{

			// create object of 'File' class
	    	File myObj = new File("my_file.txt");
	    	// create obejct of 'Scanner' class i.e myReader and pass the 'File' class object i.e myObj inside in it.
	    	Scanner myReader = new Scanner(myObj);
	    	
	    	while (myReader.hasNextLine()) 
	    	{
	    		String data = myReader.nextLine();
	    		System.out.println(data);
	      	}
	      	myReader.close();
	    } 
	    catch (FileNotFoundException e) 
	    {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	}
}