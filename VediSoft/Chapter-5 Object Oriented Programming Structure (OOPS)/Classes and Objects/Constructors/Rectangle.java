import java.util.Scanner;

class Rectangle {
    protected int width;
    protected int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void acceptData() {
        Scanner b = new Scanner(System.in);
        System.out.println("Enter Width : ");
        width = b.nextInt();
        System.out.println("Enter Height : ");
        height = b.nextInt();
    }

    public void showData() {
        System.out.println("Width : " + width);
        System.out.println("Height : " + height);
    }

    public int getArea() {
        return width * height;
    }

    // public void setArea(int width, int height) {
    // this.width = width;
    // this.height = height;
    // }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    // public void setPerimeter(int width, int height) {
    // this.width = width;
    // this.height = height;
    // }

    public static void main(String args[]) {
        Rectangle r = new Rectangle();
        Rectangle r1 = new Rectangle(20, 30);

        r.acceptData();
        r.showData();

        // r1.acceptData();
        // r1.showData();

        System.out.println("Area is : " + r.getArea());
        System.out.println("Perimeter is : " + r.getPerimeter());
    }
}
