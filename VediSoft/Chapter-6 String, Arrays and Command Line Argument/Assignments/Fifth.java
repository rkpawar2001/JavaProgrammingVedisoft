/*
 * Write a program that accepts 10 names in an array and
 * display all names that starts with "A".
 */

import java.util.Scanner;

class Fifth {
    public static void main(String[] args) {
        int num[] = new int[10];
        int i, sum = 0, avg = 0;

        Scanner in = new Scanner(System.in);
        for (i = 0; i < num.length; i++) {
            System.out.println("Enter Ten Names " + (i + 1) + ":");
            num[i] = in.nextInt();
            sum += num[i];
        }

        avg = sum / num.length;

        System.out.println("Sum : " + sum);
        System.out.println("Average : " + avg);
    }
}
