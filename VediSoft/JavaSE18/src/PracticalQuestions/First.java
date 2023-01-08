/**
 * Write a program that accepts a String as command line arguments
 * and converts it into all wrapper objects and primitive data types.
 * **/

package PracticalQuestions;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s = 0;

		s =  Integer.parseInt(args[0]);
		
		System.out.println(s);
		
		float f  = 0;

		f =  Float.parseFloat(args[0]);
		
		System.out.println(s);

		Integer r = 1;
		
		r = Integer.valueOf(1234);
		
		System.out.println(r);

	}

}
