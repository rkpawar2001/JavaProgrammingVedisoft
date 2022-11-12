/*
 * Write a program that accepts a string.
 * The string should have at least 3 characters and
 * should not contain any special character or digits
 */

import java.util.Scanner;

class Second {
    public static void main(String args[]) {
        String str = new String();
        Scanner in = new Scanner(System.in);
        main: while (true) {
            System.out.print("Enter String : ");
            str = in.nextLine();

            if (str.length() < 3) {
                System.out.println("Error !! Atleast 3 character is required.");
                continue;
            }
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (!(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z')) {
                    System.out.println("Error !! Special characters or digits found.");
                    continue main;
                }
            }
            System.out.println("You Entered : " + str);
            break;
        }
    }

}
