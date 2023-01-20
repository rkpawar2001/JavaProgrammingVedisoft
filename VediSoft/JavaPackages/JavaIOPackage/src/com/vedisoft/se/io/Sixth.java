// 6. Write a program that accepts 2 file names and copy the contents of one file to another. (using BufferedReader
// and BufferedWriter)

package com.vedisoft.se.io;
import java.io.*;

public class Sixth {
	
	   public static void main(String[] args) throws Exception {
	      BufferedWriter out1 = new BufferedWriter(new FileWriter("original.txt"));
	      out1.write("string to be copied\n");
	      out1.close();
	      InputStream in = new FileInputStream(new File("original.txt"));
	      OutputStream out = new FileOutputStream(new File("copied.txt"));
	      byte[] buf = new byte[1024];
	      int len;
	      
	      while ((len = in.read(buf)) > 0) {
	         out.write(buf, 0, len);
	      }
	      in.close();
	      out.close();
	      BufferedReader in1 = new BufferedReader(new FileReader("copied.txt"));
	      String str;
	      
	      while ((str = in1.readLine()) != null) {
	         System.out.println(str);
	      }
	      in.close();
	   }
	}
