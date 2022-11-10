// Program to find whether character is Uppercase, Lowercase, Digits or Special character

import java.util.Scanner;

class Eight {
    public static void main(String args[]) {
        int ch;
        Scanner c = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        ch = c.nextLine().charAt(0);

        if (ch >= 'a') {
            if (ch <= 'z')
                System.out.println("LowerCase");
            else
                System.out.println("Special Character");
        } else if (ch >= 'A') {
            if (ch <= 'Z')
                System.out.println("UpperCase");
            else
                System.out.println("Special Character");
        } else if (ch >= '0') {
            if (ch <= '9')
                System.out.println("Digit");
            else
                System.out.println("Special Character");
        } else
            System.out.println("Special Character");
    }
}
