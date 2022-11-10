// Program to print All Armstrong number betweeb 1 to 500

class Eighteen {
    public static void main(String[] args) {
        int n, b, sum = 0;
        System.out.println("Armstrong numbers from 1 to 500 : ");
        for (int i = 1; i <= 500; i++) {
            n = i;
            while (n > 0) {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
            sum = 0;
        }
    }
}
