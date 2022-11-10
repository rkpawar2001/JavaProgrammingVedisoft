//To Find the Area and Perimeter of Rectangle

import java.util.Scanner;

class Sixth {
    public static void main(String args[]) {
        float width, height, area = 0, perimeter = 0;

        Scanner a = new Scanner(System.in);

        System.out.println("Enter Width :");
        width = a.nextFloat();

        System.out.println("Enter Height :");
        height = a.nextFloat();

        area = (float) (width * height);

        perimeter = (float) (2 * (width + height));

        System.out.println("Area is : " + area);
        System.out.println("Perimeter is : " + perimeter);
    }
}