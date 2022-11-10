// Program to define classes and objects

import java.util.Scanner;

class Rectangle {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int i) {
        width = i;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int i) {
        height = i;
    }

    public void acceptData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Width : ");
        width = in.nextInt();
        System.out.println("Enter Height : ");
        height = in.nextInt();
    }

    public void showData() {
        System.out.println("X : " + width);
        System.out.println("Y : " + height);
    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String args[]) {
        Rectangle r = new Rectangle();
        r.acceptData();
        r.showData();

        System.out.println("Area is : " + r.getArea());
        System.out.println("Perimeter is : " + r.getPerimeter());
    }
}
