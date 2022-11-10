// Program to find number of digits in that integer

import java.util.Scanner;

class Twelfth {
    public static void main(String args[]) {
        char z, count = 0;
        Scanner d = new Scanner(System.in);
        System.out.println("Enter a Character : ");
        z = d.nextLine().charAt(0);

        if (z == 'A' || z == 'E' || z == 'I' || z == 'O' || z == 'U' || z == 'a' || z == 'e' || z == 'i' || z == 'o'
                || z == 'u')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}