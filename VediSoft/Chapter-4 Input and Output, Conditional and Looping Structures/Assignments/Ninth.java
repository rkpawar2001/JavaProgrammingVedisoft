// Program to Find whether it is an UpperCase, LowerCase or a Special character

import java.util.Scanner;

class Ninth {
    public static void main(String args[]) {
        char value;

        Scanner b = new Scanner(System.in);
        System.out.println("Enter a Character : ");
        value = b.nextLine().charAt(0);

        if (value >= 65 && value <= 90)
            System.out.println("Value in UpperCase");

        else if (value >= 'a' && value <= 'z')
            System.out.println("Value in LowerCase");

        else
            System.out.println("Value in Special Character");
    }
}