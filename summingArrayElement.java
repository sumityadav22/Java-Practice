class summingArrayElement{
	public static void main(String[] args) {
		int array_var[] = {21,16,18,23,26};
		int sum = 0;
		for (int counter =0;counter<array_var.length;counter++)
		{
			sum +=array_var[counter];
		}
		System.out.println("The sum of all numbers is :"+sum);
	}
}