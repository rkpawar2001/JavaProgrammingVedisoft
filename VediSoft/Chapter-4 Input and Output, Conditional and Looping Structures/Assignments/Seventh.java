// Display Temperature from Centigrade to Fahrenheit

import java.util.Scanner;

class Seventh {
    public static void main(String args[]) {
        float temp = 0, fahrenheit;

        Scanner a = new Scanner(System.in);

        System.out.println("Enter Temperature in Centigrade :");
        temp = a.nextFloat();

        fahrenheit = (float) (temp * 9f / 5 + 32);

        System.out.println("Temperature in Fahrenheit : " + fahrenheit);
    }
}
