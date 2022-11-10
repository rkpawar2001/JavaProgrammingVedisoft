// Program to find the reverse table of given number

import java.util.Scanner;

class Eight {
    public static void main(String args[]) {
        int num, count;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number : ");
        num = in.nextInt();

        for (count = 10; count >= 1; count--)
            System.out.println(+count + " * " + num + " = " + count * num);
    }
}
