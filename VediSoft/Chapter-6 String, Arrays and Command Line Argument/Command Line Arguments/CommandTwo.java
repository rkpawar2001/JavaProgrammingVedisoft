/*
 * Write a program to accept a number as command line argument and display its table
 */

class CommandTwo {
    public static void main(String args[]) {
        int num = 0;

        if (args.length != 1) {
            System.out.println("Invalid Arguments");
            System.exit(0);
        }
        num = Integer.parseInt(args[0]);
        for (int i = 0; i <= 10; i++)
            System.out.println(num + "*" + i + " = " + num * i);
    }
}