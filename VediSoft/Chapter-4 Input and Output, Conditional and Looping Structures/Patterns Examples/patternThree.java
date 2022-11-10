// Program for pattern
class patternThree {
    public static void main(String args[]) {
        int n = 10, i, j;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
