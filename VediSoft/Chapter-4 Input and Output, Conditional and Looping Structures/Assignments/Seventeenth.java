// Program to find the reverse table of given number

import java.util.Scanner;

class Seventeenth {
	public static void main(String args[]) {
		int num, count;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		num = a.nextInt();
		
		for(count=10; count>= 1; count--)
			System.out.println(count+ " * " +num+ " = " +count*num);			
	}
}