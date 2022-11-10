//program to find reverse of any number

import java.util.Scanner;

class Fourteen {
    public static void main(String[] args) {

        int evenSum = 0, oddSum = 0, number1 = 0, number2;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        number2 = in.nextInt();

        int i = number1;

        while (i <= number2) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
            i++;
        }

        System.out.println("Sum of Even Numbers in Loop: " + evenSum);
        System.out.println("Sum of Odd Numbers in Loop: " + oddSum);
        System.out.println("Sum of All Nuumbers in Loop: " + (evenSum + oddSum));

    }
}

// program to find the sum of even and odd number
