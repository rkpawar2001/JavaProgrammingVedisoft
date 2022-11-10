// Program to find triangle valid or not

import java.util.Scanner;

class Fifth {
    public static void main(String args[]) {
        int n1 = 0, n2 = 0, n3 = 0, angle;

        Scanner m = new Scanner(System.in);
        System.out.println("Enter A value : ");
        n1 = m.nextInt();

        System.out.println("Enter B value : ");
        n2 = m.nextInt();

        System.out.println("Enter C value : ");
        n3 = m.nextInt();

        angle = n1 + n2 + n3;

        if (angle == 180) {
            System.out.println("Valid Triangle");
        } else
            System.out.println("Not Valid Triangle");
    }
}
