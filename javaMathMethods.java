class javaMathMethods{
	public static void main(String[] args) {
		System.out.println();
		System.out.println("Name"+"\t\t\t\t"+"Value");
		System.out.println();
		System.out.println("***************************************");
		

		// returns only positive value
		System.out.println("Absolute"+ "\t\t\t"+Math.abs(-27.7));

		

		// always rounds UP
		System.out.println("Ceil"+ "\t\t\t\t"+Math.ceil(7.4));


		// always rounds DOWN
		System.out.println("Floor"+ "\t\t\t\t"+Math.floor(7.8));


		// takes 2 numbers and gives the maximum number
		System.out.println("Maximum"+ "\t\t\t\t"+Math.max(8.6, 5.2));

		// takes 2 numbers and gives the minimum number
		System.out.println("Minimum"+ "\t\t\t\t"+Math.min(7,8));	

		/* gives two parameter and retuns power
		where fisrt parameter is the value
		and second parameter is the actual power
		exapmle 5^3 can be written as Math.pow(5,3)

		*/
		System.out.println("Power"+ "\t\t\t\t"+Math.pow(5,3));


		// retuns the sqrt
		System.out.println("SqaureRoot"+ "\t\t\t"+Math.sqrt(9));						
	}
}