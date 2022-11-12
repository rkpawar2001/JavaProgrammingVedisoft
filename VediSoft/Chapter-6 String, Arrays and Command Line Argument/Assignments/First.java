// Assignment First

class First {
    public static void main(String args[]) {
        String s1 = "Betty got a bit of bitter better butter";
        System.out.println("Indexes Of 'b' Are: ");
        int a = 0;
        for (int i = 0; i < s1.length(); i++) {
            a = s1.indexOf('b', i);
            if (a == -1)
                break;
            System.out.println(a);
            i = a;
        }
        System.out.println("Indexes Of 't' Are: ");
        int b = 0;
        for (int i = 0; i < s1.length(); i++) {
            b = s1.indexOf('t', i);
            if (b == -1)
                break;
            System.out.println(b);
            i = b;
        }
        String s[] = s1.split(" ");
        System.out.println("Words With Length: ");
        for (String x : s) {
            int y = x.length();
            System.out.println(x + ": " + y);
        }
        System.out.println("Words Starting With 'b' Are: ");
        for (String x : s) {
            boolean c = x.startsWith("b");
            if (c == true)
                System.out.println(x);
        }
    }
}