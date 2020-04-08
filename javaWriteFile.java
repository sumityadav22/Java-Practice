/*
	Note: we use the FileWriter class together with its write() method to write some text to the file we created
	in the example above. Note that when you are done writing to the file, 
	you should close it with the close() method
*/


import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class javaWriteFile 
{
  public static void main(String[] args) 
  {
    try
    {
    	/*
			Note: Whichever filename we will give inside the parameter, it will create a new file of that name.
    	*/
		FileWriter myWriter = new FileWriter("my_file.txt");
		/*
			Making the object of 'FileWriter' class and passing it's file_name as a argument
		*/

		myWriter.write("Java is one of the best languages till now!");
		myWriter.close();// Note that when you are done writing to the file, you should close it with the close() method

		System.out.println("Successfully wrote to the file.");
    }
    catch (IOException e) 
    {
	    System.out.println("An error occurred.");
	    e.printStackTrace();
    }
  }
}