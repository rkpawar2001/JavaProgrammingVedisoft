// Program to find largest number in three number

import java.util.Scanner;

class Third {
    public static void main(String args[]) {
        int n1, n2, n3;
        Scanner m = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        n1 = m.nextInt();

        System.out.println("Enter Second Number : ");
        n2 = m.nextInt();

        System.out.println("Enter Third Number : ");
        n3 = m.nextInt();

        if (n1 > n2) {
            System.out.println(+n1 + " is Greater");
        } else if (n2 > n3) {
            System.out.println(+n2 + " is Greater");
        } else if (n3 > n1) {
            System.out.println(+n3 + " is Greater");
        } else
            System.out.println("Equal");
    }
}
