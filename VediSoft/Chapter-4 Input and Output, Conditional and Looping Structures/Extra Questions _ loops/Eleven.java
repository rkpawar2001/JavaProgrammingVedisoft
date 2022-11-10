//program to find the number of digits

import java.util.Scanner;

class Eleven {
    public static void main(String[] args) {
        int num, reversed = 0, count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        num = in.nextInt();

        while (num != 0) {

            int digit = num % 10;
            // System.out.println(digit);
            reversed = reversed * 10 + digit;
            // System.out.println(reversed);
            num /= 10;
            // System.out.println(num);
            count++;

        }

        // System.out.println("Reversed Number: " + reversed);
        System.out.println("Number of Digits : " + count);

    }
}