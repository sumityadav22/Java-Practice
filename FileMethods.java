/*
	To get more information about a file, use any of the File methods
	Note: we used 'my_file.txt' file which we have created before.
	Some File methods are:
	getName();
	getAbsolutePath();
	canWrite();
	canRead();
	length();
*/

import java.io.File; 
public class FileMethods 
{ 
  public static void main(String[] args) 
  {
    File myObj = new File("my_file.txt");
    if (myObj.exists()) 
    {
    	System.out.println("File name: " + myObj.getName());
    	System.out.println("Absolute path: " + myObj.getAbsolutePath());
    	System.out.println("Writeable: " + myObj.canWrite());
    	System.out.println("Readable " + myObj.canRead());
    	System.out.println("File size in bytes " + myObj.length());
    }
    else 
    {
      System.out.println("The file does not exist.");
    }
  }
}