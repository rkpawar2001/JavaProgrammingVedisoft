//Program to find the power of two number

import java.util.Scanner;

class Ten {
    public static void main(String args[]) {
        int num1, num2;

        Scanner as = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        num1 = as.nextInt();
        System.out.println("Enter Second Number : ");
        num2 = as.nextInt();

        long result = 1;

        while (num2 != 0) {
            result *= num1;
            System.out.println(num1);
            --num2;
        }

        System.out.println("Answer = " + result);
    }
}

