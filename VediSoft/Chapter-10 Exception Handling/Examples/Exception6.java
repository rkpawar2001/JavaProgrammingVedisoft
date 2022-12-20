class Exception6 {
    /*
     * public static int convert(String s) {
     * int n = 0;
     * try {
     * n = Integer.parseInt(s);
     * } catch (NumberFormatException ne) {
     * // TODO: handle exception
     * System.out.println("INVALID FORMAT");
     * }
     * return n;
     * }
     */
    public static int convert(String s) throws NumberFormatException {
        int n = 0;
        n = Integer.parseInt(s);
        return n;
    }

    public static void main(String args[]) {
        int num = 0;

        try {
            num = Exception6.convert(args[0]);
        } catch (NumberFormatException ne) {
            // TODO: handle exception
            System.out.println("Invalid Format");
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Invalid Index");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Square is : " + Math.pow(num, 2));
    }
}
