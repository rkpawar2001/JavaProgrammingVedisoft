
class TestStaticBlock {
    static int a;

    static {
        a = 10;
        System.out.println("A : " + a);
    }

    public static void main(String args[]) {
        a = 20;
        System.out.println("A : " + a);
    }

    static {
        a = 30;
        System.out.println("A : " + a);
    }
}
