/*
 * Write a program that accepts 10 names in an array and
 * display all names that starts with "A".
 */

import java.util.Scanner;

class Fifth {
    public static void main(String[] args) {
        String names[] = new String[10];

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter Name " + (i + 1) + ":");
            names[i] = in.nextLine();
        }

        System.out.println("Names that Starts with A : ");
        char ch;
        ch = 'A';

        for (int i = 0; i < names.length; i++) {
            if (Character.toUpperCase(names[i].charAt(0)) == ch) {
                System.out.println(+(i + 1) + " : " + names[i]);
            }
        }
    }
}