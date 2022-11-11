import java.util.Scanner;

class DataTypes {
    public static void main(String args[]) {
        // Data Types

        int a;
        int b;
        int sum;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a :");
        a = in.nextInt();
        System.out.println("Enter b :");
        b = in.nextInt();

        sum = a + b;

        System.out.println("Sum of " + a + " and " + b + " is " + sum);
    }
}
