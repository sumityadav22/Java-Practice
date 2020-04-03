/*Syntax
import package.name.Class;   // Import a single class
import package.name.*;   // Import the whole package
To create a package, use the package keyword
*/


/*
Steps to Compile and Run a package
Save the file as JavaPackageClass.java and compile it
> C:\Users\Your Name>javac JavaPackageClass.java

Then compile the package:
> C:\Users\Your Name>javac -d . JavaPackageClass.java

To run the JavaPackageClass.java file, write the following:
> C:\Users\Your Name>java mypack.JavaPackageClass
*/
package mypack;
class JavaPackageClass
{
  public static void main(String[] args)
  {
    System.out.println("This is my first package!");
  }
}