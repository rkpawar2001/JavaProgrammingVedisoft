// Program to find the table of given number

import java.util.Scanner;

class Sixteenth {
	public static void main(String args[]) {
		int num, count;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		num = a.nextInt();
		
		for(count=1; count<= 10; count++)
			System.out.println(count+ " * " +num+ " = " +count*num);			
	}
}