/*
 * Write a program that accepts a String from user and perform the following checks :
 *      a. The String should have atleast 6 characters.
 *      b. The string should not have any special characters except @.
 * If any condition is not satisfied appropriate error message should be displayed.
 */

import java.util.Scanner;

class Fourth {
    public static void main(String args[]) {
        String str = new String();
        Scanner in = new Scanner(System.in);
        main: while (true) {
            System.out.print("Enter String : ");
            str = in.nextLine();

            if (str.length() < 6) {
                System.out.println("Error !! Atleast 6 character is required.");
                continue;
            }
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (!(c >= 64 && c <= 90 || c >= 'a' && c <= 'z')) {
                    System.out.println("Error !! Special characters or digits found.");
                    continue main;
                }
            }
            break;
        }
        System.out.println("Great you Passed all the checks");
    }

}