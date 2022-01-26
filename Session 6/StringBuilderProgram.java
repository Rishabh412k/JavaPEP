class StringBuilderProgram {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Hello World!");
		System.out.println("Length : " + sb.length());
		System.out.println("Capacity : " + sb.capacity());

		System.out.println("\nString before append : " + sb);
		sb.append(" My name is Albert.");
		System.out.println("String after append : " + sb);

		sb.insert(0, "How are you ? ");
		System.out.println("\nAfter insert : " + sb);	

		sb.reverse();
		System.out.println("After reversing the string : " + sb);

		sb.reverse();
		sb.delete(0, 3);
		System.out.println("After deletion : " + sb);

		sb.replace(0, 10, "*");
		System.out.println("After replacement : " + sb);
	}
}