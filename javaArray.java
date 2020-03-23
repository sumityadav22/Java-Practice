class javaArray{
	public static void main(String[] args) {
		// array indexes starts with 0
		int my_array[] = new int[5];
		my_array[0] = 1;
		my_array[1] = 2; 
		my_array[2] = 3; 
		my_array[3] = 4; 
		my_array[4] = 5;
		// array will not accept this value it will throw and error ArrayIndexOutOfBoundsException
		// my_array[5] = 6;
		System.out.println("Array value is "+my_array[2]);
		
		//  Or we can simply can do
		// This is called as array initializer method
		int my_array2[] = {1,2,3,4,5,6,7,8};
		System.out.println("From my_array2 the value is "+my_array2[5]);

	}
}