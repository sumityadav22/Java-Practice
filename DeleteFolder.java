/*
	delete a folder however, it must be empty
	we need to pass the full path for deletin a particular folder
	example: C:\\Users\\MyName\\IllegalThreadStateException
*/
import java.io.File;
class DeleteFolder
{
	public static void main(String[] args) 
	{
		File myObj = new File("F:\\DeleteMe"); 
		// use delete method for deleting a folder or a file
	    if(myObj.delete()) 
	    { 
			System.out.println("Deleted the folder: " + myObj.getName());
	    }
	    else 
	    {
			System.out.println("Failed to delete the folder.");
	    } 
	}
}