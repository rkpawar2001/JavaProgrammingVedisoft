class StringBasics {

	public static void main(String args[]) {

		String s1 = new String();
		String s2 = new String("Welcome");

		char c[] = {'W','e','l','c','o','m','e'};

		String s3 = new String(c,3,4);

		byte b[] = {65,66,67,68,69,70};

		String s4 = new String(b,0,5);
		String s5 = new String("Welcome");
		String s6 = "Welcome";

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}