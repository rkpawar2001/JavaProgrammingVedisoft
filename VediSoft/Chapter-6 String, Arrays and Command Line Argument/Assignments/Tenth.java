/*
 * Accept a number as Command Line Arguments and display it's Square
 */

class Tenth {
    public static void main(String args[]) {
        int num = 0;
        if (args.length != 1) {
            System.out.println("Invalid Arguments");
            System.exit(0);
        }
        num = Integer.parseInt(args[0]);
        for (int i = 1; i <= 10; i++)
            System.out.println(num + "*" + num + "=" + num * num);
    }
}
