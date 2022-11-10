// Program to find number of digits in that integer

import java.util.Scanner;

class Eleventh {
    public static void main(String args[]) {
        int num, count = 0;
        Scanner d = new Scanner(System.in);
        System.out.println("Enter an Integer : ");
        num = d.nextInt();

        while (num != 0) {
            num = num / 10;
            ++count;
        }
        System.out.println("Number of Digits : " + count);
    }
}