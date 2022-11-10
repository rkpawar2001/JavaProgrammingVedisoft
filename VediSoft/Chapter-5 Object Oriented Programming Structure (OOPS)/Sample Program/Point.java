// Program to define classes and objects

import java.util.Scanner;

class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int i) {
        x = i;
    }

    public int getY() {
        return x;
    }

    public void setY(int i) {
        y = i;
    }

    public void acceptData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter X : ");
        x = in.nextInt();
        System.out.println("Enter Y : ");
        y = in.nextInt();
    }

    public void showData() {
        System.out.println("X : " + x);
        System.out.println("Y : " + y);
    }

    public static void main(String args[]) {
        Point p = new Point();
        p.acceptData();
        p.showData();
        Point p1;
        p1 = new Point();
        p1.setX(10);
        p1.setY(20);
        p1.showData();
    }
}
