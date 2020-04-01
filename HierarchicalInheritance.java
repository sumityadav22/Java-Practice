/*
Syntax of Hierarchical Inheritance in Java:

class Subclassname1 extends Superclassname
{
// variables and methods
}
class Subclassname2 extends Superclassname
{
// variables and methods
}
*/

class A_SuperClass
{
   public void methodA()
   {
      System.out.println("method of Class A");
   }
}
class B_SubClass extends A
{
   public void methodB()
   {
      System.out.println("method of Class B");
   }
}
class C_SubClass extends A_SuperClass
{
  public void methodC()
  {
     System.out.println("method of Class C");
  }
}

class HierarchicalInheritance
{
  public static void main(String args[])
  {
  	// creating objects
     B_SubClass obj1 = new B_SubClass();
     C_SubClass obj2 = new C_SubClass();
     //All classes can access the method of class A
     // calling the methods
     obj1.methodA();
     obj2.methodA();
  }
}