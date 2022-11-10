// To Find the Simple and Compound Interest of the given values

import java.util.Scanner;

class Fifth {
    public static void main(String args[]) {
        float principle, rate, time, simple = 0, compound = 0;

        Scanner a = new Scanner(System.in);

        System.out.println("Enter Principle :");
        principle = a.nextFloat();

        System.out.println("Enter Rate :");
        rate = a.nextFloat();

        System.out.println("Enter Time :");
        time = a.nextFloat();

        simple = principle * rate * time;

        compound = (float) (principle * (Math.pow((1 + rate / 100), time)) - principle);

        System.out.println("Simple Interest is : " + simple);
        System.out.println("Compound Interest is : " + compound);
    }
}
