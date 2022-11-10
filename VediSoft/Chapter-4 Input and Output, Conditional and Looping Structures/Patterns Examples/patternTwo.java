class patternTwo {
    public static void main(String args[]) {
        int n = 5, i, j;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= (n - i); j++)
                System.out.print(" ");
            for (j = i; j >= 1; j--)
                System.out.print(j);
            System.out.println();
        }
    }
}
