// To delete a file in Java, use the delete() method
import java.io.File;  // Import the File class
class DeleteFile
{
	public static void main(String[] args) 
	{
		// create object called myObj for 'File' class
		File myObj = new File("my_file.txt");	
		if (myObj.delete()) 
		{ 
			System.out.println("Deleted the file: " + myObj.getName());
	    }
	    else 
	    {
	    	System.out.println("Failed to delete the file.");
	    } 
	}
}