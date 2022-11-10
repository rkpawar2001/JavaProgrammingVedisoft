// Program to find whether it is a prime number or composite number.

import java.util.Scanner;

class Eighteenth {
	public static void main(String args[]) {
		int num, i;

		Scanner k = new Scanner(System.in);
		System.out.println("Enter Number : ");
		num = k.nextInt();

		for (i = 2; i <= num;) {
			if (num % i == 0)
				System.out.println(num + " is composite number");
			else
				System.out.println(num + " is prime number");
			break;
		}

	}
}