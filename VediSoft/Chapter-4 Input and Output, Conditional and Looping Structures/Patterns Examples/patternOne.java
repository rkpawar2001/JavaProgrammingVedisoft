// Program for pattern
class patternOne {
    public static void main(String args[]) {
        int n = 10, i, j;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
