/*
 * Write a program that accepts 10 names in an array and
 * display all names that ends with "h".
 */

import java.util.Scanner;

class Sixth {
    public static void main(String[] args) {
        String names[] = new String[10];

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter Name " + (i + 1) + ":");
            names[i] = in.nextLine();
        }

        System.out.println("Names that ends with h : ");

        for (int i = 0; i < names.length; i++) {
            boolean c = names[i].endsWith("h");
            if (c == true) {
                System.out.println(names[i]);
            }
        }
    }
}