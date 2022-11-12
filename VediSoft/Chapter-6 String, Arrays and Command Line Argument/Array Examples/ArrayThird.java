/*
 * Write a program that creates matrix of size 4 by 4.
 * Accepts all integer elements and print sum of all rows,
 * all columns and entire matrix.
 */

import java.util.Scanner;

class ArrayThird {
    public static void main(String args[]) {
        int num[][] = new int[4][4];
        int rowSum[] = new int[num.length];
        int columnSum[] = new int[num[0].length];
        int i, j, sum = 0;

        Scanner in = new Scanner(System.in);
        for (i = 0; i < num.length; i++) {
            for (j = 0; j < num[i].length; j++) {
                System.out.println("Enter Number [" + i + "," + j + "] :");
                num[i][j] = in.nextInt();
                sum += num[i][j];
                rowSum[i] += num[i][j];
                columnSum[j] += num[i][j];
            }
        }
        for (i = 0; i < num.length; i++) {
            for (j = 0; j < num[i].length; j++)
                System.out.print("\t" + num[i][j]);
            System.out.println("\t" + rowSum[i]);
        }
        for (j = 0; j < num[0].length; j++)
            System.out.print("\t" + columnSum[j]);
        System.out.println("\t" + sum);

    }
}
