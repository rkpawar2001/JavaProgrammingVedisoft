// To find the Area and Circumference of Circle

import java.util.Scanner;

class Fourth {
    public static void main(String args[]) {
        float radius, area = 0, circum = 0;

        Scanner a = new Scanner(System.in);

        System.out.println("Enter Radius :");
        radius = a.nextFloat();

        area = (float) (Math.PI * Math.pow(radius, 2));

        circum = 2 * 3.14f * radius;

        System.out.println("Area is : " + area);
        System.out.println("Circumference is : " + circum);
    }
}
