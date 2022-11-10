// Program to calculate revenue and display net revenue and discount

import java.util.Scanner;

class Sixth {
    public static void main(String args[]) {
        float price, quantity, revenue, discount, netRevenue;
        Scanner m = new Scanner(System.in);
        System.out.println("Enter Product Price Number : ");
        price = m.nextFloat();

        System.out.println("Enter Product Quantity Number : ");
        quantity = m.nextFloat();

        revenue = price * quantity;
        discount = revenue * 10 / 100;
        netRevenue = revenue - discount;

        if (revenue > 5000) {
            System.out.println("Discount = " + discount);
            System.out.println("Net Revenue = " + netRevenue);
        } else
            System.out.println("Revenue = " + revenue);
        // System.out.println("Net Revenue = " + netRevenue);
    }
}
