package com.vedisoft.se.io;

public class format {

	public static void main(String[] args) {
			int num = 123456;
			float fp = 123456.789f;
			String str = "hello world";
			boolean bool = false;
			char c = 'a';
			System.out.format("\n Number %d \n Decimal %f \n String %s \n Boolean %b \n Character %c", num, fp, str, bool,
					c);
			System.out.format("\n%10.2f", fp);
			System.out.format("\n%f", fp);
			System.out.format("\n%,10.2f", fp);
			System.out.format("\n%0,20.2f", fp);
			System.out.format("\n%20s", str);
			int num1 = -123;
			System.out.format("\n%d", num1);
			System.out.format("\n%(d",num1);
			
		}
}
