// Program to find leap year

import java.util.Scanner;

class Seventh {
    public static void main(String args[]) {
        int year;
        Scanner m = new Scanner(System.in);
        System.out.println("Enter Year : ");
        year = m.nextInt();

        if (year % 4 == 0) {
            System.out.println(+year + " is Leap Year");
        }
        // else if (year % 100 == 0) {
        // System.out.println(+year + " is Leap Year");
        // }
        // else if (year % 400 == 0) {
        // System.out.println(+year + " is Leap Year");
        // }
        else
            System.out.println(+year + " is Not Leap Year");
    }
}

// Program to find leap year or not?