/*
 * Write a program that accepts 10 names in an array and
 * display all names in ascending order.
 */

import java.util.Scanner;

class Eight {
    public static void main(String[] args) {
        String names[] = new String[10];
        String temp;

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter Name " + (i + 1) + ":");
            names[i] = in.nextLine();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (names[j - 1].compareTo(names[j]) > 0) {
                    temp = names[j - 1];
                    names[j - 1] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println("\nSorted names are in Ascending Order: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(names[i]);
        }
    }
}