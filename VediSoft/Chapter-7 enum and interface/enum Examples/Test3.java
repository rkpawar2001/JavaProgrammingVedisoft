class Test3 {
    enum Colors {
        RED, GREEN, BLUE
    };

    public static void main(String args[]) {
        for (Colors c : Colors.values())
            System.out.println(c + ":" + c.ordinal());
        System.out.println(Colors.valueOf("RED"));
        System.out.println(Colors.valueOf("YELLOW"));
    }
}
