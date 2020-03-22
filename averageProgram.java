import java.util.Scanner;

class averageProgram{
	public static void main(String[] args) {
		int counter = 0;
		int numbers;
		int average;
		int total =0;
		int numberRange;

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of the numbers: ");
		numberRange = sc.nextInt();
		System.out.println("Please enter the numbers...");
		while (counter < numberRange) {
			numbers = sc.nextInt();
			total = total+numbers;
			counter++;
		}
		average = total/numberRange;
		System.out.println("Average of total numbers are: "+average);

	}
}