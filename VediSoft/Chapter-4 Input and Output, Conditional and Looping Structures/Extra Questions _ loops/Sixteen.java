
// Program to find HCF of two numbers
import java.util.Scanner;

class Sixteen {
    public static void main(String[] args) {
        int num1, num2, hcf = 0;

        Scanner a = new Scanner(System.in);
        System.out.println("Enter number");
        num1 = a.nextInt();
        System.out.println("Enter number");
        num2 = a.nextInt();

        for (int i = 1; i <= num1 || i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                hcf = i;
        }

        System.out.println("The HCF: " + hcf);
    }
}