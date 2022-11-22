class Exception2 {
    public static void main(String args[]) {
        int a = 10, b = 0, c = 0;

        try {
            c = a / b;
        } catch (ArithmeticException ae) {
            // TODO: handle exception
            System.out.println("Division by Zero");
            System.out.println(ae.getMessage());
            ae.printStackTrace();
        }
        System.out.println("Result is : " + c);
    }
}
