// Program to find the Absolute value of that number

import java.util.Scanner;

class Second {
    public static void main(String args[]) {
        int num;
        Scanner j = new Scanner(System.in);

        System.out.println("Enter Number : ");
        num = j.nextInt();

        if (num < 0) {
            num = (-1) * num;
        }

        System.out.printf("%d ", num);

    }
}