// Program to find whether entered number is odd or even

import java.util.Scanner;

class First {
    public static void main(String args[]) {
        int n;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        n = r.nextInt();

        if (n % 2 == 0) {
            System.out.println(+n + " is Even Number");
        } else
            System.out.println(+n + " is Odd Number");
    }
}
