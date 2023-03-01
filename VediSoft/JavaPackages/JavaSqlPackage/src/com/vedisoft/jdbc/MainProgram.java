package com.vedisoft.jdbc;

import com.vedisoft.jdbc.utilities.MyDatabaseConnection;
import com.vedisoft.jdbc.pojos.*;
import com.vedisoft.jdbc.daos.*;
import java.sql.*;
import java.util.*;
import java.util.Date;
import com.vedisoft.jdbc.utilities.*;

public class MainProgram {
		
	public void showMenu() {
		Scanner scanner = new Scanner(System.in);
		String menu = "Menu:\n" + "a. Add New Department\n" + "b. Add New Employee\n" + "c. Display All Employee\n"
				+ "d. Display All Departments\n" + "e. Modify Employee Details\n" + "f. Remove Employees\n"
				+ "g. Search Employee By Name\n" + "h. Search Employee By Department\n"
				+ "i. Search Employee By Salary\n" + "j. Exit\n" + "Enter your choice: ";
		while (true) {
			System.out.print(menu);
			String choice = scanner.nextLine();
			switch (choice) {
			case "a":
				DepartmentDao.createDepartment();
				break;
//			case "b":
//				addEmployee();
//				break;
			case "q":
				System.out.println("Goodbye!");
				return;
			default:
				System.out.println("Invalid choice!");
			}
		}
	}
	
	
	public static void main(String[] args) {
		MainProgram main = new MainProgram();
		main.showMenu();
		Department department = new Department();
		DepartmentDao departmentDao = new DepartmentDao();

	}
}