/*
 * Write a program that accepts 10 names in an array and
 * display all names that starts with "A".
 */

import java.util.Scanner;

class Fifth {
    public static void main(String[] args) {
        String name[] = new String[10];
        int i;

        Scanner in = new Scanner(System.in);
        for (i = 0; i < name.length; i++) {
            System.out.println("Enter Name " + (i + 1) + ":");
            name[i] = in.nextLine();
        }

        System.out.println("Names that Starts with A : " + name[]);
    }
}
