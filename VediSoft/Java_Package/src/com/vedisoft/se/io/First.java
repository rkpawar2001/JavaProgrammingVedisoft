package com.vedisoft.se.io;

import java.io.*;

public class First {

	public static void main(String[] args) {
		 

        String fname = args[0]; 
 
        boolean b1 = false;
        File f = new File(fname);
        try {
			b1 = f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

        System.out.println("Exists :" + f.exists()); 


        if (f.exists()) { 
        	
        	System.out.println("File name :" + f.getName());
        	System.out.println("Parent:" + f.getParent());
        	System.out.println("Path: " + f.getPath());
        	System.out.println("Last Modified: " + f.lastModified());

        } 
		
		
	}
}
