public class dataType {
	public static void main(String[] args)
	{
		byte age=35;
		System.out.println("Your age is : "+age);
		age=40;
		System.out.println("your age is: "+age);
		age=(byte)256;
		System.out.println("your age is: "+age);
		short s=120;
		int eWallet=300;
		long phone=987654321L;
		long data=200;
		int number=(int)data;
		//float percentage = 75.7; // percentage -> 32 bits | 75.7 -> 64 bits
		float percentage = 75.7F;
		double discount=0.25;
		float pi=(float)3.14;
		double piAgain=pi;
		char ch=65;//ASCII code
		ch='b';
		System.out.println("ch is: "+ch);
		char ch1 = '\u0939';
		char ch2 = '\u0937';
		char ch3 = '\u093F';
		char ch4 = '\u0954';
		char ch5 = '\u0924';
		System.out.println(ch1+""+ch2+""+ch3+""+ch4+""+ch5);
		boolean internet = true;
		internet = false;
		
		System.out.println("Is internet enabled: "+internet);
		
		
	}

}