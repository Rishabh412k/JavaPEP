
// 1.Implement ternary operator.
// 2.If wrong promo code is applied, then tell the user the right promo code.
// 3.Implement a use case i.e., book a cab using OLA/UBER as a case study.


import java.util.Scanner;

class Question1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an amount : ");
		int amount = sc.nextInt();
		
		final int PROMOCODE = 2234;

		if(amount < 100) {
			System.out.println("Amount entered is too low to avail offer on PROMOCODE");
		}
		else if(amount >= 100) {
			System.out.print("Enter your PROMOCODE : ");
			int userInput = sc.nextInt();
			
			String res = (userInput == PROMOCODE) ? "Congrats! You saved Rs.50" : "PROMOCODE invalid!!";
			System.out.println(res);
		}
	}
}