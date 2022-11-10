//Program to Take input from the user and print on display

import java.util.Scanner;

class Third {
    public static void main(String args[]) {
        String myName, myAddress, myMobileNo;
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Name : ");
        myName = a.nextLine();
        System.out.println("Enter Address : ");
        myAddress = a.nextLine();
        System.out.println("Enter Mobile Number : ");
        myMobileNo = a.nextLine();

        System.out.println("My Name is : " + myName);
        System.out.println("My Address is : " + myAddress);
        System.out.println("My Mobile Number is : " + myMobileNo);

    }
}
