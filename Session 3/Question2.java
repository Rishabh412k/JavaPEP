

// Explore labels with break & continue and write a program for the same.

class Question2 {
	public static void main(String[] args) {

		int sum = 0;
		first:
		for(int i = 1; i <= 10; i++) {

				if(i <= 3) {
					System.out.println("i = " + i);

				second:
				for(int j = 1; j <= 10; j++) {

					if(j <= 3) {
						continue;
					}
					else if(j > 3 && j < 7){
						System.out.print("j = " + j + " ");
					}
					else {
						break second;
					}
				}
				System.out.println("\n");
			}
			else{
				break first;
			}
		}
	}
}