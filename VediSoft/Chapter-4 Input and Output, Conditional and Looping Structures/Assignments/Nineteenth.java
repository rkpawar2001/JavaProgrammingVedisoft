// Program to find prime numbers from 100 to 200

class Nineteenth {
    public static void main(String args[]) {
        int f = 1, j;
        int i;
        for (i = 101; i <= 199; i += 2)
        // System.out.println(i);
        {
            f = 1;
            for (j = 3; j < i; j++) {
                if (i % j == 0) {
                    // System.out.println(i);
                    f = 0;
                    break;
                }
            }
            if (f == 1) {
                System.out.println(i);
                f = 1;
            }

        }

    }
}
