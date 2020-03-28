import java.util.Scanner;


// Static vs. Non-Static
/* 
static void method_name():  means that it 'can' be accessed without creating an object of the class
public void method_name():  means that it 'can not' be accessed without creating an object of the class
*/

class StaticvsPublic{
	Scanner sc = new Scanner(System.in);

	static void staticMethod(){
		System.out.println("Hello World!!");	
	}
	public  void publicMethod(){
		int num1, num2, addition;
		System.out.println("Enter first number: ");
		num1 = sc.nextInt();

		System.out.println("Enter second number: ");
		num2 = sc.nextInt();
		addition = num1+num2;
		System.out.println("Addition is: "+addition);
	}

public static void main(String[] args) {
		StaticvsPublic ts1 = new StaticvsPublic();
		staticMethod();
		ts1.publicMethod();
}
}