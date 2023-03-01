package com.vedisoft.jdbc.utilities;

import java.sql.*;
import java.util.*;
import java.io.*;

public class MyDatabaseConnection {

	private static Connection connection = null;
	private static MyDatabaseConnection dbConnection = null;

	private void initialize() {
		Properties pro = new Properties();
		InputStream ins = getClass().getResourceAsStream(
				"Connection.properties");
		try {
			pro.load(ins);
			String driver = pro.getProperty("driver");
			String url = pro.getProperty("url");
			String username = pro.getProperty("username");
			String password = pro.getProperty("password");
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException sq) {
			System.out.println("Unable to Create Connection." + sq);
		} catch (ClassNotFoundException cn) {
			System.out.println("Unable to Load Driver Class.");
		} catch (IOException io) {
			System.out.println("Unable to Load Property File.");
		}
	}

	public static Connection getConnection() {
		if (dbConnection == null) {
			dbConnection = new MyDatabaseConnection();
			dbConnection.initialize();
		}
		return connection;
	}

	
	public static void main(String args[]) {
		MyDatabaseConnection db = new MyDatabaseConnection();
		db.initialize();
	}

}
