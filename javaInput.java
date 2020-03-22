import java.util.Scanner;

class javaInput{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input_number;
		System.out.println("Enter any number: ");
		input_number = sc.nextInt();
		System.out.println("You Entered: "+input_number);
	}
}