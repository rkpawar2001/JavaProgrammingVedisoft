package com.vedisoft.jdbc.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateUtils {
	public static java.util.Date acceptDate() {
		java.util.Date dt = null;
		Scanner in = new Scanner(System.in);
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		String str = in.nextLine();
		try {
			dt = df.parse(str);
		} catch (ParseException e) {
			System.out.println("invalid format");
		}
		return dt;
	}

	public static java.util.Date convertDate(String date) {
		java.util.Date dt = null;
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		try {
			dt = df.parse(date);
		} catch (ParseException e) {
			System.out.println("invalid format");
		}
		return dt;
	}
	
	public static java.util.Date convertTime(String date) {
		java.util.Date dt = null;
		SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss");
		try {
			dt = df.parse(date);
		} catch (ParseException e) {
			System.out.println("invalid format");
		}
		return dt;
	}
	public static java.util.Date convertDateAndTime(String date) {
		java.util.Date dt = null;
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		try {
			dt = df.parse(date);
		} catch (ParseException e) {
			System.out.println("invalid format");
		}
		return dt;
	}

}
