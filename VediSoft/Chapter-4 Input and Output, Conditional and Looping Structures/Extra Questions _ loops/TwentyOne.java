
// Importing Saanner class
import java.util.Scanner;

// Creating Class
class TwentyOne {

    // Creating main method
    public static void main(String[] args) {

        // Declaring all variables
        int n, sum = 0, t, count, num, n1 = 0, n2 = 1, n3, j;
        int fact = 1;
        int choice;
        Scanner scanner = new Scanner(System.in);
        // Creating infinite while loop
        while (true) {

            // Creating menu
            System.out.println(" 1. Table ");
            System.out.println(" 2. Reverse Multiplication Table ");
            System.out.println(" 3. Factorial Value ");
            System.out.println(" 4. Fibonacci Series ");
            System.out.println(" 5. Armstrong Numbers ");
            System.out.println(" 6. Exit ");

            // Asking user to make choice
            System.out.println("Make your choice");
            choice = scanner.nextInt();

            // Creating switch case branch
            switch (choice) {

                // First case for finding the Table
                case 1:
                    Scanner in = new Scanner(System.in);
                    System.out.println("Enter Number : ");
                    num = in.nextInt();

                    for (count = 1; count <= 10; count++)
                        System.out.println(+count + " * " + num + " = " + count * num);
                    break;

                // Second case for finding the Reverse Multiplication Table
                case 2:
                    Scanner as = new Scanner(System.in);
                    System.out.println("Enter Number : ");
                    num = as.nextInt();

                    for (count = 10; count >= 1; count--)
                        System.out.println(+count + " * " + num + " = " + count * num);
                    break;

                // Third case for finding the Factorial Value
                case 3:
                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter a number: ");
                    num = input.nextInt();
                    for (int i = 2; i <= num; i++) {
                        fact = fact * i;
                    }

                    System.out.println("Factorial: " + fact);
                    break;

                // Fourth case for finding the Fibonacci Series
                case 4:
                    Scanner k = new Scanner(System.in);
                    System.out.println("Enter number");
                    num = k.nextInt();

                    System.out.print(+n1 + " " + n2);

                    for (j = 2; j < num; ++j) {
                        n3 = n1 + n2;
                        System.out.print(" " + n3);

                        n1 = n2;
                        n2 = n3;
                    }
                    break;

                // Fifth case for finding the Armstrong Numbers
                case 5:
                    Scanner l = new Scanner(System.in);
                    System.out.println("Enter number");
                    num = l.nextInt();

                    for (int i = 1; i <= num; i++) {
                        n = i;
                        while (n > 0) {
                            t = n % 10;
                            sum = sum + (t * t * t);
                            n = n / 10;
                        }
                        if (sum == i) {
                            System.out.print(i + " ");
                        }
                        sum = 0;
                    }
                    break;

                // Sixth case to quit the program
                case 6:
                    System.exit(0);

                    // default case to display the message invalid choice made by the user
                default:
                    System.out.println("Invalid choice!!! Please make a valid choice. \\n\\n");
            }
        }
    }
}
