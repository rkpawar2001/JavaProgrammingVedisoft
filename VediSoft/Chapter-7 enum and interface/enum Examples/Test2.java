class Test2 {
    enum Colors {
        RED("#FF00000"), GREEN("#00FF00"), BLUE("#0000ff");

        Colors(String hexCode) {
            this.hexCode = hexCode;
        }

        public String getHexCode() {
            return hexCode;
        }

        private String hexCode;
    }

    public static void main(String args[]) {
        Colors color = Colors.RED;
        System.out.println(color);
        System.out.println(color.getHexCode());
    }
}
