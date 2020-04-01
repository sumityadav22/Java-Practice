

/*
When a variable is declared as static, then a single copy of the variable is created and shared among all objects at
a class level. Static variables are, essentially, global variables. 
All instances of the class share the same static variable.

Static variable Syntax
static data_type variable_name;
*/


class javaStaticVariables
{
	static int count=0;
	   public void increment()
	   {
	       count++;
	   }
	   public static void main(String args[])
	   {
	       javaStaticVariables obj1=new javaStaticVariables();
	       javaStaticVariables obj2=new javaStaticVariables();
	       obj1.increment();
	       obj2.increment();
	       System.out.println("Obj1: count is="+obj1.count);
	       System.out.println("Obj2: count is="+obj2.count);
	   }
}



/*
As you can see in the above example that both the objects are sharing a same copy of static variable 
that’s why they displayed the same value of count.
*/