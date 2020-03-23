import java.util.Scanner;
class numberSeries{
	public static void main(String[] args) {
		int startRange,endingRange,temp;
		System.out.println("Number Series Program");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Starting Range: ");
		startRange = sc.nextInt();
		System.out.print("Enter The Ending Range: ");
		endingRange = sc.nextInt();
		System.out.println();
		System.out.println("*****Here Is Your Result*****");
		for (temp = startRange;temp<=endingRange;temp++ ) {
			System.out.println(temp);
		}	
	}
}