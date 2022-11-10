// Program to find the fibonacci series of 20 elements

class Twentieth {
    public static void main(String args[]) {
        int i, num = 20, n1 = 0, n2 = 1, n3;

        System.out.print(+n1 + " " + n2);

        for (i = 2; i < num; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);

            n1 = n2;
            n2 = n3;
        }
    }
}
