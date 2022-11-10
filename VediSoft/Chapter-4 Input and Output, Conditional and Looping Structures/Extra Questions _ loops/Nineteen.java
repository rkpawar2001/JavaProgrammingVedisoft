
// Program to find the fibonacci series of n terms
import java.util.Scanner;

class Nineteen {
    public static void main(String args[]) {
        int i, num, n1 = 0, n2 = 1, n3;

        Scanner a = new Scanner(System.in);
        System.out.println("Enter number");
        num = a.nextInt();

        System.out.print(+n1 + " " + n2);

        for (i = 2; i < num; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);

            n1 = n2;
            n2 = n3;
        }
    }
}
