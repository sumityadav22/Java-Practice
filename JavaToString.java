/*The toString() method returns the string representation of the object. If you print any object, java compiler
internally invokes the toString() method on the object. So overriding the toString() method, returns the desired
output, it can be the state of an object etc.*/

class JavaToString
{
	int rollno;  
	String name;  
	String city;  
	  
	JavaToString(int rollno, String name, String city)
	{  
		this.rollno=rollno;  
		this.name=name;  
		this.city=city;  
	}  
	   
	public String toString()
	{	
		//overriding the toString() method  
		return rollno+" "+name+" "+city;  
	}  
	public static void main(String args[])
	{  
		JavaToString s1=new JavaToString(101,"Sumit","Mumbai");  
		JavaToString s2=new JavaToString(102,"Amit","Pune");  
		     
		System.out.println(s1);//compiler writes here s1.toString()  
		System.out.println(s2);//compiler writes here s2.toString()  
	}  
}







/*
Output:
101 Sumit Mumbai
102 Amit Pune
*/