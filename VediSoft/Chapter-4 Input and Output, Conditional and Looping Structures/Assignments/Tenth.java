// Program to Find whether it is an UpperCase, LowerCase or a Special character without using Logical Operators

import java.util.Scanner;

class Tenth {
	public static void main(String args[]) {
		char value;
		Scanner d = new Scanner(System.in);
		System.out.println("Enter a Character : ");
		value = d.nextLine().charAt(0);

		if (value >= 'a') {
			if (value <= 'z')
				System.out.println("LowerCase");
			else
				System.out.println("Special Character");
		} else if (value >= 'A') {
			if (value <= 'Z')
				System.out.println("UpperCase");
			else
				System.out.println("Special Character");
		} else if (value >= '0') {
			if (value <= '9')
				System.out.println("Digits");
			else
				System.out.println("Special Character");
		} else
			System.out.println("Special Character");
	}
}