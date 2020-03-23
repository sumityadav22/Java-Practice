class enhancedForStatement{
	public static void main(String[] args) {
		int my_array[] = {1,2,3,4,5,6};
		int total = 0;
		// syntax
		// for(type identifire: name_of_array)
		// {
				//statements;
		// }
		for (int x: my_array) {
			// total = total =x;
			total +=x;
		}
		System.out.println("Total is :"+total);
	}
}