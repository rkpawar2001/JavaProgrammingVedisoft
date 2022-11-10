import java.util.Scanner;

class MyClassCtr {
    protected int a;
    protected int b;
    protected static int ctr;

    public MyClassCtr() {
        ctr++;
    }

    public MyClassCtr(int a, int b) {
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
        MyClassCtr x = new MyClassCtr();
        MyClassCtr y = new MyClassCtr(1, 2);
        MyClassCtr z = new MyClassCtr(5, 6);
        System.out.println("Counter is : " + MyClassCtr.getCtr());
    }

}
