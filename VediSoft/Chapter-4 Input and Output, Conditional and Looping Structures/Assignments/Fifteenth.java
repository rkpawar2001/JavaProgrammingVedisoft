// Program to find sum and average of multiples from 500 to 600

class Fifteenth {
    public static void main(String args[]) {
        int i, n1 = 500, n2 = 600, sum = 0, avg = 0, factor = 5, n;
        n = n2 - n1 + 1;
        for (i = n1; i <= n2; i++) {
            sum += factor * i;
        }
        avg = sum / n;

        System.out.println("Sum : " + sum);
        System.out.println("Average : " + avg);
    }
}
