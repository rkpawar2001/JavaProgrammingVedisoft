import java.util.Scanner;

class ObjectsCount {
    protected int a;
    protected int b;
    protected static int ctr;

    public ObjectsCount() {
        ctr++;
    }

    public ObjectsCount(int a, int b) {
        this.a = a;
        this.b = b;
        ctr++;
    }

    public static int getCtr() {
        return ctr;
    }

    public void getData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A : ");
        a = in.nextInt();
        System.out.println("Enter B : ");
        b = in.nextInt();
    }

    public void showData() {
        System.out.println(" A is : " + a);
        System.out.println(" B is : " + b);
    }

    public static void main(String args[]) {
        ObjectsCount x = new ObjectsCount();
        ObjectsCount y = new ObjectsCount(1, 2);
        ObjectsCount z = new ObjectsCount(5, 6);
        ObjectsCount h = new ObjectsCount(2, 4);
        ObjectsCount k = new ObjectsCount(6, 7);
        ObjectsCount n = new ObjectsCount(9, 9);

        if (getCtr() < 5) {
            System.out.println("Too Less");
        } else if (getCtr() == 5) {
            System.out.println("Will do");
        }

        else
            System.out.println("Exceeding the Limits");

        x.getData();
        x.showData();
    }
}