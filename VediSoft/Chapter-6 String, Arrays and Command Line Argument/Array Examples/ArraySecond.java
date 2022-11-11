/*
 * Write a program that initializes an array by multiples of
 * 5 from 100 to 200 and display them.
 */

class ArraySecond {
    public static void main(String args[]) {
        int num[], i, j;

        for (i = 100, j = 1; i < 200; i += 5, j++)
            ;
        num = new int[j];

        for (i = 100, j = 0; i < 200; i += 5, j++)
            ;
        num[j] = i;

        for (j = 0; j < num.length; j++)
            System.out.println(num[j]);
    }
}