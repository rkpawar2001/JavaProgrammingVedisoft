// Program to Find Sum, Difference, Product and quotient of two numbers

import java.util.Scanner;

class Eighth {
    public static void main(String args[]) {
        int x, y, sum, difference, product, quotient;

        Scanner a = new Scanner(System.in);

        System.out.println("Enter First Value :");
        x = a.nextInt();

        System.out.println("Enter Second Value :");
        y = a.nextInt();

        sum = x + y;
        difference = x - y;
        product = x * y;
        quotient = x / y;

        System.out.println("Sum : " + sum);
        System.out.println("difference : " + difference);
        System.out.println("product : " + product);
        System.out.println("quotient : " + quotient);
    }
}