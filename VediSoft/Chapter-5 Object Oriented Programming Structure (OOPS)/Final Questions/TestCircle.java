import java.util.Scanner;

class TestCircle {
    protected float radius;
    protected final static float PI = 3.14f;

    public TestCircle() {
    }

    public TestCircle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius() {
        this.radius = radius;
    }

    public void getData() {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Radius : " + radius);
        radius = a.nextFloat();
    }

    public void showData() {
        System.out.println("Radius is " + radius);
    }
}
