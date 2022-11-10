//program to find number is positive, negative or zero

import java.util.Scanner;

class Fourth {
    public static void main(String args[]) {
        int n1;
        Scanner m = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        n1 = m.nextInt();

        if (n1 < 0) {
            System.out.println(+n1 + " is Negative");
        } else if (n1 > 0) {
            System.out.println(+n1 + " is Positive");
        }
        // else if (n1 == 0) {
        // System.out.println(+n1 + " is Zero");
        else
            System.out.println("Zero");
    }
}