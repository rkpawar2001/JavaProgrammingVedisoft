/*
 * Write a program that accepts a string.
 * The string should have at least 5 characters and
 * should not contain any special character or alphabets except digits
 */

import java.util.Scanner;

class Third {
    public static void main(String args[]) {
        String str = new String();
        Scanner in = new Scanner(System.in);
        main: while (true) {
            System.out.print("Enter String : ");
            str = in.nextLine();

            if (str.length() < 5) {
                System.out.println("Error !! Atleast 5 character is required.");
                continue;
            }
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if ((c >= 0 && c <= 47 || c >= 58 && c <= 127)) {
                    System.out.println("Error !! Special characters or alphabets found.");
                    continue main;
                }
            }
            break;
        }
        System.out.println("Entered String " + str);
    }

}
