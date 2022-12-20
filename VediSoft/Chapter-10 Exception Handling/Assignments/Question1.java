/*
 * Write a program that accepts number as command line argument and
 * display it's square.
 */

class Question1 {
    public static void main(String args[]) {
        int num = 25;

        try {
            num = Integer.parseInt(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Invalid Index");
        } catch (NumberFormatException ae) {
            // TODO: handle exception
            System.out.println("Invalid Format");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Some Error");
        }
        System.out.println("Square: " + Math.pow(num, 2));
    }
}
