public class operator {
		public static void main(String[] args) {
				
				double amount = 3565.55;
				double tax = 0.18;
				double total = amount + (tax*amount);
				System.out.println("Total to Pay: \u20b9"+total);
				
				int number = 10;
				int buckets = 3;
				int hashCode = number % buckets; 
				System.out.println("HashCode for number "+number+" with bucket size of "+buckets+" is: "+hashCode);
				
				int eWallet = 500; 
				int myWallet = eWallet; 
				eWallet += 100; 
				System.out.println("eWallet is: "+eWallet);
				
				eWallet %= 7; 
				System.out.println("eWallet now is: "+eWallet);
				int quantity = 1;
				
				quantity++; // postfix
				++quantity; // prefix
				++quantity;
				
				quantity--;
				
				System.out.println("Quantity is: "+quantity); 
				
				System.out.println();
				int value = ++quantity; 
				System.out.println("value is: "+value);
				System.out.println("quantity is: "+quantity);
				
				eWallet = 300;
				int cabFare = 300;
				System.out.println("Can i book a Cab? "+(eWallet >= cabFare));
				
				int promoCode = 101;
				int promoCodeByUser = 201;
				
				System.out.println("Can i get a Dicsount? "+(promoCode == promoCodeByUser));

				System.out.println("Can i book can and get discount? "+ ( (eWallet >= cabFare) && (promoCode == promoCodeByUser) ) );
				
				boolean isGPSEnabled = true;
				System.out.println("Is GPS Enabled: "+isGPSEnabled);
				System.out.println("Is GPS Not Enabled: "+!isGPSEnabled);
		}
}