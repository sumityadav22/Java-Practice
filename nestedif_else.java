/* Nested Statements are , if inside if statements */

class nestedif_else{
	public static void main(String[] args) {
		int age = 10;
		if (age>10) {
		System.out.println("Your age is greater than 10");
		}
		else {
			System.out.println("Your age is less than 10");
			if (age ==10) {	
				System.out.println("This is nested if");
			}
		}
		
	}
}