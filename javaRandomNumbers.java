import java.util.Random;

class javaRandomNumbers{
	public static void main(String[] args) {
		Random random_object = new Random();
		int number;
		for (int counter =1;counter<=6;counter++ )
		{
			// This code will take value 0 to 5 it will exclude the 6
			// number = random_object.nextInt(6);
			number = 1+random_object.nextInt(6);
			System.out.println(number+"");
		}		
	}
}