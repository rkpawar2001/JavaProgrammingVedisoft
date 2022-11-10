// Write a program to accepts an RGB value from user and print parts of red, green and blue.
import java.util.Scanner;
class StringFirst {
	public static void main(String args[]) {
		String str = new String();
		Scanner a = new Scanner(System.in);
		System.out.println("Enter RGB Value : ");
		str = a.nextLine();

		String s[] = str.split(",");
		
		System.out.println("Red is : " +s[0]);
		System.out.println("Green is : " +s[1]);
		System.out.println("Blue is : " +s[2]);
	}
}