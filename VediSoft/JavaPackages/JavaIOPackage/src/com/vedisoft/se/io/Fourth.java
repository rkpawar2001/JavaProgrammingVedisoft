// Write a program that accepts a directory name as command line argument and change all its contents to read
// only mode.

package com.vedisoft.se.io;
import java.io.*;
public class Fourth {

	public static void main(String[] args) {
		// flag variable which contains the boolean
		// value returned by setReadOnly() function
		boolean flag;

		try {
			
			String fname = args[0]; 
			 
			File file = new File(fname);

			// creates a new file
			file.createNewFile();

			// flag the file to be read-only
			flag = file.setReadOnly();

			System.out.println("Is File is read-only ? : " + flag);

			// checking whether Is file writable
			flag = file.canWrite();
			System.out.println("Is File is writable ? : " + flag);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
