class StringBasicMethods {
	public static void main(String args[]) {

		/**
			

		*/
		
		String str = new String("Welcome");
		int a = str.indexOf("e");
		int b = str.indexOf("e",a+1);
		int c = str.lastIndexOf("e");
		int d = str.lastIndexOf("e",c-1);
		int e = str.indexOf("me");
		int f = str.indexOf("zee");
		
		char g = str.charAt(3);
		char h = "Hello".charAt(4);
	}
}