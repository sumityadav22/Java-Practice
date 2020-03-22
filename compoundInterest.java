/* 

Formula for compound interest
A = P(1+R)^n 
where 
A = Amount
P = Pricipal Amount
R = Rate
n = Number of year

*/


class compoundInterest{
	public static void main(String[] args) {
		double amount;
		double principal = 10000;
		double rate = 0.1;
		System.out.println("Day"+"  "+"Aount");
		for (int day=1;day<=20;day++ ) {
			amount = principal*Math.pow(1+rate,day);
			System.out.println(day+"  "+amount);

		}

	}
}