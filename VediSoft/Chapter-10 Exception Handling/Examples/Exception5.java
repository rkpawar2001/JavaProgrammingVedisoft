class Exception5 {
    public static void main(String args[]) {
        int num = 0;

        try {
            num = Integer.parseInt(args[0]);
            if (num > 100) {
                BigException b = new BigException("Number too big");
                num = 0;
                throw b;
            }
        } catch (NumberFormatException ne) {
            System.out.println("Invalid Format");
        }

        catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Invalid Index");
        }

        catch (BigException be) {
            System.out.println(be.getMsg());
        }
        System.out.print("Square is : " + Math.pow(num, 2));
    }
}
